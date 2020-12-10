import os

import xlsxwriter
import pandas as pd
import re

direct = r"C:\Users\schei008\.matplotlib\Documents\github\QuAnGIS\WorkflowSynthesis\flowmap"


def makefile():
    evaldirs=[]
    for root, dirs, files in os.walk(direct):
        for name in dirs:
            #print(os.path.join(root, name))
            if "solution" in name and "11b" not in name:
                #print(name.split("solution")[1])
                evaldirs.append(name)

    evaldirs = sorted(evaldirs, key=lambda x: float((x.replace('bench', '') if 'bench' in x else (x.replace('graph', '') if 'graph' in x else x)).split("solution")[1]))
    print(evaldirs)
    solutions = {}
    for ed in evaldirs:
        path = os.path.join(direct, ed)
        sol = open(os.path.join(path,'solutions.txt'), 'r')
        Lines = sol.readlines()
        solution = []
        solnr = 0
        for l in Lines:
            wf = l.split()
            startdata ={}
            tools = {}
            for wfn in wf:
                #print(wfn)
                #Getting inputdata
                if "(MemT0." in wfn:
                    a = wfn.split("(MemT0.")
                    inputnumber = a[1][0:-1]
                    if "#" in a[0]:
                        inputtype = (a[0]).split("#")[1]
                    else:
                        inputtype = (a[0])
                    if inputnumber in startdata.keys():
                        startdata[inputnumber].append(inputtype)
                    else:
                        startdata[inputnumber] = [inputtype]
                #Getting tools
                if "[tool]" in wfn:
                    tool = wfn.split("[tool]")[0]
                    toolname = tool.split("#")[1]
                    toolnumber = wfn.split("[tool]")[1][1:-1]
                    tools[toolnumber] = toolname
                    #print(toolname)
                    #print(toolnumber)
            solution.append([startdata,tools])
        solutions[ed]=solution
    print(solutions)

    workbook = xlsxwriter.Workbook(os.path.join(os.path.join(direct, "evaluation"),'evaluation.xlsx') )
    worksheetccd = workbook.add_worksheet("eval")
    #worksheetbench = workbook.add_worksheet("Bench")

    #for sols in solutions:

    columns = ["Workflow task", "Data inputs", "Solution NR", "Workflow length", "Used tools", "Syntax error","Semantic error","Redundancy error","Data quality error","Expert solution"]
    for ix, c in enumerate(columns):
        worksheetccd.write(0, ix, c)

    pointer = 1
    for task in evaldirs:
        sols = solutions[task]
        solsize = len(sols)
        for six, s in enumerate(sols):
            worksheetccd.write(pointer, 0, task) #task
            data = " ".join([str(int(k)+1)+":"+"|".join((s[0])[k]) for k in s[0].keys()])
            worksheetccd.write(pointer, 1, data) #data inputs
            worksheetccd.write(pointer, 2, six+1) #solution nr
            worksheetccd.write(pointer, 3, len(s[1].keys())) #workflow length
            tools = " ".join([t+":"+s[1][t] for t in s[1].keys()])
            worksheetccd.write(pointer, 4, tools) #used tools
            pointer += 1

    workbook.close()

def summarize(file='Evaluation.xlsx'):
    evaluationfile = os.path.join(os.path.join(direct, "evaluation/ExpertWorkflows"),file)
    df = pd.read_excel(evaluationfile)

    df["Task"] = df.apply( lambda x: int(re.findall("\d+", x["Workflow task"].split('solution')[1])[0]), axis = 1)
    #df = df.sort_values(by = ['sort'])
    df["Hard error"] = df["Semantic error"] | df["Syntax error"].astype(int)
    df["Correct"] = (df["Hard error"]==0).astype(int)
    df["Redundant"] = (df["Redundancy error"] & df["Correct"]).astype(int)
    df["Expert order"] = df.apply(lambda x: (x["Solution NR"]+1 if x["Expert solution"]==1  else 6), axis = 1 )
    grouped = df.groupby(['Task', "Workflow task"]).agg(
        {
        "Task" : "count",
        "Workflow length": "mean",
        "Semantic error": "sum",
        "Syntax error": "sum",
        "Hard error" : "sum",
        "Correct" : "sum",
        "Redundant" : "sum",
        "Expert solution": "sum",
        "Expert order" : "min"
        }
    ).rename(columns={'Task': 'Number',"Workflow task": 'Variant', 'Workflow length': 'Avg length'})
    grouped = grouped[["Number", "Avg length", "Semantic error", "Syntax error", "Correct", "Redundant", "Expert solution", "Expert order"]]

    solution = grouped[~(grouped.index.get_level_values(1).str.contains("bench|graph"))]
    #bench = grouped[grouped.index.get_level_values(1).str.contains("bench")]
    graph = grouped[grouped.index.get_level_values(1).str.contains("graph")]
    for gr in [solution, graph]:
        first = gr.index.get_level_values(1)[0]
        print("bench" if "bench" in first else ("graph" if "graph" in first else "solution"))
        print("sum: " +str(gr['Number'].sum()))
        print("mean length: "+str(gr['Avg length'].mean()))
        print("semantic sum: "+str(gr["Semantic error"].sum()))
        print("syntax sum: "+str(gr["Syntax error"].sum()))
        print("correct sum: "+str(gr["Correct"].sum()))
        print("redundant sum: "+str(gr["Redundant"].sum()))
        print("expert sum: "+str(gr["Expert solution"].sum()))
        print("expert rank mean: "+str(gr["Expert order"].mean()))

    #print(grouped)
    print(grouped.to_latex(column_format='lp{1.8cm}lp{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}'))

summarize("EvaluationGraph.xlsx")
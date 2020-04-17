import requests
import arcpy
import pandas as pd

startpoints = r'C:/Gi Minor/GeoAssignment/Data/GEBIED_BUURTEN_EXWATER.shp'
endpoints = r'C:/Gi Minor/GeoAssignment/Data/Onderwijsinstellingen/University_amsterdam2.shp'

startpointX = []
startpointY = []

endpointX = []
endpointY = []

for row in arcpy.da.SearchCursor(startpoints, ['SHAPE@XY']):
    x, y = row[0]
    startpointX.append(x)
    startpointY.append(y)
field = 'Buurt'
buurtnaam = [row[0] for row in arcpy.da.SearchCursor(startpoints, field)]


CostList = []

"""Start Loop of the api calls"""
apilooptimer = 0
indstart = 0
indend = 14

while apilooptimer < 100: 

    startpointstr = str()
    endpointstr = str()

    coorindex = 0
    coorindex2 = 0
    
    for i in xrange(len(startpointX)):
        if i >= indstart and i <= indend:
            startpointstr += '&start'+str(coorindex)+'='+str(startpointY[i])+','+str(startpointX[i])
            coorindex += 1
    for row in arcpy.da.SearchCursor(endpoints, ['SHAPE@XY']):
        x, y = row[0]
        endpointstr += '&destination'+str(coorindex2)+'='+str(y)+','+str(x)
        coorindex2 += 1
    
    ApiTest = requests.get('https://matrix.route.api.here.com/routing/7.2/calculatematrix.json?app_id=lRoKXsNtW71YTKjzlPvU&app_code=fIcylDflsVOA9icHLWYjEw'+startpointstr+endpointstr+'&mode=fastest;car;traffic:disabled')
    TestDir = ApiTest.json()
        
    ApiListindex = 0

    costFactorlist = []
    Highcost = ()

# Maybe the while has to be different
    while ApiListindex <= len(endpointX):
        for entry in TestDir['response']['matrixEntry']:
            if entry['startIndex'] == ApiListindex:
                costFactorlist.append(entry['summary']['costFactor'])
                
# for average cost: sum(costFactorlist)/len(costFactorlist)
# for lowest cost: min(costFactorlist)
        Highcost = sum(costFactorlist)/len(costFactorlist)
        CostList.append(Highcost)
        costFactorlist = []
        Highcost = ()
        ApiListindex += 1

    indstart +=15
    indend +=15
    apilooptimer +=1

"""End of Loop"""

Database = {}
number = 0
while number <476:
    Database[buurtnaam[number]] = CostList[number]
    number += 1
df = pd.DataFrame.from_dict(Database, orient="index")


df.to_excel("C:/Gi Minor/GeoAssignment/Data/Travelcost_Data/travelcostUNI.xls")

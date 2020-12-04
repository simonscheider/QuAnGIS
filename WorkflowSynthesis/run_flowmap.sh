
ape="APE-1.0.1_patch-executable.jar"
exec &> flowmap_log.txt

for q in $(seq 1 12); do 	
	#rm -f "./flowmap/solution${q}/Figures/*"	
	#rm -f "./flowmap/solution${q}graph/Figures/*"
    #config="./flowmap/ape${q}.configuration"
    #java -jar $ape $config   
	config="./flowmap/ape${q}graph.configuration"
	java -jar $ape $config 
    
done


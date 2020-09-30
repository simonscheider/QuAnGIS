
ape="APE-1.0.1_patch-executable.jar"

for q in $(seq 1 1); do 	
	#rm -f "./flowmap/solution${q}/Figures/*"	
    #config="./flowmap/ape${q}.configuration"
    #java -jar $ape $config   
	config="./flowmap/ape${q}bench.configuration"
	java -jar $ape $config 
    
done


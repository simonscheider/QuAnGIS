
ape="APE-1.0.1_patch-executable.jar"
exec &> retrieval_log.txt

#for q in $(seq 1 12); do 	
	#rm -f "./flowmap/solution${q}/Figures/*"	
	#rm -f "./flowmap/solution${q}graph/Figures/*"
    #config="./flowmap/ape${q}.configuration"
    #java -jar $ape $config   
config="./retrievalsynth/ape.configuration"
java -jar $ape $config 
    
#done


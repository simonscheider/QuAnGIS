
ape="APE-1.0.1_patch-executable.jar"
exec &> flowmap_log.txt


	rm -f "./flowmap/test/Figures/*"	
	rm -f "./flowmap/testbench/Figures/*"
    config="./flowmap/apetest.configuration"
    java -jar $ape $config   
	config="./flowmap/apetestbench.configuration"
	java -jar $ape $config 

for q in $(seq 1 12); do 	
	rm -f "./flowmap/solution${q}/Figures/*"	
	rm -f "./flowmap/solution${q}bench/Figures/*"
    config="./flowmap/ape${q}.configuration"
    java -jar $ape $config   
	config="./flowmap/ape${q}bench.configuration"
	java -jar $ape $config 
    
done


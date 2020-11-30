
ape="APE-1.0.1_patch-executable.jar"
exec &> flowmap_log.txt

for q in $(seq 0 0); do 	
	rm -f "./flowmap/solution${q}/Figures/*"	
	rm -f "./flowmap/solution${q}bench/Figures/*"
    config="./flowmap/ape${q}.configuration"
    java -jar $ape $config   
	config="./flowmap/ape${q}bench.configuration"
	java -jar $ape $config 
    
done

config="./flowmap/ape11b.configuration"
java -jar $ape $config
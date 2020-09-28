
ape="APE-1.0.1_patch-executable.jar"

for q in $(seq 1 6); do 		
    config="./flowmap/ape${q}.configuration"
    java -jar $ape $config        
    
done


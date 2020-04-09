#!/bin/bash

# Run APE for all questions, for both ontologies.

ape="APE-0.9.2.jar"

for q in $(seq 1 1); do
    for o in full; do
        config="./q${q}_${o}/ape.configuration"
        java -jar $ape $config        
    done
done

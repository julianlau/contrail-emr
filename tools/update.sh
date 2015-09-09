#!/bin/bash
     for fl in *.java; do
     mv $fl $fl.old
     sed 's/FileSystem.get(conf).delete(/FileSystem.get(new java.net.URI(outputPath), conf).delete(/g' $fl.old > $fl
     rm -f $fl.old
     done

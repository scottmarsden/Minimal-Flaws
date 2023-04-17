#!/bin/bash

echo "aesGCMNoPadding"

./clean.sh

javac CipherExample.java CipherPack.java
jar cvfe example.jar CipherExample CipherExample.class

rm -rf *.class
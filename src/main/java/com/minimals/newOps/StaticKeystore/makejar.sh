#!/bin/bash

echo "BaseCase"

./clean.sh

javac Static.java
jar cvfe example.jar Static Static.class

rm -rf *.class
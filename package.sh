#!/bin/bash
if [ ! -d packages ]
then
mkdir packages
fi

#Source
jar --no-manifest --create  --file packages/com-thierryleroy-modulejava-helloworld-0.1.0-sources.jar -C source/com.thierryleroy.modulejava.helloworld .
jar --no-manifest --create --file packages/com-thierryleroy-modulejava-helloworld-french-0.1.0-sources.jar -C source/com.thierryleroy.modulejava.helloworld.french .
#Classes
jar --create --file packages/com-thierryleroy-modulejava-helloworld-0.1.0.jar -C classes/com.thierryleroy.modulejava.helloworld .
jar --create --file packages/com-thierryleroy-modulejava-helloworld-french-0.1.0.jar -C classes/com.thierryleroy.modulejava.helloworld.french .
#Doc
jar --no-manifest --create  --file packages/com-thierryleroy-modulejava-helloworld-0.1.0-javadoc.jar -C javadoc/com.thierryleroy.modulejava.helloworld .
jar --no-manifest --create --file packages/com-thierryleroy-modulejava-helloworld-french-0.1.0-javadoc.jar -C javadoc/com.thierryleroy.modulejava.helloworld.french .


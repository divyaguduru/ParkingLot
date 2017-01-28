#!/bin/sh


script=$(readlink -f "$0")
cuurent_directory=$(dirname "$script")

if [[ $1 =~ .*txt* ]]
then
    javapath=/c/Program\ Files/java/jdk1.8.0_101
    JAVA_HOME=$javapath
    CLASSPATH=/c/Users/divya.guduru/Desktop/parkinglot.jar
    NEWPATH=/c/Program\ Files/java/jdk1.8.0_101/bin/java
    java -cp $CLASSPATH main.org.parkingsystem.impl.AppLauncher $0 $1 $2
else
 while true; do
	 read commandInput
	 if [[ $commandInput =~ .*exit* ]]
	 then
	     exit
	 else
		 javapath=/c/Program\ Files/java/jdk1.8.0_101
		 JAVA_HOME=$javapath
		 CLASSPATH=/c/Users/divya.guduru/Desktop/parkinglot.jar
		 NEWPATH=/c/Program\ Files/java/jdk1.8.0_101/bin/java
		 out=$(java -cp $CLASSPATH main.org.parkingsystem.impl.AppLauncher $commandInput)
		 echo "$out"
	 fi
 done
fi

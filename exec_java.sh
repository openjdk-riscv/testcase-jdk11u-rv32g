#!/bin/sh

RV32_JAVA_HOME=

if [ ! -n "$RV32_JAVA_HOME" ];then
    echo "Please designate RV32_JAVA_HOME path."
    exit 1
fi

$RV32_JAVA_HOME/bin/javac -d . *.java
echo "success exec javac to compile all class file."

$RV32_JAVA_HOME/bin/java  Launcher
echo "success invoke Launcher."

rm -rf *.class
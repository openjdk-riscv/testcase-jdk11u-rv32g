#!/bin/sh

# this JAVA_HOME should be RV32G java home path
export JAVA_HOME=

if [ ! -n "$JAVA_HOME" ];then
    echo "Please designate JAVA_HOME path."
    exit 1
fi
echo "JAVA_HOME:" ${JAVA_HOME}

bash ./mvnw clean test
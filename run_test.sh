#!/bin/sh

export JAVA_HOME=/Users/zifeihan/program/zulu-11.jdk
echo "JAVA_HOME:" ${JAVA_HOME}

bash ./mvnw clean test
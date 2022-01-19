#!/bin/sh


RV32_QEMU=
RV32_SYSROOT=
RV32_JAVA_HOME=

if [ ! -n "$RV32_QEMU" ];then
    echo "Please designate RV32_QEMU path."
    exit 1
fi

if [ ! -n "$RV32_SYSROOT" ];then
    echo "Please designate RV32_SYSROOT path."
    exit 1
fi

if [ ! -n "$RV32_JAVA_HOME" ];then
    echo "Please designate RV32_JAVA_HOME path."
    exit 1
fi

$RV32_QEMU -L $RV32_SYSROOT $RV32_JAVA_HOME/bin/javac -d . *.java
echo "success exec javac to compile all class file."

$RV32_QEMU -L $RV32_SYSROOT $RV32_JAVA_HOME/bin/java  Launcher
echo "success invoke Launcher."

rm -rf *.class
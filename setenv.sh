#!/usr/bin/env bash

export JAVA_HOME=/usr/lib/jvm/graalvm-ce-19.2.0.1

export GRAALVM_HOME=$JAVA_HOME

export PATH="$JAVA_HOME/bin:$HOME/.local/bin:$HOME/bin:$PATH"

echo $JAVA_HOME

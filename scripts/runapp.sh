#!/usr/bin/env bash
echo 'Starting Spring Boot app'
cd ~/hello
nohup java -jar HelloWorldService-1.0-SNAPSHOT.jar >/dev/null 2>&1 &

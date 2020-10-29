#!/bin/bash
PID=$(ps -ef | grep HelloWorldService-1.0-SNAPSHOT.jar | grep -v grep | awk '{ print $2 }')
if [ ${PID} ]; 
then
	 echo 'Application is stpping...'
	  echo kill $PID DONE
	   kill $PID
   else
	    echo 'Application is already stopped...'
fi
rm -rf /home/ec2-user/hello

#!/bin/bash
echo "Starting web server..."
java -jar /home/ec2-user/app/my-app.jar > /home/ec2-user/app/log.txt 2>&1 &

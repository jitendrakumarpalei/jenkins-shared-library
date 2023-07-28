#!/usr/bin/env groovy
 
def call() {
    echo "building the docker image.."
    sh 'docker build -t jitendrapalei/java-maven-app:2.0 .'        
}
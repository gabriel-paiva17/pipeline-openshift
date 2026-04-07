pipeline {
  agent {
    kubernetes {
      defaultContainer 'maven'
      yaml '''
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: maven
    image: maven:3.9.9-eclipse-temurin-17
    command:
    - cat
    tty: true
'''
    }
  }


  stages {
    stage('Build') {
      steps {
        sh 'mvn -version'
        sh 'mvn clean compile'
      }
    }
  }
}

pipeline {
  agent {
    docker {
      image 'maven:3.9.9-eclipse-temurin-17'
    }
  }
    stage('Build') {
      steps {
        sh 'mvn clean compile'
      }
    }
  }
}

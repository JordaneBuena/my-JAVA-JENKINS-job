pipeline{
  agent any
  tools {
    maven "Maven"
  }
  stages {
    stage('Build') {
      steps{
          sh 'mvn -B -DskipTests clean package'
      }
    }
    stage('Test'){
      steps {
          sh 'mvn test'
      }
      post {
        always {
          junit skipPublishingChecks: true, testResults: 'target/surefire-reports/*.xml'
        }
      }
    }
    stage('Deliver') {
      steps {
          sh 'echo "Delivering project..."'
      }
    }
  }
}

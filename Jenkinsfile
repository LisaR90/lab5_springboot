pipeline {
    agent any

    stages {
        stage('GetProject') {
            steps {
                git branch: 'master', url: 'https://github.com/LisaR90/lab5_springboot.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean'
                sh 'mvn dependency:copy-dependencies'
                sh 'mvn compile'
            }
        }
        stage('Exec') {
            steps {
                sh 'mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8081 --server.address=0.0.0.0"'

            }
        }
    }
}
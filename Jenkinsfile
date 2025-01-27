pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'proj_4'
    }

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t $DOCKER_IMAGE .'
                }
            }
        }
    }
}

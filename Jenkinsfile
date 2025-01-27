pipeline {
    agent any

    environment {
        GIT_URL = "https://github.com/GeorgieHow/Project4.git" 
        IMAGE_NAME = "springjenkins" 
    }

    stages {
        stage('GetFromGithub') {
            steps {
                echo "Cloning repository from GitHub"
              
                git branch: 'main', url: GIT_URL
            }
        }

        stage('Ensure Maven is runnable') {
            steps {
                sh 'chmod a+x mvnw' 
            }
        }

        stage('Maven build') {
            steps {
                echo "Building the Spring Boot application with Maven"
                sh './mvnw clean package -DskipTests' 
            }
        }

        stage('Docker image build') {
            steps {
                echo "Building Docker image"
                sh 'docker build -t ${IMAGE_NAME} .'
            }
        }

        stage('Docker container build') {
            steps {
                echo "Creating Docker container"
                sh 'docker run -d -p 8100:8080 ${IMAGE_NAME}' 
            }
        }
    }
}

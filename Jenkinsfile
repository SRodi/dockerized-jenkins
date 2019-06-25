pipeline {

    agent any

    stages {
        stage('Build Docker image') {
                steps {
                    sh 'docker build . -t dockerized-jenkins-img'
                }
            }
       stage('Run Docker container') {
            steps {
                sh 'docker run -d --name dockerized-jenkins -v /var/run/docker.sock:/var/run/docker.sock -p 8888:8080 dockerized-jenkins-img'
            }
        }
        stage('Clean up') {
            steps {
                sh 'docker stop dockerized-jenkins && docker rm dockerized-jenkins && docker rmi dockerized-jenkins-img'
            }
        }
    }
}

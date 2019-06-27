pipeline {

    agent any

    stages {
        stage('Build Docker image') {
                steps {
                    sh 'docker build . -t pipeline-dj-img'
                }
            }
       stage('Run Docker container') {
            steps {
                sh 'docker run -d --name pipeline-dj-container -v /var/run/docker.sock:/var/run/docker.sock -p 8888:8080 pipeline-dj-img'
            }
        }
        stage('Clean up') {
            steps {
                sh 'docker stop pipeline-dj-container && docker rm pipeline-dj-container && docker rmi pipeline-dj-img'
            }
        }
    }
}

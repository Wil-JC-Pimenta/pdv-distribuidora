pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t pdv-bebidas .'
            }
        }
        // Adicione outros estágios, como deploy, conforme necessário
    }
}

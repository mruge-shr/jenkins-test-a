pipeline {
    agent none 

    stages {
        stage('1'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                sh 'cat /etc/os-release'
            }
        }
        stage('2'){
            agent any
            steps {
                script {
                    docker.image('ubuntu'){
                        sh 'cat /etc/os-release'
                    }
                }
                // sh 'cat /etc/os-release'
            }
        }
            
    }
}

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
            agent {
                docker { image 'ubuntu' }
            }
            steps {
                sh 'cat /etc/os-release'
            }
        }
            
    }
}

pipeline {
    agent none
    stages {
        stage('Pre'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                sh 'cat /etc/os-release'
            }
        }
    }
}
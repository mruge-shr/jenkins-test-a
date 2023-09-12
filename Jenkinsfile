pipeline {
    agent none    
    stages {
        stage('Debug') {
            agent {
                docker { image 'alpine' }
            }
            steps {
                sh 'ls -la'
            }
        }
        stage('Compile Pipeline') {
            agent {
                docker { image 'python:3' }
            }
            steps {
                sh 'python -V'
            }
        }
    }
}

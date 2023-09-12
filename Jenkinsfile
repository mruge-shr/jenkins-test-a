pipeline {
    agent any    
    stages {
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

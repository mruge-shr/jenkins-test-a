pipeline {
    agent none    
    stages {
        stage('Compile Pipeline') {
            agent {
                docker { image 'python:3' }
            }
            steps {
                sh 'python factory.py > generated.groovy'
            }
        }
        stage('Load Pipeline') {
            steps {
                load 'generated.groovy'
            }
            
        }
    }
}

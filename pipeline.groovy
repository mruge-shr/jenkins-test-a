pipeline {
    agent none
    stages {
        stage('Pre'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                sh 'pwd; ls -l ..'
            }
        }
    }
}
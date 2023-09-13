pipeline {
    agent none

    stages {
        stage('Post'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                echo 'Executing'
            }
        }
    }
}

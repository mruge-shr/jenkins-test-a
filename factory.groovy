pipeline {
    agent none

    stages {
        stage('inContainerStage'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                echo 'Doing work'
            }
        }
    }

}
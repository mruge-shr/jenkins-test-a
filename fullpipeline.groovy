println 'Start Full Pipeline'
pipeline {
    stages {
        stage('inContainerStage'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                echo 'In a Container!!!'
            }
        }
    }

}
println 'End Full Pipeline'
// println 'Start Full Pipeline'
// pipeline {
//     agent none

    // stages {
        stage('inContainerStage'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                echo 'In a Container!!!'
            }
        }
    // }

// }
// println 'End Full Pipeline'
#!groovy

// pipeline {
//     agent none

//     stages {

def call(){
    stage('Post'){
        agent {
            docker { image 'alpine' }
        }
        sh 'echo Executing'
    }
}
return this
//     }
// }

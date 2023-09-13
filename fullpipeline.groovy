#!groovy

// pipeline {
//     agent none

//     stages {

def call(){
    stage('Post'){
        agent {
            docker { image 'alpine' }
        }
        sh 'cat /etc/os-release'
    }
    stage('Post2'){
        agent {
            docker { image 'cirros' }
        }
        sh 'cat /etc/os-release'
    }
}
return this
//     }
// }

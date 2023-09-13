#!groovy

// pipeline {
//     agent none

//     stages {

def call(){
    stage('Post'){
        agent {
            docker { image 'ubuntu' }
        }
        sh 'cat /etc/os-release'
    }
    stage('Post2'){
        agent {
            docker { image 'centos' }
        }
        sh 'cat /etc/os-release'
    }
}
return this
//     }
// }

#!groovy

def call(){
    stage('Post'){
        docker.image('ubuntu'){
            sh 'cat /etc/os-release'
        }
    }
    stage('Post2'){
        docker.image('cirros'){
            sh 'cat /etc/os-release'
        }
    }
}
return this
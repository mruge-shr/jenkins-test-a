pipeline {
    agent none 

    stages {
        stage('1'){
            steps {
                script {
                    println "Stage1 Job1"
                }
            }
        }
        stage('2'){
            steps {
                script {
                    parallel direct()
                }
            }
            
        }
    }
}

def getStages() {
    stages = [:]
    stages["Step2.1"] = { 
        stage('2.1') {
            agent {
                docker { image 'alpine' }
            }
            step {
                sh 'cat /etc/os-release'
            }
        } 
    }
    
    
    return stages
}

def direct(){
    stage('3') {
        agent {
            docker { image 'alpine' }
        }
        steps {
            sh 'cat /etc/os-release'
        }
    }
}
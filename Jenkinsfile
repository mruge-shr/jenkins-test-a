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
                    parallel getStages()
                }
            }
            
        }
    }
}

def getStages() {
    stages = [:]
    stages["Step2.1"] = { 
        stage('2.1') {
            sh """
            echo hi 2.1
            """
        } 
    }
    stages["Step2.p"] = { 
        stage('2.p') {
            sh """
            echo hi 2.p
            """
        } 
    }
    
    return stages
}
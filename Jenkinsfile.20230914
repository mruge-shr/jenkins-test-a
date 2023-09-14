def jobs = ["Executor1"]

def parallelStagesMap = jobs.collectEntries {
    ["${it}" : generateStage(it)]
}
 
def generateStage(job) {
    return {
        stage("${job}") {
                agent {
                    docker { image 'cirros'}
                }
                sh 'cat /etc/os-release'
        }
    }
}


pipeline {
    agent any 

    stages {
        stage('1'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                sh 'cat /etc/os-release'
            }
        }
        stage('2'){
            steps {
                script {
                    parallel parallelStagesMap
                }
            }
        }
            
    }
}

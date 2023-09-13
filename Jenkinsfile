def jobs = ["Executor1", "Executor2", "Executor3"]

def parallelStagesMap = jobs.collectEntries {
    ["${it}" : generateStage(it)]
}
 
def generateStage(job) {
    return {
        stage("${job}") {
                echo "Running stage ${job}."
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

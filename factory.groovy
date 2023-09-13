pipeline {
    agent none
    stages {
        stage('Pre'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                echo 'Planning'
            }
        }
        stage('Execute'){
            steps {
                script {
                    agent none
                    def pl = load 'fullpipeline.groovy'
                    pl.call()
                }
            }
        }
    }
}
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
            agent none
            steps {
                script {
                    def pl = load 'fullpipeline.groovy'
                    pl.call()
                }
            }
        }
    }
}
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
                node {
                    def pl = load 'fullpipeline.groovy'
                    pl.call()
                }
            }
            

            // steps {
            //     script {
                    
            //     }
            // }
        }
    }
}
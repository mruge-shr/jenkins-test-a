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
                    load 'fullpipeline.groovy'
                }
            }
            

            // steps {
            //     script {
                    
            //     }
            // }
        }
    }
}
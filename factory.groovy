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
                    docker.image('cirros'){
                        sh 'cat /etc/os-release'
                    }
                    // node{
                    //     load 'fullpipeline.groovy'
                    // }
                    
                }
            }
            

            // steps {
            //     script {
                    
            //     }
            // }
        }
    }
}
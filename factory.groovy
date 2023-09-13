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
            def pl = load 'fullpipeline.groovy'
            steps{
                script{
                    pl.call()
                }
            }
        }
    }

}
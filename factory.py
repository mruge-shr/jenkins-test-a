template = """
pipeline {
    agent none
    stages {
        stage('Pre'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                sh 'cat /etc/os-release'
            }
        }
        stage('Post'){
            agent {
                docker { image 'ubuntu' }
            }
            steps {
                sh 'cat /etc/os-release'
            }
        }
    }
}
"""
print(template)
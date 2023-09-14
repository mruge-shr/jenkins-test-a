template = """
pipeline {
    agent none
    stages {
        stage('Pre'){
            agent {
                docker { image 'alpine' }
            }
            steps {
                sh 'echo "hip hip horray"'
                sh 'cat /etc/os-release'
            }
        }
    }
}
"""
print(template)
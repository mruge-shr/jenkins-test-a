template = """
pipeline {
    agent none    
    stages {
        stage('%s') {
            agent {
                docker { image 'alpine' }
            }
            steps {
                sh 'I am %s'
            }
        }
    }
}
"""
print(template%("One","hello"))
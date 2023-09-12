template = """
stage('%s') {
    agent {
        docker { image 'alpine' }
    }
    step {
        sh 'I am %s'
    }
}
"""
print(template%("One","hello"))
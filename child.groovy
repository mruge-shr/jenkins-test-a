def exec() {
    agent {
        docker { image 'python:3' }
    }
    steps {
        sh 'python -V'
    }
}

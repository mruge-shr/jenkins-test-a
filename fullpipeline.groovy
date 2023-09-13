println 'Start Full Pipeline'
stage('FP-stage') {
    agent {
        docker { image 'alpine' }
    }
    step {
        sh 'In a Container!!!'
    }
}
println 'End Full Pipeline'
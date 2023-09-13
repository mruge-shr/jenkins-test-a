println 'Start Full Pipeline'
step {
    agent {
        docker { image 'alpine' }
    }
    sh 'In a Container!!!'
}
println 'End Full Pipeline'
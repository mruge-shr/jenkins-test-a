node {
    checkout scm
    docker.image('python:3').inside {
        sh 'python factory.py > custom.groovy'
    }
    load '../gitPipeline/custom.groovy'
}

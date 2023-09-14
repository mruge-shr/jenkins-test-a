def pipeline
node {
    checkout scm
    docker.image('ubuntu')
    pipeline = load 'pipeline.groovy'
}

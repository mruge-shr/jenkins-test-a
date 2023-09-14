def pipeline
node {
    checkout scm
    println "try docker image"
    docker.image('ubuntu')
    println "load file"
    pipeline = load 'pipeline.groovy'
}

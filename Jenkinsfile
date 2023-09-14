def pipeline
node {
    checkout scm
    println "try docker image"
    docker.image('ubuntu').inside {
        sh 'cat /etc/os-release'
    }
    println "load file"
    pipeline = load 'pipeline.groovy'
}

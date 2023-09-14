node {
    checkout scm
    println "try docker image"
    docker.image('ubuntu').inside {
        sh 'cat /etc/os-release'
        sh 'touch "DoYouSeeMe"'
    }
    println "load file"
    load 'pipeline.groovy'
}

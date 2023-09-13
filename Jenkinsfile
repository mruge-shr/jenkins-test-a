def code
node('docker'){
    stage('debug') {
        agent {
            docker { image 'alpine' }
        }
        steps {
            sh 'pwd'
            sh 'ls -l'
        }
    }
    stage('load') {
        code = load 'child.groovy'
    } 
    stage('execute') {
        code.exec()
    }
}

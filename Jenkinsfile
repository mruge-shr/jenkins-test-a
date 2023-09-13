def code
node('docker'){
    stage('debug') {
        agent {
            docker { image 'alpine' }
        }
        step {
            sh 'pwd'
        }
        step {
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

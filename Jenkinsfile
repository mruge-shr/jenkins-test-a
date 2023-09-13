def code
node('docker'){
    stage('load') {
        code = load 'child.groovy'
    } 
    stage('execute') {
        code.exec()
    }
}

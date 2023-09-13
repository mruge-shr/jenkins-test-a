def code

node('docker') {
  stage('Checkout') {
    checkout scm
  }

  stage('Load') {
    code = load 'child.groovy'
  }

  stage('Execute') {
    code.example1()
  }
}

code.example2()
def code

node('docker') {
  stage('Checkout') {
    checkout scm
  }

  stage('Load') {
    code = load 'example.groovy'
  }

  stage('Execute') {
    code.example1()
  }
}

code.example2()
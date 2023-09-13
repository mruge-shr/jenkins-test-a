def example1() {
  println 'Hello from example1'
  node('docker') {
    stage('inContainer') {
        agent {
            docker { image 'alpine' }
        }
        step {
            sh 'I am %s'
        }
    }
  }
}

def example2() {
  println 'Hello from example2'
}

return this
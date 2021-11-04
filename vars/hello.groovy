def call(Map<String, String> config = [:]) {
    node {
    stage('Configuration Setup') {
        collectSourceCodeInfoDev(config)
    }
  }
}

def collectSourceCodeInfoDev(config.projectFilePath) {
    checkout scm
}
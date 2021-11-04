def collectSourceCodeInfoDev(config) {
    checkout scm
    printHello.staticJenkinsAgent
}

def call(Map<String, String> config = [:]) {
    node {
    stage('Configuration Setup') {
        collectSourceCodeInfoDev(config)
    }
    }
}
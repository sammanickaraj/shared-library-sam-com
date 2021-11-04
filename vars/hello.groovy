def collectSourceCodeInfoDev(config) {
    checkout scm
    def message = printHello.staticJenkinsAgent(config)
}

def call(Map<String, String> config = [:]) {
    node {
    stage('Configuration Setup') {
        collectSourceCodeInfoDev(config)
    }
    }
}
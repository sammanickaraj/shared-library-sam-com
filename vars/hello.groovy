def collectSourceCodeInfoDev(config) {
    checkout scm
}

def call(Map<String, String> config = [:]) {
    node {
    stage('Configuration Setup') {
        collectSourceCodeInfoDev(config)
    }
    }
}
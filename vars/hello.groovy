def call(Map<String, String> config = [:]) {
    stage('Configuration Setup') {
        collectSourceCodeInfoDev(config.projectFilePath)
    }

}

def collectSourceCodeInfoDev() {
    checkout scm
}
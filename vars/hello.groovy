def collectSourceCodeInfoDev(config) {
    echo "Hi Hello" 
}

def call(Map<String, String> config = [:]) {
    stage('Configuration Setup') {
        collectSourceCodeInfoDev(config)
    }
}
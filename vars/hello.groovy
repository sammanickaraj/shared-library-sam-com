def collectSourceCodeInfoDev(config) {
    echo "Hi Hello" 
}

def call(Map<String, String> config = [:]) {
    node {
    stage('Configuration Setup') {
        collectSourceCodeInfoDev(config)
    }
    }
}
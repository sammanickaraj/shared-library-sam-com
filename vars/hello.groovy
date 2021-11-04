def collectSourceCodeInfoDev(config) {
    echo "Hi Hello" 
}

def call(Map<String, String> config = [:]) {
    node(any) {
    stage('Configuration Setup') {
        collectSourceCodeInfoDev(config)
    }
    }
}
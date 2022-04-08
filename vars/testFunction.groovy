def call(Map<String, String> config = [:] ) {
    stage('Configuration Setup') {
        echo "Hello Configuration setup"
        if (config.name == 'sam') {
            collectSourceCode()
        }
        else {
            echo "name did not match"
        }
    }
}

def collectSourceCode() {
    checkout scm
}

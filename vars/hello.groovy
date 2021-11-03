def call(Map<String, String> config = [:]) {
    stage('Configuration Setup') {
        echo "Hi Sam!! from shared library v1.0"
        echo "Input App from Jenkinsfile: " config.appName
    }
}
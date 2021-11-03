def call(Map<String, String> config = [:]) {
    stage('Configuration Setup') {
        echo "Hi Sam!! from shared library v1.0"
    }

    stage('Print AppName') {
        echo "Input App from Jenkinsfile: " + config.appName
    }

    stage('Print Approver Name') {
        echo "Input Approver name from Jenkinsfile: " + config.devApprovers
    }
}
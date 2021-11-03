def call() {
node {
        stage('Configuration Setup') {
            echo "Configuration setup"
            echo "${random_var}"
        }
        stage('Testing Setup') {
            echo "${testing_var}"
        }
        stage('SonarQube scan') {
            echo "SonarQube Scan in progress"
            echo "${env_testvar}"
        }
        stage('Copy Image') {
            echo "Copy Image"
            sh "mkdir /tmp/test_unique"
        }
         stage('Stage Image') {
            echo "Staging image"
        }
    }
}
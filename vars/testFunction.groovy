def call(Map<String, String> config = [:] ) {
    stage('Configuration Setup') {
        echo "Hello Configuration setup"
        if (config.name == 'sam') {
           node('built-in') {
               checkout scm
               def versionpom=readMavenPom(file: 'pom.xml').version
               echo ${versionpom}
           } 
           
        }
        else {
            echo "name did not match"
        }
    }
    stage('Random Stage') {
        echo "Random Stage"
    }
    stage('Build') {
    node {
        sh "mvn clean install"
    } 
        
    }
}

// def collectSourceCode() {
//         node(any) {
            
//         }
// }

def call(Map<String, String> config = [:] ) {
    stage('Configuration Setup') {
        echo "Hello Configuration setup"
        if (config.name == 'sam') {
           node {
               checkout scm
           } 
           
        }
        else {
            echo "name did not match"
        }
    }
}

// def collectSourceCode() {
//         node(any) {
            
//         }
// }

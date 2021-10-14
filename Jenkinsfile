pipeline {
    agent any

//      tools{
//       gradle 'Gradle_1'
//      }
    stages {
		stage ("build") {
        	steps {
        	        echo 'Executing gradle'
                    withGradle(){
                     bat 'gradlew clean build'
                    }
                   }
             }

        stage ("deploy") {
                steps {
                	echo 'Deploying Jar'
                	bat 'copy build\\libs\\inventoryservice-0.0.1-SNAPSHOT.jar c:\\my_test_app\\'

                    }
                }
	    
	    stage ("run") {
                steps {
                	echo 'Starting application ...'
                	

                    }
                }
    }
}

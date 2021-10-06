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
    }
}
pipeline {
    agent any

     tools{
      gradle 'Gradle_1'
     }
    stages {
		stage ("build") {
        	steps {
        	echo 'Executing gradle'

        	 bat 'gradlew clean build'


            }
        }
    }
}
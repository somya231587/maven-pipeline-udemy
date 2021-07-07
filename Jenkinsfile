pipeline{
	agent any
	stages{
		stage('Clean Stage'){
			steps{
				bat "mvn clean"
				}
			}
		stage('Test Stage'){
			steps{
				bat "mvn test"
				}
			}
		stage('Package Stage'){
			steps{
				bat "mvn package"
				}
			}
	}
}			
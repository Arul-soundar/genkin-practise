pipeline{

	agent any
	
	tools{
		maven "Maven-3.9.9"
	}

	stages{
		stage('Clone Repository'){
			steps{
				git branch: 'main',url: 'https://github.com/Arul-soundar/genkin-practise.git'
			}
		}
		
		stage('Build with Maven'){
			steps{
				bat 'mvn clean package'
			}
		}
		stage(){
			steps{
				bat 'mvn test'
			}
		}
		stage('Archieve Artifacts'){
			steps{
				archiveArtifacts 'target/*.jar',
				fingerprint: true
			}
		}
	}

}
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
		stage('Run Tests'){
			steps{
				bat 'mvn test'
			}
		}
		stage('Archieve Artifacts'){
			steps{
				archiveArtifacts artifacts:'target/*.jar',
				fingerprint: true
			}
		}
		stage('Deploy'){
			steps{
				echo 'Deploying to local machine...'
				bat 'copy target\\genkin-practise-0.0.1-SNAPSHOT.jar C:\\STS_Workspaces\\Gekins_Workspace\\Genkins-Deploy'
				bat 'start java -jar C:\\STS_Workspaces\\Gekins_Workspace\\Genkins-Deploy\\genkin-practise-0.0.1-SNAPSHOT.jar'
			}
		}
	}

}
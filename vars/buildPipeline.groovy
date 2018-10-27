
def call(Map project) {
	pipeline {
		agent any 		
		
		stages{
			stage('xx') {
				steps{
				script {
				dockerBuild(name: $project.name, version: $project.version, registry: $project.registry)

				dockerPush(name: $project.name, version: $project.version, registry: $project.registry)
				}
				}
			}
			
		} 
	}
}	

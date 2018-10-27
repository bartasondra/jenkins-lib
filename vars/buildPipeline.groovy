
def call(Map project) {
	pipeline {
		agent any 		
		
		stages{
			stage('xx') {
				script {
				dockerBuild(name: $project.name, version: $project.version, registry: $project.registry)

				dockerPush(name: $project.name, version: $project.version, registry: $project.registry)
				
				}
			}
			
		} 
	}
}	


def call(Map project) {
	pipeline {
		agent any 		
		
		stages{
			dockerBuild(name: $project.name, version: $project.version, registry: $project.registry)

			dockerPush(name: $project.name, version: $project.version, registry: $project.registry)
		} 
	}
}	
def call(Map project) {
	stage("Docker build") {
		
			echo "building $project.registry/$project.name:$project.version"
			//sh "docker build -t $project.registry/$project.name:$project.version -t $project.registry/$project.name:latest ."
		
	}
}

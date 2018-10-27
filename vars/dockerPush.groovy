def call(Map project) {
	stage("Docker push") {
		steps {
			echo "Pushing $project.registry/$project.name:$project.version"
			//sh "docker build -t $project.registry/$project.name:$project.version -t $project.registry/$project.name:latest ."
		}
	}
}
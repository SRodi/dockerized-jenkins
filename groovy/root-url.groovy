import jenkins.model.JenkinsLocationConfiguration
jlc = JenkinsLocationConfiguration.get()
jlc.setUrl("http://localhost:8080/") 
jlc.save()
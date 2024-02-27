def gitDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def mavenBuild()
{
  sh 'mvn package'
}
def tomcatDeploy(jobname,ip,context)
{
  
                    deploy adapters: [tomcat9(credentialsId: '858b259f-5c02-45d4-8512-5b9ec0d78fa8', path: '', url: 'http://172.31.9.21:8080')], contextPath: 'mytextapp', war: '**/*.war'
  

}

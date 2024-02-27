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
   sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@{ip}/home/ubuntu/tomcat9/webapps/{context}.war"
}

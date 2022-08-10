node{
  stage('SCM checkout'){
    git 'https://github.com/tejaadurty/POM_with_selenium'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}

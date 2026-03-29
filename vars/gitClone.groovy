def call(String repo_url, String branch_name, String creds){
    echo "Cloning the repo from ${repo_url} and ${branch_name}"
    if(creds) {
        git branch: branch_name, url: repo_url, credentialsId: creds
    }
    else {
        git branch:branch, url: repo_url
    }
}
  

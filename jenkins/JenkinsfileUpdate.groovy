node {
    stage("Pull Node"){
        git "git@github.com:fahriddin23/packer_dev.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
    
}
multibranchPipelineJob('ci-pipeline/cart') {
    branchSources {
        github {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            scanCredentialsId('GitHub')
            repository('tapaskumarrout/cart')
        }
    }
  }
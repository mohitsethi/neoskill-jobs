freeStyleJob('master1') {
    description("Do not change this config directly.")
    // jdk("JDK 1.7.0_67")
    label 'neoskill'
    wrappers {
      timestamps()
    }
    logRotator(-1, 10, 5, -1)
    scm {
        git {
            remote {
                url("https://github.com/mohitsethi/neoskills")
            }
            branch("master")
            extensions {wipeOutWorkspace()}
        }
    }

    steps {
        shell('echo "test"')
    }
}

freeStyleJob('master2') {
    description("Do not change this config directly.")
    // jdk("JDK 1.7.0_67")
    label 'neoskill'
    wrappers {
      timestamps()
    }
    logRotator(-1, 10, 5, -1)
    scm {
        git {
            remote {
                url("https://github.com/mohitsethi/neoskills")
            }
            branch("master")
            extensions {wipeOutWorkspace()}
        }
    }

    steps {
        shell('echo "test"')
    }
}

freeStyleJob('master3') {
    description("Do not change this config directly.")
    // jdk("JDK 1.7.0_67")
    label 'neoskill'
    wrappers {
      timestamps()
    }
    logRotator(-1, 10, 5, -1)
    scm {
        git {
            remote {
                url("https://github.com/mohitsethi/neoskills")
            }
            branch("master")
            extensions {wipeOutWorkspace()}
        }
    }

    steps {
        shell('echo "test"')
    }
}


freeStyleJob('master4') {
    description("Do not change this config directly.")
    // jdk("JDK 1.7.0_67")
    label 'neoskill'
    wrappers {
      timestamps()
    }
    logRotator(-1, 10, 5, -1)
    scm {
        git {
            remote {
                url("https://github.com/mohitsethi/neoskills")
            }
            branch("master")
            extensions {wipeOutWorkspace()}
        }
    }

    steps {
        shell('echo "test"')
    }
}

freeStyleJob('master6') {
    description("Do not change this config directly.")
    // jdk("JDK 1.7.0_67")
    label 'neoskill'
    wrappers {
      timestamps()
    }
    logRotator(-1, 10, 5, -1)
    scm {
        git {
            remote {
                url("https://github.com/mohitsethi/neoskills")
            }
            branch("master")
            extensions {wipeOutWorkspace()}
        }
    }

    steps {
        shell('echo "test"')
    }
}


freeStyleJob('master7') {
    description("Do not change this config directly.")
    // jdk("JDK 1.7.0_67")
    label 'neoskill'
    wrappers {
      timestamps()
    }
    logRotator(-1, 10, 5, -1)
    scm {
        git {
            remote {
                url("https://github.com/mohitsethi/neoskills")
            }
            branch("master")
            extensions {wipeOutWorkspace()}
        }
    }

    steps {
        shell('echo "test"')
    }
}

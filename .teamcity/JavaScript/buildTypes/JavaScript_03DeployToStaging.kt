package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_03DeployToStaging : BuildType({
    uuid = "17e3de47-f971-4d52-a316-3e3d463a43b8"
    extId = "JavaScript_03DeployToStaging"
    name = "03.DeployToStaging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_03Firefox) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02InternetExplorer) {
            snapshot {
            }
        }        
    }
})

package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object JavaScript_03DeployToStaging : BuildType({
    uuid = "17e3de47-f971-4d52-a316-3e3d463a43b8"
    extId = "JavaScript_03DeployToStaging"
    name = "03.DeployToStaging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "IIS Deploy"
            id = "RUNNER_6"
            scriptContent = """
            rmdir /S /Q \inetpub\wwwroot\CardsGame
            xcopy /S /I /Y app \inetpub\wwwroot\CardsGame
            """
        }
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
    }
})

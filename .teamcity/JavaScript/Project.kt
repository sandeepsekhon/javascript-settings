package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import JavaScript.vcsRoots.JavaScript_HttpsGithubComSandeepsekhonJavascriptSettingsGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "400269a6-748c-48ba-95c3-c25c93fc6e4a"
    extId = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"

    vcsRoot(JavaScript_HttpsGithubComSandeepsekhonJavascriptSettingsGit)
    vcsRoot(JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(JavaScript_03DeployToStaging)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_01FastTests)
    buildType(JavaScript_03Firefox)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = JavaScript_HttpsGithubComSandeepsekhonJavascriptSettingsGit.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})

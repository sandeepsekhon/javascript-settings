package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02Chrome : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "87ab38f5-07e4-42b0-9d33-094b15f31628"
    extId = "JavaScript_02Chrome"
    name = "02.Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})

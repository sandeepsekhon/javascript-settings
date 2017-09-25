package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_03Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "11c53e28-1224-49b0-9af7-9d74f302d994"
    extId = "JavaScript_02Firefox"
    name = "03.Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})

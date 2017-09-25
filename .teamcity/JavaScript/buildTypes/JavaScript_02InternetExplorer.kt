package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02InternetExplorer : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "8950B336-FB1B-4528-AF9C-BD11C2622222"
    extId = "JavaScript_02InternetExplorer"
    name = "02.InternetExplorer"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})

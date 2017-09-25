package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "cd7d46d2-b3ac-4749-a3a1-5ed0200314c7"
    extId = "JavaScript_01FastTests"
    name = "01-FastTests"

    params {
        param("Browser", "PhantomJS")
    }
})

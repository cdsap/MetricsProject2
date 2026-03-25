pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.develocity") version "4.3.1"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.4.0"
    id("com.fueledbycaffeine.spotlight") version "1.4.1"
}

val isCI = providers.environmentVariable("CI").isPresent

develocity {
    server = "https://ge.solutions-team.gradle.com"
    buildScan {
        uploadInBackground = !isCI
        publishing.onlyIf { it.isAuthenticated }
        obfuscation {
            ipAddresses { addresses -> addresses.map { "0.0.0.0" } }
        }
    }
}

rootProject.name = "projectMetrics2"

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
} 
include (":core:push")
include (":core:contact")
include (":core:login")
include (":core:identity")
include (":core:checkout")
include (":core:cart")
include (":core:user")
include (":core:profile")
include (":feature:feed")
include (":feature:comment")
include (":feature:post")
include (":feature:search")
include (":feature:location")
include (":feature:network")
include (":feature:sync")
include (":feature:share")
include (":domain:group")
include (":domain:message")
include (":domain:notification")
include (":domain:setting")
include (":domain:account")
include (":domain:session")
include (":domain:analytics")
include (":domain:report")
include (":repository:log")
include (":repository:status")
include (":repository:metric")
include (":repository:task")
include (":repository:calendar")
include (":repository:event")
include (":repository:alarm")
include (":repository:timer")
include (":model:file")
include (":model:document")
include (":model:note")
include (":model:todo")
include (":model:list")
include (":model:map")
include (":model:weather")
include (":model:forecast")
include (":app:app")
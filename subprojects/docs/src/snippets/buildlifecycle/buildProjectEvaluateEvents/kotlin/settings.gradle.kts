rootProject.name = "build-project-evaluate-events"

include("projectA", "projectB")

project(":projectB").buildFileName = "../projectB.gradle.kts"

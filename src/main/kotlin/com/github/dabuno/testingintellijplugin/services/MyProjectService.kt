package com.github.dabuno.testingintellijplugin.services

import com.github.dabuno.testingintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

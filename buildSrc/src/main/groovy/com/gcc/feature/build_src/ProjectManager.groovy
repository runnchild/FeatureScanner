package com.gcc.feature.build_src

import org.gradle.api.Project;

class ProjectManager {
    public static String basic = ":ground"
    public static String tool = ":toolkit"
    public static String api = ":api"
    public static String abs = ":abstraction"

    static boolean isBasicProject(Project project) {
        return project.name == projectNormalName(basic) || project.name == projectNormalName(tool) || project.name == projectNormalName(api) || project.name == projectNormalName(abs)
    }

    static boolean isAndroidLibrary(Project project) {
        return project.plugins.findPlugin("com.android.library") != null
    }

    private static String projectNormalName(String projectName) {
        if (projectName.startsWith(":")) {
            return projectName.substring(1)
        }

        return projectName
    }
}

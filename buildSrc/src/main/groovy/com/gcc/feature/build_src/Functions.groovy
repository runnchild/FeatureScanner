package com.gcc.feature.build_src

import org.gradle.api.Project

class Functions {
    static void applyLibrary(Project project) {
        project.apply(plugin: 'com.android.library', from: getLibraryScriptDir(project))
    }

    static void applyJava(Project project) {
        project.apply(from: getJavaScriptDir(project))
    }

    private static File getLibraryScriptDir(Project project) {
        return new File(project.rootDir, "script/library_required_build.gradle")
    }

    private static File getJavaScriptDir(Project project) {
        return new File(project.rootDir, "script/java_require_build.gradle")
    }

    static interface projectNameManager {
        String basic = ":ground"
        String tool = ":toolkit"
        String api = ":api"
        String abs = ":abstraction"
    }
}

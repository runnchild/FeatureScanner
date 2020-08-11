package com.gcc.feature.build_src

import org.gradle.api.Project

class Functions {
    static void applyLibrary(Project project) {
        project.apply(plugin: 'com.android.library')
        project.apply(from: getLibraryScriptPath(project))
        project.apply(from: getConflictResolveScriptPath(project))
        project.apply(from: getUploadArchiveScriptPath(project))
    }

    static void applyJava(Project project) {
        project.apply(from: getJavaScriptPath(project))
    }

    static File getKeepMainDexFilePath(Project project){
        return new File(project.rootDir, "proguard/KeepMainDexFile.txt")
    }

    private static File getLibraryScriptPath(Project project) {
        return new File(project.rootDir, "script/library_required_build.gradle")
    }

    private static File getJavaScriptPath(Project project) {
        return new File(project.rootDir, "script/java_require_build.gradle")
    }

    private static File getConflictResolveScriptPath(Project project) {
        return new File(project.rootDir, "script/conflict_resolve_build.gradle")
    }

    private static File getUploadArchiveScriptPath(Project project) {
        return new File(project.rootDir, "script/upload_aar_build.gradle")
    }
}

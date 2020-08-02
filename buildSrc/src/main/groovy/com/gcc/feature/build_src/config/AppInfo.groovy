package com.gcc.feature.build_src.config;

interface AppInfo {
    int compileSdkVersion = 29
    int minSdkVersion = 16
    int targetSdkVersion = compileSdkVersion
    String buildToolsVersion = "29.0.3"

    String applicationId = "com.gcc.feature"
    int versionCode = 1
    String versionName = "1.0.0"

    String testRunner = "androidx.test.runner.AndroidJUnitRunner"
}

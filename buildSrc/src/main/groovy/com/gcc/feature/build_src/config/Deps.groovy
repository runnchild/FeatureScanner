package com.gcc.feature.build_src.config;

interface Deps {
    interface versions {

    }

    interface android {
        String appcompat = 'androidx.appcompat:appcompat:1.1.0'
        String core_ktx = "androidx.core:core-ktx:1.3.1"
    }

    interface test {
        String mockito = 'org.mockito:mockito-core:3.4.6'
        String powermock = 'org.powermock:powermock-core:2.0.7'
        String junit = "junit:junit:4.12"
        String junit_android_ext = "androidx.test.ext:junit:1.1.1"
        String espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }
}

package com.gcc.feature.build_src.config;

interface Deps {
    interface versions {
        String kotlin_version = "1.3.61"

    }

    interface android {
        String appcompat = 'androidx.appcompat:appcompat:1.1.0'
        String core_ktx = "androidx.core:core-ktx:1.3.1"
        String kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${versions.kotlin_version}"
        String constraint_layout = 'androidx.constraintlayout:constraintlayout:2.0.0-rc1'
    }

    interface test {
        String mockito = 'org.mockito:mockito-core:3.4.6'
        String powermock = 'org.powermock:powermock-core:2.0.7'
        String junit = "junit:junit:4.12"
        String junit_android_ext = "androidx.test.ext:junit:1.1.1"
        String espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }

    interface tool {
        String util_code = "com.blankj:utilcodex:1.29.0"
    }

    interface ui {

    }

    interface framework {
        String router_alibaba_api = "com.alibaba:arouter-api:1.5.0"
        String router_alibaba_compiler = "com.alibaba:arouter-compiler:1.2.2"
    }

    interface converter {
        String json_moshi = "com.squareup.moshi:moshi:1.9.3"
        String json_moshi_kotlin = "com.squareup.moshi:moshi-kotlin:1.9.3"
        String json_moshi_gen = "com.squareup.moshi:moshi-kotlin-codegen:1.9.3"
    }
}

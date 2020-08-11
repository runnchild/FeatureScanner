package com.gcc.feature.module_main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.blankj.utilcode.util.Utils
import com.gcc.feature.abstraction.constants.C_Router

@Route(path = C_Router.activity.module_main.main)
class FeatureMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_main_activity)
    }
}
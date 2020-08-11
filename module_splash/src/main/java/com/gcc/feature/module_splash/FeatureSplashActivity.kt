package com.gcc.feature.module_splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.gcc.feature.abstraction.constants.C_Router

@Route(path = C_Router.activity.module_splash.splash)
class FeatureSplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_splash)

        ARouter.getInstance().build(C_Router.activity.module_main.main).navigation()
    }
}
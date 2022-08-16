package com.example.mimi

import android.app.Application
import io.mimi.sdk.authflow.AuthFlow
import io.mimi.sdk.core.MimiCore
import io.mimi.sdk.core.model.MimiAuthRoute

class MimiApp : Application() {

    override fun onCreate() {
        super.onCreate()

        MimiCore.start(this,
            "api-client-focal-android",
            "6bbb2331a038ab363930fc387b1466c8a26c38601483c64b80767b6e28b49bb5")

    }

}
package com.example.mimi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import io.mimi.sdk.core.MimiCore
import io.mimi.sdk.core.model.MimiAuthRoute
import io.mimi.sdk.testflow.activity.TestFlowActivity
import kotlinx.coroutines.launch

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mimi)

        lifecycleScope.launch {
            auth()
        }

        findViewById<Button>(R.id.btnOpen).setOnClickListener(View.OnClickListener {

            val intent = Intent(this, TestFlowActivity::class.java)

            startActivity(intent)

        })
    }



    suspend fun auth(){
        MimiCore.userController.authenticate(MimiAuthRoute.Anonymously)
    }
}
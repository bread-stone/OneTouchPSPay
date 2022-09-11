package com.breadstone.callpaycospay

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val uri = "payco://open/samsungoffline?servicePath=위젯"
        Intent( Intent.ACTION_MAIN, Uri.parse(uri)).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
            component = ComponentName("com.nhnent.payapp", "com.nhnent.payapp.menu.payment.v2.offline.samsung.SamsungPaymentActivity")
        }.also {
            startActivity(it)
        }
        finishAndRemoveTask()

    }
}
package com.vaca.proto_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.espressif.wifi_provisioning.R
import espressif.WifiScan

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val configRequest: WifiScan.CmdScanStart = WifiScan.CmdScanStart.newBuilder()
            .setBlocking(true)
            .setPassive(false)
            .setGroupChannels(0)
            .setPeriodMs(120)
            .build()
    }
}
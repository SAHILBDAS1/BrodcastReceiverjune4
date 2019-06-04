package com.example.iteradmin.brodcastreceiverjune4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBrocastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val s:String? = intent?.action
        when(s){
            Intent.ACTION_POWER_CONNECTED ->{
                Toast.makeText(context,"charging",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_POWER_DISCONNECTED ->{
                Toast.makeText(context,"disconnected",Toast.LENGTH_LONG).show()
            }
        }

    }
}
package com.codewithkael.firebasevideocall.utils

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.permissionx.guolindev.PermissionX

fun AppCompatActivity.getCameraAndMicPermission(success:()->Unit){
    PermissionX.init(this)
        .permissions(android.Manifest.permission.CAMERA,android.Manifest.permission.RECORD_AUDIO)
        .request{allGranted,_,_ ->

            if (allGranted){
                success()
            } else{
                Toast.makeText(this, "camera and mic permission is required", Toast.LENGTH_SHORT)
                    .show()
            }
        }
}

fun Int.convertToHumanTime() : String{
    val seconds = this%60
    val minutes = this/60
    val secondsString = if (seconds<10) "0$seconds" else "$seconds"
    val minutesString = if (minutes < 10) "0$minutes" else "$minutes"
    return "$minutesString:$secondsString"
}
package com.codewithkael.firebasevideocall.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CloseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finishAffinity()
    }
}
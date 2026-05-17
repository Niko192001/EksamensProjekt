package com.example.neveranother

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.neveranother.screens.KurvScreen
import com.example.neveranother.ui.theme.NeverAnotherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NeverAnotherTheme {
                KurvScreen()
            }
        }
    }
}
package com.github.workspace.samsungsecurefolderchecker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.workspace.samsungsecurefolderchecker.ui.theme.SamsungSecureFolderCheckerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityOptions = intent.getBundleExtra("activity_options")
        val packageName = activityOptions?.getString(
            "android:activity.packageName",
            "empty"
        ) ?: "empty"

        setContent {
            SamsungSecureFolderCheckerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(packageName)
                    }
                }
            }
        }
    }
}
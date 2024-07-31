package com.example.crash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Crashing()
    }
  }
}

@Composable
internal fun Crashing() {
  LazyColumn(state = rememberLazyListState(), modifier = Modifier.fillMaxWidth()) {
    items(200) {
      Column(modifier = Modifier.width(IntrinsicSize.Min)) {
        BasicText(text = "Hello", modifier = Modifier.width(IntrinsicSize.Max))
      }
    }
  }
}


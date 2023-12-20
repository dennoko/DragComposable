package com.example.dragcomposable.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dragcomposable.drag_components.DragMe
import com.example.dragcomposable.drag_components.DragMe2
import com.example.dragcomposable.ui_components.TitleTxt
import com.example.dragcomposable.ui_components.Yoshi

@Composable
fun MainScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleTxt(txt = "Drag Composable")

        Spacer(modifier = Modifier.height(16.dp))
        DragMe()

        Spacer(modifier = Modifier.height(16.dp))
        DragMe2 {
            Yoshi()
        }
    }
}
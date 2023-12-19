package com.example.dragcomposable.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.dragcomposable.drag_components.DraggableComponent
import com.example.dragcomposable.ui_components.TitleTxt

@Composable
fun MainScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleTxt(txt = "Drag Composable")
        DraggableComponent {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Drag Me")
            }
        }
    }
}
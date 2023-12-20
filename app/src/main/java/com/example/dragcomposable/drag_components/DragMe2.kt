package com.example.dragcomposable.drag_components

import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset

@Composable
fun DragMe2(content: @Composable (Modifier) -> Unit) {
    var offserX by remember { mutableStateOf(0) }
    var offserY by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .offset { IntOffset(offserX, offserY) }
            .pointerInput(Unit) {
                detectTransformGestures { _, dragAmount, _, _ ->
                    offserX += dragAmount.x.toInt()
                    offserY += dragAmount.y.toInt()
                }
            }
    ) {
        content(Modifier)
    }
}
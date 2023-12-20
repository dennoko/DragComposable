package com.example.dragcomposable.drag_components

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp

@Composable
fun DragMe() {
    var offserX by remember { mutableStateOf(0) }
    var offserY by remember { mutableStateOf(0) }

    Text(
        text = "Drag Me 1",
        color = MaterialTheme.colorScheme.onPrimary,
        modifier = Modifier
            .offset { IntOffset(offserX, offserY) }
            .pointerInput(Unit) {
                detectTransformGestures { _, dragAmount, _, _ ->
                    offserX += dragAmount.x.toInt()
                    offserY += dragAmount.y.toInt()
                }
            }
            .background(MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(4.dp))
            .padding(16.dp)
    )
}
package com.example.dragcomposable.drag_components

import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset

@Composable
fun DraggableComponent(content: @Composable (Modifier) -> Unit) {
    var offset by remember { mutableStateOf(IntOffset(0, 0)) }
    var isDragging by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .offset { offset }
            .pointerInput(Unit) {
                detectTransformGestures { _, pan, _ , _->
                    // change pan to IntOffset
                    var panInt = IntOffset(pan.x.toInt(), pan.y.toInt())

                    if (pan != Offset(0f, 0f)) {
                        offset = if (isDragging) {
                            offset + panInt
                        } else {
                            isDragging = true
                            offset
                        }
                    } else {
                        isDragging = false
                    }
                }
            }
    ) {
        content(Modifier)
    }
}
package com.example.dragcomposable.ui_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.dragcomposable.R

@Composable
fun Yoshi() {
    OutlinedCard {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Drag Me 2",
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier
                    .padding(10.dp)
                    .background(MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(4.dp))
                    .padding(10.dp)
            )

            Text(text = "Yoshi",
                textAlign = TextAlign.Center,
            )

            Image(
                painter = painterResource(R.drawable.yoshi),
                contentDescription = null,
                Modifier
                    .size(120.dp)
                    .background(
                        color = MaterialTheme.colorScheme.surface,
                        shape = RoundedCornerShape(8.dp)
                    )
            )
        }
    }
}
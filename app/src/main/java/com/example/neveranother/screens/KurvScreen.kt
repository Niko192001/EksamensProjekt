package com.example.neveranother.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Baggrundsfarven fra jeres design: #FAF5F2
val BackgroundColor = Color(0xFFFAF5F2)

// Mørkerød farve fra jeres design: #6A2128
val Burgundy = Color(0xFF6A2128)

@Composable
fun KurvScreen() {

    // Column placerer alt indhold lodret ned ad siden
    Column(
        modifier = Modifier
            // Siden fylder hele skærmen
            .fillMaxSize()

            // Giver siden den lyse baggrundsfarve
            .background(BackgroundColor)

            // Giver luft fra venstre og højre side
            .padding(horizontal = 24.dp)

            // Giver luft fra toppen
            .padding(top = 32.dp)
    ) {

        // Titel øverst på siden
        Text(
            text = "KURV",
            fontSize = 14.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        // Luft mellem KURV og næste sektion
        Spacer(modifier = Modifier.height(16.dp))

        // Row placerer cirkel 1 og teksten "Dine oplysninger" ved siden af hinanden
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {

            // Box bruges her til at lave den runde cirkel med tallet 1
            Box(
                modifier = Modifier
                    .size(22.dp)
                    .background(Burgundy, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "1",
                    color = Color.White,
                    fontSize = 13.sp
                )
            }

            // Luft mellem cirklen og teksten
            Spacer(modifier = Modifier.width(8.dp))

            // Overskriften ved siden af cirklen
            Text(
                text = "Dine oplysninger",
                fontSize = 20.sp,
                color = Color.Black
            )
        }

        // Luft mellem "Dine oplysninger" og progress-linjen
        Spacer(modifier = Modifier.height(20.dp))

        // Progress-linje med 4 punkter
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 72.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            // Første punkt er fyldt, fordi brugeren er på step 1
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(Burgundy, CircleShape)
            )

            // Linje mellem punkt 1 og 2
            Box(
                modifier = Modifier
                    .height(1.dp)
                    .weight(1f)
                    .background(Burgundy)
            )

            // Punkt 2 er tomt
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(BackgroundColor, CircleShape)
                    .border(1.dp, Burgundy, CircleShape)
            )

            // Linje mellem punkt 2 og 3
            Box(
                modifier = Modifier
                    .height(1.dp)
                    .weight(1f)
                    .background(Burgundy)
            )

            // Punkt 3 er tomt
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(BackgroundColor, CircleShape)
                    .border(1.dp, Burgundy, CircleShape)
            )

            // Linje mellem punkt 3 og 4
            Box(
                modifier = Modifier
                    .height(1.dp)
                    .weight(1f)
                    .background(Burgundy)
            )

            // Punkt 4 er tomt
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(BackgroundColor, CircleShape)
                    .border(1.dp, Burgundy, CircleShape)
            )
        }
    }
}
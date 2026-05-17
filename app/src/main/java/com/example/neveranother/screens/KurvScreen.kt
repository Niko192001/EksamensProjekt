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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CalendarToday
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Baggrundsfarven fra jeres design
val BackgroundColor = Color(0xFFFAF5F2)

// Mørkerød farve fra jeres design
val Burgundy = Color(0xFF6A2128)

@Composable
fun KurvScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .padding(horizontal = 24.dp)
            .padding(top = 32.dp)
    ) {

        Text(
            text = "KURV",
            fontSize = 14.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
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

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "Dine oplysninger",
                fontSize = 20.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 72.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(Burgundy, CircleShape)
            )

            Box(
                modifier = Modifier
                    .height(1.dp)
                    .weight(1f)
                    .background(Burgundy)
            )

            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(BackgroundColor, CircleShape)
                    .border(1.dp, Burgundy, CircleShape)
            )

            Box(
                modifier = Modifier
                    .height(1.dp)
                    .weight(1f)
                    .background(Burgundy)
            )

            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(BackgroundColor, CircleShape)
                    .border(1.dp, Burgundy, CircleShape)
            )

            Box(
                modifier = Modifier
                    .height(1.dp)
                    .weight(1f)
                    .background(Burgundy)
            )

            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(BackgroundColor, CircleShape)
                    .border(1.dp, Burgundy, CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(28.dp))

        InputField(
            label = "Fornavn",
            value = "Emma"
        )

        Spacer(modifier = Modifier.height(16.dp))

        InputField(
            label = "Efternavn",
            value = "Andersen"
        )

        Spacer(modifier = Modifier.height(16.dp))

        InputField(
            label = "E-mail",
            value = "emma.andersen@hotmail.com"
        )

        Spacer(modifier = Modifier.height(24.dp))

        InputField(
            label = "Telefonnummer",
            value = "+45 12 34 56 78"
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nyt felt til fødselsdato
        InputField(
            label = "Fødselsdato",
            value = "12/05-2000",
            showCalendarIcon = true
        )
    }
}

// Denne funktion laver ét inputfelt
// showCalendarIcon bruges kun til fødselsdato-feltet
@Composable
fun InputField(
    label: String,
    value: String,
    showCalendarIcon: Boolean = false
) {
    Column {

        Text(
            text = label,
            fontSize = 14.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(7.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .shadow(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(8.dp)
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = value,
                fontSize = 15.sp,
                color = Color.Black
            )

            if (showCalendarIcon) {
                Icon(
                    imageVector = Icons.Outlined.CalendarToday,
                    contentDescription = "Kalender",
                    tint = Color.Black,
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .size(20.dp)
                )
            }
        }
    }
}
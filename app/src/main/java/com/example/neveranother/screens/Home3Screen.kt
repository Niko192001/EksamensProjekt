package com.example.neveranother.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.neveranother.R

@Composable
fun AboutUsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start
    ) {

        //Titel
        Text(
            text = "Om os",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Brødtekst
        Text(
            text = "Never Another er en dansk virksomhed, der specialiserer sig i \" +\n" +
                    "skræddersyede, bøjlefrie BH’er designet ud fra hver enkelt kvindes unikke mål. \" +\n" +
                    "Deres mission er at skabe bedre pasform, højere komfort og en mere inkluderende \" +\n" +
                    "oplevelse for kvinder, der ofte har svært ved at finde BH’er i deres størrelse. \" +\n" +
                    "Med fokus på teknologi, kropsdiversitet og personlig tilpasning arbejder Never Another \" +\n" +
                    "for at gøre det lettere og tryggere at finde en BH, der virkelig passer.\",",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        //Billede
        Image(
            painter = painterResource(id = R.drawable.about_us_image),
            contentDescription = "Om os billede",
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier =  Modifier.height(32.dp))
    }
}


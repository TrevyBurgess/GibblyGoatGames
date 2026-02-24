package com.cyberfeedforward.emptyactivity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cyberfeedforward.emptyactivity.R
import com.cyberfeedforward.emptyactivity.ui.AppRoot
import com.cyberfeedforward.emptyactivity.ui.theme.EmptyActivityTheme

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
            .padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Gibbly Goat Games",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .padding(bottom = 12.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "This app is a compilation of some of the games I like playing.",
            modifier = Modifier.padding(top = 12.dp),
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Enjoy the ride and have fun \uD83D\uDE07",
            modifier = Modifier.padding(top = 20.dp),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            //color = MaterialTheme.colorScheme.secondary
        )

        Image(
            painter = painterResource(id = R.drawable.the_goat_wizard),
            contentDescription = "The Goat Wizard",
            modifier = Modifier
                .padding(top = 5.dp)
                .size(220.dp),
            contentScale = ContentScale.Fit
        )

        Text(
            text = "May the gibbly be with you",
            modifier = Modifier.padding(top = 5.dp),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    EmptyActivityTheme {
        AppRoot()
    }
}

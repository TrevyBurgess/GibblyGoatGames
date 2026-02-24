package com.cyberfeedforward.emptyactivity.ui.gamepages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cyberfeedforward.emptyactivity.R
import com.cyberfeedforward.emptyactivity.ui.theme.EmptyActivityTheme

@Composable
fun SudokuHelpPage(
    onReturnToSudoku: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
            .padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.sudoku_help_title),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.sudoku_help_instructions),
            modifier = Modifier.padding(top = 16.dp),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center
        )

        Button(
            onClick = onReturnToSudoku,
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                contentDescription = stringResource(R.string.return_to_sudoku)
            )
            Text(
                text = stringResource(R.string.return_to_sudoku),
                modifier = Modifier.padding(start = 6.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SudokuHelpPagePreview() {
    EmptyActivityTheme {
        SudokuHelpPage(onReturnToSudoku = {})
    }
}

package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrants()

                }
            }
        }
    }
}
@Composable
fun ComposeQuadrant(color: Color, head: String, body: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(color)
            .padding(16.dp)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = head,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
        )
        Text(
            text = body,
            color = Color.Black,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun ComposeQuadrants() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(Modifier.weight(1F)) {
            ComposeQuadrant(
                color = Color.Green,
                head = "Text composable",
                body = "Displays text and follows Material Design guidelines.",
                modifier = Modifier.weight(1f)
            )
            ComposeQuadrant(
                color = Color.Yellow,
                head = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1F)) {
            ComposeQuadrant(
                color = Color.Cyan,
                head = "Row composable",
                body = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
            )
            ComposeQuadrant(
                color = Color.LightGray,
                head = "Column composable",
                body = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    QuadrantTheme {
        ComposeQuadrants()

    }
}
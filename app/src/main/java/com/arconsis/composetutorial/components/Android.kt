package com.arconsis.composetutorial.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.arconsis.composetutorial.R
import com.arconsis.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun Android(
    text: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.android),
            contentDescription = null,
        )
        Text(text = text)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        Android("Android")
    }
}
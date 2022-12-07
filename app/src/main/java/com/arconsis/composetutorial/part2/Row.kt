package com.arconsis.composetutorial.part2

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arconsis.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun RowExample() {
    Row {
        Text(text = "Hello Grevena")
        Text(text = "Hello Students")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        RowExample()
    }
}
package com.arconsis.composetutorial.part2

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arconsis.composetutorial.components.Android
import com.arconsis.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun RowExample() {
    Row {
        Android(text = "Grevena")
        Android(text = "Students")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        RowExample()
    }
}
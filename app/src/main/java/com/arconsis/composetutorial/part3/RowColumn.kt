package com.arconsis.composetutorial.part3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arconsis.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun RowColumnExample() {
    Row {
        Column {
            Text(text = "Hello Grevena")
            Text(text = "Hello Students")
        }
        Text(text = "Hello arconsis")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        RowColumnExample()
    }
}
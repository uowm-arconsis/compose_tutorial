package com.arconsis.composetutorial

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arconsis.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun CompanyCard(onClick: () -> Unit) {
    val padding = 8.dp
    Card(border = BorderStroke(0.5.dp, MaterialTheme.colors.onBackground)) {
        Column(
            Modifier
                .clickable(onClick = onClick),
        ) {
            Row(
                modifier = Modifier
                    .padding(padding)
                    .clickable(onClick = onClick),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.arconsis),
                    contentDescription = "arconsis",
                )
                Column {
                    Text("arconsis", style = MaterialTheme.typography.h4)
                    Text("IT-Solutions GmbH", style = MaterialTheme.typography.subtitle1)
                }
            }
            Spacer(Modifier.size(padding))

            Box {
                Image(
                    painter = painterResource(R.drawable.arconsis_office),
                    contentDescription = "arconsis office",
                )

                Image(
                    modifier = Modifier
                        .size(36.dp)
                        .align(Alignment.BottomEnd)
                        .padding(4.dp),
                    painter = painterResource(R.drawable.arconsis),
                    contentDescription = "arconsis",
                    alpha = 0.7F
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CompanyCardPreview() {
    ComposeTutorialTheme {
        CompanyCard {}
    }
}
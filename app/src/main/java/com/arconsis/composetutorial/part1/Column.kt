package com.arconsis.composetutorial.part1

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arconsis.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun ColumnExample() {
    Column {
        Text(text = "Hello Grevena")
        Text(text = "Hello Students")
    }
}

/**
 * Αυτό ειναι το παράδειγμα για τους μαθητές
 * Θα πρέπει να βγάλετε τα σχόλια απο τον παρακάτω κώδικα
 * για να δείτε το αποτέλεσμα
 */
@Composable
fun ColumnExampleStudents() {
//    Column {
//        Text(text = "Hello Grevena")
//        Text(text = "Hello Students")
//    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        ColumnExample()
    }
}


/**
 * Οταν τελείωσετε με το παράδειγμα πάνω
 * βγάλτε τα σχόλια απ τον κώδικα που ακολουθεί
 * για να δείτε το αποτελεσμά σας
 */
//@Preview(showBackground = true)
//@Composable
//fun StudentsPreview() {
//    ComposeTutorialTheme {
//        ColumnExampleStudents()
//    }
//}
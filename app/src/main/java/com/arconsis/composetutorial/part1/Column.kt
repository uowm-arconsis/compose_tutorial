package com.arconsis.composetutorial.part1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.arconsis.composetutorial.components.Android
import com.arconsis.composetutorial.ui.theme.ComposeTutorialTheme

// TODO: Τι αποτέλεσμα θα βλέπαμε αν δεν χρησιμοποιούσαμε το Column;
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Android(modifier = Modifier.align(Alignment.End), text = "Grevena")
        Android(text = "Students")
        Android(text = "Students")
        Android(text = "Students")
    }
}

/**
 * Αυτό ειναι το παράδειγμα για τους μαθητές
 * Θα πρέπει να βγάλετε τα σχόλια απο τον παρακάτω κώδικα
 * για να δείτε το αποτέλεσμα
 */
//@Composable
//fun ColumnExampleStudents() {
////    Column {
////        Text(text = "Hello Grevena")
////        Text(text = "Hello Students")
////    }
//}

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
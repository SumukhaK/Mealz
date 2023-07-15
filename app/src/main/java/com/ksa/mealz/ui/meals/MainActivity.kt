package com.ksa.mealz.ui.meals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ksa.mealz.ui.theme.MealzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealzTheme {
                // A surface container using the 'background' color from the theme
                MealsCategoriesScreen()

            }
        }
    }
}

@Composable
fun MealsCategoriesScreen() {
    val viewModel : MealsCategoriesViewModel = viewModel()
    Text(text = "Hello ! Welcome to Mealz App")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MealzTheme {
        MealsCategoriesScreen()
    }
}
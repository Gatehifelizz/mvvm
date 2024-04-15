package com.gatehi.mvvm.ui.theme.screens.about

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gatehi.mvvm.navigation.ROUTE_HOME

@Composable
fun About(navController: NavController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
        ) {
        Text(
            text = "THis is About page",
            color= Color.Magenta,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(onClick = {
            navController.navigate(ROUTE_HOME) },
            modifier = Modifier.fillMaxWidth()
            ) {
            Text(text = "Home")

        }
    }
}

@Preview
@Composable
private fun Aboutprev() {
    About(navController = rememberNavController())
}
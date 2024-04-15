package com.gatehi.mvvm.ui.theme.screens.splash

import android.text.Layout.Alignment
import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.gatehi.mvvm.navigation.ROUTE_HOME

//@Composable
//fun SplashScreen(navController: NavController) {
//    val scale= remember {
//        androidx.compose.animation.core.Animatable(Gf)
//    }
//
//    //animation effect
//    LaunchedEffect(key1 = true) {
//        scale.animateTo(
//            targetValue = 0.7f,
//            animationSpec = tween(
//                durationMillis = 800,
//                easing = {
//                    OvershootInterpolator(4f).getInterpolation(it)
//                })
//
//        )
//        kotlinx.coroutines.delay(3000L)
//        navController.navigate(ROUTE_HOME)
//    }
//    //IMAGE
//    Box(modifier = Modifier.fillMaxSize() {
//        Image(painter = , contentDescription = )
//    })
//
//}
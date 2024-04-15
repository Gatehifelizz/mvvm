package com.gatehi.mvvm.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gatehi.mvvm.ui.theme.screens.Register.Regscreen
import com.gatehi.mvvm.ui.theme.screens.about.About
import com.gatehi.mvvm.ui.theme.screens.home.Homescreen
import com.gatehi.mvvm.ui.theme.screens.welcome.Welcomescreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavController= rememberNavController(),
               startDestination: String=ROUTE_HOME) {
        NavHost(navController= navController as NavHostController, modifier=modifier,
        startDestination = startDestination){
            composable(ROUTE_HOME){
                Homescreen(navController)
            }
            composable(ROUTE_ABOUT){
                About(navController)
            }
            composable(ROUTE_REGSCREEN){
                Regscreen(navController)
            }
            composable(ROUTE_WELCOME){
                Welcomescreen(navController)
            }
//            composable(ROUTE_SPLASHSCREEN){
//                SplashScreen(navController)
//            }
        }


}
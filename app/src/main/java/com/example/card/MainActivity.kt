package com.example.card


import DetailsScreen
import android.os.Bundle
import android.widget.GridLayout
import android.widget.GridView
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
               Scaffold() {
                   TopAppBar(
                       title = { Text("Bou Fabrics") },
                       navigationIcon = {

                           IconButton(
                               onClick ={

                               },
                               content = {
                                   Icon(Icons.Filled.Menu,  contentDescription ="" )
                               }
                           )
                       }
                   )
               }
                CardContainer()
                }
            }
        }



@Composable
fun CardContainer(){
    val navController = rememberNavController()
     // list of cards
    Column(
        Modifier
            .padding(8.dp)
            ) {
Spacer(modifier = Modifier.height(80.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color.Cyan),
            Alignment.Center

        ){

            Image(
                painter = painterResource(R.drawable.im),
                contentDescription = "",
                modifier = Modifier
                    .height(150.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.Cyan)
                    .align(Alignment.BottomEnd)
            )
            Text("Grab Your Best Deals",
                Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .align(Alignment.TopCenter)
                    .padding(top = 25.dp, end = 100.dp),
                style = TextStyle(color = Color.Black,fontWeight = FontWeight.Bold,fontSize = 25.sp))
            Text("Best Deals for You",
                Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .align(Alignment.TopCenter)
                    .padding(top = 65.dp, end = 195.dp),
                style = TextStyle(color = Color.Black,fontWeight = FontWeight.Bold,fontSize = 16.sp))
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {
                navController.navigate("details")

            }, modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .align(Alignment.Center)

                .padding(bottom = 12.dp, end = 235.dp, top = 100.dp) ) {
                Spacer(modifier = Modifier.height(4.dp))
                Text("View All",
                    Modifier
                        .padding(start = 8.dp)
                        .height(60.dp)
                        .width(65.dp),
                    style = TextStyle(color = Color.White,fontSize = 15.sp))

            }
            NavHost(navController = navController, startDestination = "home") {
        composable("home") { MainActivity() }
        composable("details") { DetailsScreen(navController) }

    }


        }

    }

}}


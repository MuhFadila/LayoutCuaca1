package com.example.latihanmultiplatformbox

import android.os.Bundle
import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.latihanmultiplatformbox.ui.theme.LatihanMultiplatformBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanMultiplatformBoxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Tampilayar(pesan = getString(R.string.greeting), dari = getString(R.string.umy))
                }
            }
        }
    }
}

@Composable
fun TampilText(message:String, from:String, modifier: Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier){
        Text(
            color = Color.Blue,
            text = message,
            fontSize = 80.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center
        )

        Text(
            color = Color.Red,
            text = from,
            fontSize = 60.sp,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}

@Composable
fun Tampilayar(pesan:String, dari:String){
    val image = painterResource(R.drawable.wallpaper)
    Box{
        Image(painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillHeight,
        modifier = Modifier.fillMaxSize())
        TampilText(message = pesan,
            from = dari,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp))
    }
}


@Preview(showBackground = true)
@Composable
fun GettingPreview() {
    LatihanMultiplatformBoxTheme {
        Tampilayar(pesan = "Hemat", dari ="Uang" )
    }
}
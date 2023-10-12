package com.shashi.countryinfoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shashi.countryinfoapp.ui.theme.CountryInfoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    CountryInfoAppTheme() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface
        ) {
            CountryCard()
        }

    }
}

@Composable
fun CountryCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth(1.0f)
            .padding(10.dp)
            .wrapContentHeight(align = Alignment.Top)
            .border(1.dp, Color.LightGray),
        shadowElevation = 2.dp
    ) {

        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.2f)
                    .weight(0.2f)
            ) {

                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .height(80.dp)
                        .padding(2.dp),
                    contentAlignment = Alignment.Center
                ) {
                    val imageResId = R.drawable.india
                    val imagePainter: Painter = painterResource(id = imageResId)

                    Image(
                        painter = imagePainter,
                        contentDescription = "Country Flag",
                        contentScale = ContentScale.Crop
                    )
                }

                Text(
                    text = "INDIA", modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "New Delhi", modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                )

            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .weight(0.8f)
            ) {
                Text(
                    text = "Republic of India",
                    modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = "Asia", modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "South Asia", modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )

                Row(
                    modifier = Modifier.fillMaxWidth(1.0f),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "INR", modifier = Modifier
                            .fillMaxWidth(0.2f)
                            .padding(2.dp),
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Indian Rupees", modifier = Modifier
                            .fillMaxWidth(0.4f)
                            .padding(2.dp),
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )

                    Column(
                        modifier = Modifier.fillMaxWidth(1.0f),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.End
                    ) {

                        Text(
                            text = "+91", modifier = Modifier
                                .fillMaxWidth(0.2f)
                                .padding(2.dp),
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center
                        )

                        Text(
                            text = ".in ", modifier = Modifier
                                .fillMaxWidth(0.4f)
                                .padding(2.dp),
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center
                        )

                    }

                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()
}
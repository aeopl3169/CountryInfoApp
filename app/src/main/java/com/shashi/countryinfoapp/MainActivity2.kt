package com.shashi.countryinfoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shashi.countryinfoapp.components.CountryCardWithConstraintLayout
import com.shashi.countryinfoapp.data.CountryInfo
import com.shashi.countryinfoapp.ui.theme.CountryInfoAppTheme

class MainActivity2 : ComponentActivity() {
    private val indiaInfo = CountryInfo(
        R.drawable.india,
        "India",
        "New Delhi",
        "Republic of India",
        "Asia", "South Asia",
        "₹",
        "Indian Rupee",
        "+91",
        ".in"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen2(countryInfo = indiaInfo)
        }
    }
}

@Composable
fun MainScreen2(countryInfo: CountryInfo) {
    CountryInfoAppTheme() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface
        ) {
            CountryCard2(countryInfo)
        }

    }
}

@Composable
fun CountryCard2(countryInfo: CountryInfo) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(1.0f)
            .padding(5.dp)
            .border(1.dp, Color.LightGray)
            .wrapContentHeight(align = Alignment.Top),
        shadowElevation = 2.dp

    ) {
        CountryCardWithConstraintLayout(countryInfo = countryInfo)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    val indiaInfo = CountryInfo(
        R.drawable.india,
        "India",
        "New Delhi",
        "Republic of India",
        "Asia", "South Asia",
        "₹",
        "Indian Rupee",
        "+91",
        ".in"
    )
    MainScreen2(indiaInfo)
}
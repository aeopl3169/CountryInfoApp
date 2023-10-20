package com.shashi.countryinfoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.shashi.countryinfoapp.data.CountryInfo

@Composable
fun CountryCardWithConstraintLayout(countryInfo: CountryInfo) {

    ConstraintLayout(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(2.dp)
    ) {

        val (flag, countryName, capital) = createRefs()
        val imageRegId = countryInfo.flagId
        val imagePainter: Painter = painterResource(id = imageRegId)


        Image(
            painter = imagePainter,
            contentDescription = "Country Flag",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .height(70.dp)
                .padding(2.dp)
                .constrainAs(flag) {
                    top.linkTo(parent.top)
                }
        )

        Text(
            text = countryInfo.countryName, modifier = Modifier
                .fillMaxWidth(1.0f)
                .padding(2.dp)
                .constrainAs(countryName) {
                    top.linkTo(flag.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(flag.end)
                },
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )


        Text(
            text = countryInfo.nationalCapital, modifier = Modifier
                .fillMaxWidth(1.0f)
                .padding(2.dp)
                .constrainAs(capital) {
                    top.linkTo(countryName.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(flag.end)
                },
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )

    }

}
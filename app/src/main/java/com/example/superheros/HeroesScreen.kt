package com.example.superheros

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.superheros.data.Hero

@Composable
fun HeroCard(
    modifier: Modifier = Modifier,
    hero: Hero
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier
    ) {
        HeroText(hero = hero)
    }
}

@Composable
fun HeroText(hero: Hero) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .sizeIn(minHeight = 72.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = stringResource(hero.nameRes),
                style = MaterialTheme.typography.displaySmall
            )
            Text(
                text = stringResource(hero.descriptionRes),
                style = MaterialTheme.typography.bodyLarge
            )

        }
        Spacer(Modifier.width(16.dp))
        HeroImage(hero = hero)
    }
}

@Composable
fun HeroImage(hero: Hero) {
    Box(
        modifier = Modifier
            .size(72.dp)
            .clip(RoundedCornerShape(8.dp))
    ) {
        Image(
            painter = painterResource(hero.imageRes),
            contentDescription = null,
            alignment = Alignment.TopCenter,
            contentScale = ContentScale.FillWidth
        )
    }
}
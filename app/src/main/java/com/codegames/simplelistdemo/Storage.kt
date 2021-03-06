package com.codegames.simplelistdemo

import android.graphics.Color

val colors = listOf(
    Color.parseColor("#F44336"),
    Color.parseColor("#E91E63"),
    Color.parseColor("#9C27B0"),
    Color.parseColor("#673AB7"),
    Color.parseColor("#3F51B5"),
    Color.parseColor("#2196F3"),
    Color.parseColor("#03A9F4"),
    Color.parseColor("#00BCD4"),
    Color.parseColor("#009688"),
    Color.parseColor("#4CAF50"),
    Color.parseColor("#8BC34A"),
    Color.parseColor("#CDDC39"),
    Color.parseColor("#FFEB3B"),
    Color.parseColor("#FFC107"),
    Color.parseColor("#FF9800"),
    Color.parseColor("#FF5722"),
    Color.parseColor("#795548"),
    Color.parseColor("#9E9E9E"),
    Color.parseColor("#607D8B")
)

private const val bodyText =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever"

fun fetchData(start: Int): List<ItemModel> {
    val data = mutableListOf<ItemModel>()
    for (i in 1..10) {
        data += ItemModel(
            "Title ${start + i}",
            "Secondary text ${start + i}",
            bodyText,
            R.drawable.image_1,
            colors[(start + i) % colors.size]
        )
    }
    return data.toList()
}

class ItemModel(
    val title: String,
    val subtitile: String,
    val body: String,
    val imageRes: Int,
    val color: Int,
    var number: Int = 0
)
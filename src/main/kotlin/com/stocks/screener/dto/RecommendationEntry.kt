package com.stocks.screener.dto


data class RecommendationEntry(
    val period: String,
    val strongBuy: Int,
    val buy: Int,
    val hold: Int,
    val sell: Int,
    val strongSell: Int
)
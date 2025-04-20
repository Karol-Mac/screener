package com.stocks.screener.model

data class Analysis (
    val strongBuy: Int,
    val buy: Int,
    val hold: Int,
    val sell: Int,
    val strongSell: Int,
)

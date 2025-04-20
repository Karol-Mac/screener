package com.stocks.screener.dto

data class PriceValue(
    val raw: Double?,
    val fmt: String?,
    val longFmt: String? = null
)
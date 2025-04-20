package com.stocks.screener.dto

data class EarningsTrend (
    val trend: List<TrendItem>,
    val maxAge: Int
)
package com.stocks.screener.dto

data class EpsTrend (
    val current: PriceValue,
    val `7daysAgo`: PriceValue,
    val `30daysAgo`: PriceValue,
    val `60daysAgo`: PriceValue,
    val `90daysAgo`: PriceValue,
)

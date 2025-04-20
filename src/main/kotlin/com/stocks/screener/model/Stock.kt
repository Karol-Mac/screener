package com.stocks.screener.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("stocks")
data class Stock(
    @Id
    val symbol: String,

    val marketCap: Long,
    val ebitda: Long,
    val currentPrice: Double,
    val average50Price: Double,
    val average200price: Double,
    val peRatio: Double,
    val pegRatio: Double,
    val priceTarget: Double,
    val eps: Double,
    val revenue: Long,
    val peForward: Double,
    val evToEbitda: Double,
    val yearLow: Double,
    val yearHigh: Double,


    val ev: Long,               //ev = evToEbitda * ebitda
    val upside: Double,         // upside = (priceTarget - currentPrice) / currentPrice * 100
    val psForward: Double,      // psForward = marketCap (aktualne) / revenueAVG (przyszły rok)
    val analysis: Analysis,
)
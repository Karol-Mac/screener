package com.stocks.screener.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.time.LocalDate


@Document("stocks")
data class Stock(
    @Id
    val symbol: String,

    val price: PriceData,
    val priceTarget: PriceTarget,
    val indicators: Indicators,
    val analytics: Analytics,
    val stats: Stats,

    val marketCap: BigDecimal,

    val updatedAt: LocalDate = LocalDate.now(),
) {
    data class PriceData(
        val current: BigDecimal,
        val average50: BigDecimal,
        val average200: BigDecimal
    )

    data class PriceTarget(
        val high: BigDecimal,
        val low: BigDecimal,
        val consensus: BigDecimal,
        val median: BigDecimal,
        val upside: BigDecimal  // calculated (consensus - current) / current * 100
    )

    data class Indicators(
        val pe: BigDecimal,
        val eps: BigDecimal,
        val debtToEquity: BigDecimal,
        val ev: BigDecimal,
        val ebitda: BigDecimal,
        val psForward: BigDecimal
    )

    data class Analytics(
        val consensus: String, // "Buy", "Hold", etc.
        val strongBuy: Int,
        val buy: Int,
        val hold: Int,
        val sell: Int,
        val strongSell: Int
    )
    
    data class Stats (
        val dayLow: BigDecimal,
        val dayHigh: BigDecimal,
        val yearLow: BigDecimal,
        val yearHigh: BigDecimal,
    )
}
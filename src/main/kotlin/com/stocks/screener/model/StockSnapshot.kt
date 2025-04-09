package com.stocks.screener.model

import com.stocks.screener.model.Stock.*
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document("stock_snapshots")
data class StockSnapshot(
    @Id
    val symbol: String,


    val price: PriceData,
    val priceTarget: PriceTarget,
    val indicators: Indicators,
    val analytics: Analytics,
    val stats: Stats,

    val updatedAt: LocalDate
) {
    fun fromStock(stock: Stock): StockSnapshot {
        return StockSnapshot(
            symbol = stock.symbol,
            price = stock.price,
            priceTarget = stock.priceTarget,
            indicators = stock.indicators,
            analytics = stock.analytics,
            stats = stock.stats,
            updatedAt = stock.updatedAt,
        )
    }
}
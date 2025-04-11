package com.stocks.screener.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class QuoteResponse(
    val symbol: String,
    val price: Double,
    val marketCap: Long
) {
    override fun toString(): String {
        return """
            {
                symbol: $symbol
                price: $price
                marketCap: $marketCap
            }
        """.trimIndent()
    }
}
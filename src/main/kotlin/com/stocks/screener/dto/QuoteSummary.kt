package com.stocks.screener.dto

data class QuoteSummary(
    val result: List<QuoteResult>,
    val error: Any? = null
)

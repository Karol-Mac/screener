package com.stocks.screener.dto

data class QuoteResult(
    val summaryDetail: SummaryDetail?,
    val financialData: FinancialData?,
    val defaultKeyStatistics: DefaultKeyStatistics?,
    val recommendationTrend: RecommendationTrend?,
    val earningsTrend: EarningsTrend?
)
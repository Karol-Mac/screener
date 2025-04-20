package com.stocks.screener.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)

data class TrendItem(
    val period: String,
    val endDate: String,

    val earningsEstimate: EarningsEstimate,
    val revenueEstimate: RevenueEstimate,
    val epsTrend: EpsTrend?,
)
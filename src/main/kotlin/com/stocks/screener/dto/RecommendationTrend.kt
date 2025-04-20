package com.stocks.screener.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class RecommendationTrend(
    val trend: List<RecommendationEntry>,
    val maxAge: Int
)
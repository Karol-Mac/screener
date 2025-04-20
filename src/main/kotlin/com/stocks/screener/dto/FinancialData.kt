package com.stocks.screener.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class FinancialData (
    val currentPrice: PriceValue?,

    val targetHighPrice: PriceValue?,
    val targetLowPrice: PriceValue?,
    val targetMeanPrice: PriceValue?,
    val targetMedianPrice: PriceValue?,

    val ebitda: VolumeValue?,
    val totalDebt: VolumeValue?,

    val revenuePerShare: PriceValue?,
)
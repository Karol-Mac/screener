package com.stocks.screener.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class EarningsEstimate (
    val avg: PriceValue,
    val low: PriceValue,
    val high: PriceValue,
    val yearAgoEps: PriceValue,
    val numberOfAnalysts: VolumeValue
)
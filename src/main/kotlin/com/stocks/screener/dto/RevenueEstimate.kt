package com.stocks.screener.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class RevenueEstimate (
    val avg: VolumeValue,
    val low: VolumeValue,
    val high: VolumeValue,
    val numberOfAnalysts: VolumeValue,
    val yearAgoRevenue: VolumeValue
)

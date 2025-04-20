package com.stocks.screener.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
data class DefaultKeyStatistics(

    val enterpriseValue: VolumeValue?,
    val priceToBook: PriceValue?,
    val forwardEps: PriceValue?,

    val enterpriseToRevenue: PriceValue?,
    val enterpriseToEbitda: PriceValue?,
)
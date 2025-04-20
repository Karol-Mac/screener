package com.stocks.screener.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class SummaryDetail(

    val dividendRate: PriceValue?,
    val dividendYield: PriceValue?,
    val exDividendDate: PriceValue?,
    val payoutRatio: PriceValue?,
    val trailingAnnualDividendRate: PriceValue?,
    val trailingAnnualDividendYield: PriceValue?,
    val fiveYearAvgDividendYield: PriceValue?,


    val forwardPE: PriceValue?,
    val marketCap: VolumeValue?,

    val fiftyTwoWeekLow: PriceValue?,
    val fiftyTwoWeekHigh: PriceValue?,

    val priceToSalesTrailing12Months: PriceValue?,
    val fiftyDayAverage: PriceValue?,
    val twoHundredDayAverage: PriceValue?,
)
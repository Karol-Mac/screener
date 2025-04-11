package com.stocks.screener.client

import com.stocks.screener.dto.QuoteResponse
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.service.annotation.GetExchange


interface FmpQuoteClient {

    @GetExchange("/quote")
    fun getQuote(
                    @RequestParam symbol: String,
                    @RequestParam apikey: String):
            List<QuoteResponse>
}
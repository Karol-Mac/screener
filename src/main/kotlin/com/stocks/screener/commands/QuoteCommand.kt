package com.stocks.screener.commands

import com.stocks.screener.client.YahooFinanceClient
import com.stocks.screener.properties.YahooFinanceApiProperties
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod

@ShellComponent
class QuoteCommand(
    private val quoteClient: YahooFinanceClient,
    private val yahooFinanceApiProperties: YahooFinanceApiProperties,
) {

//    @ShellMethod(key = ["quote"], value = "Pobiera cenę i market cap dla wybranego symbolu")
//    fun getAllData(ticker: String): String {
//            val result = quoteClient.getQuote(ticker.uppercase(), yahooFinanceApiProperties.apiKey)
//
//            if(result.isEmpty())
//                return "⚠️ Brak danych dla symbol: $ticker"
//
//            return "${result.first()}"
//    }
}
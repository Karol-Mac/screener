package com.stocks.screener.commands

import com.stocks.screener.client.FmpQuoteClient
import com.stocks.screener.properties.FmpApiProperties
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod

@ShellComponent
class QuoteCommand(
    private val quoteClient: FmpQuoteClient,
    private val fmpApiProperties: FmpApiProperties
) {

    @ShellMethod(key = ["quote"], value = "Pobiera cenę i market cap dla wybranego symbolu")
    fun getQuote(ticker: String): String {
            val result = quoteClient.getQuote(ticker.uppercase(), fmpApiProperties.apiKey)

            if(result.isEmpty())
                return "⚠️ Brak danych dla symbol: $ticker"

            return "${result.first()}"
    }
}
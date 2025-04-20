package com.stocks.screener.config

import com.stocks.screener.client.YahooFinanceClient
import com.stocks.screener.properties.YahooFinanceApiProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient
import org.springframework.web.client.support.RestClientAdapter
import org.springframework.web.service.invoker.HttpServiceProxyFactory

@Configuration
class HttpClientConfig(
    private val yahooFinanceApiProperties: YahooFinanceApiProperties
) {

    @Bean
    fun fmpQuoteClient(): YahooFinanceClient {
        val client = RestClient.builder()
            .baseUrl(yahooFinanceApiProperties.baseUrl)
            .build()

        val factory = HttpServiceProxyFactory
            .builderFor(RestClientAdapter.create(client))
            .build()

        return factory.createClient(YahooFinanceClient::class.java)
    }
}
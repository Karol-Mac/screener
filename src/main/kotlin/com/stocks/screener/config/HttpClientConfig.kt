package com.stocks.screener.config

import com.stocks.screener.client.FmpQuoteClient
import com.stocks.screener.properties.FmpApiProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient
import org.springframework.web.client.support.RestClientAdapter
import org.springframework.web.service.invoker.HttpServiceProxyFactory

@Configuration
class HttpClientConfig(
    private val fmpApiProperties: FmpApiProperties
) {

    @Bean
    fun fmpQuoteClient(): FmpQuoteClient {
        val client = RestClient.builder()
            .baseUrl(fmpApiProperties.baseUrl)
            .build()

        val factory = HttpServiceProxyFactory
            .builderFor(RestClientAdapter.create(client))
            .build()

        return factory.createClient(FmpQuoteClient::class.java)
    }
}
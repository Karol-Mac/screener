package com.stocks.screener.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "fmp.api")
class FmpApiProperties {
    lateinit var apiKey: String
    lateinit var baseUrl: String
}
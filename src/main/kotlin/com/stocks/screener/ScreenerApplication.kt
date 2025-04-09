package com.stocks.screener

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ScreenerApplication

fun main(args: Array<String>) {
	runApplication<ScreenerApplication>(*args)
}

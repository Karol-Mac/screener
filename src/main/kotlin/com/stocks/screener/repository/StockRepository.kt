package com.stocks.screener.repository

import com.stocks.screener.model.Stock
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository : MongoRepository<Stock, String> {
//    fun findByPriceTargetUpsideGreaterThanEqual(upside: BigDecimal): List<Stock>
}
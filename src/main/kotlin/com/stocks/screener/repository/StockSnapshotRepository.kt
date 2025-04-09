package com.stocks.screener.repository

import com.stocks.screener.model.Stock
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StockSnapshotRepository : MongoRepository<Stock, String> {
//    fun findByUpdatedAtIsBetween(updatedAtAfter: LocalDateTime, updatedAtBefore: LocalDateTime): List<StockSnapshot>
//
//    fun findMaxUpsideByUpdatedAtIsBetween(updatedAtAfter: LocalDateTime, updatedAtBefore: LocalDateTime): Double
//    fun findMinUpsideByUpdatedAtIsBetween(updatedAtAfter: LocalDateTime, updatedAtBefore: LocalDateTime): Double
}
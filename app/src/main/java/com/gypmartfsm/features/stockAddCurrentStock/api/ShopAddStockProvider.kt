package com.gypmartfsm.features.stockAddCurrentStock.api

import com.gypmartfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.gypmartfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}
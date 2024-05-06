package com.breezefieldsalesgypmart.features.stockAddCurrentStock.api

import com.breezefieldsalesgypmart.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesgypmart.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}
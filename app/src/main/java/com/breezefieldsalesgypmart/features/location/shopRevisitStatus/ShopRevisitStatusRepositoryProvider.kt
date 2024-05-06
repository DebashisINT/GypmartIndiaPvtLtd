package com.breezefieldsalesgypmart.features.location.shopRevisitStatus

import com.breezefieldsalesgypmart.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesgypmart.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}
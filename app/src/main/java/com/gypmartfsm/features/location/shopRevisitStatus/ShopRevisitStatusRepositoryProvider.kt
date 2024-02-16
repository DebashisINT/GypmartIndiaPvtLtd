package com.gypmartfsm.features.location.shopRevisitStatus

import com.gypmartfsm.features.location.shopdurationapi.ShopDurationApi
import com.gypmartfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}
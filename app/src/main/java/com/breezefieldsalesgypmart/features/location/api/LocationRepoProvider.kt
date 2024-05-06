package com.breezefieldsalesgypmart.features.location.api

import com.breezefieldsalesgypmart.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesgypmart.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}
package com.gypmartfsm.features.location.api

import com.gypmartfsm.features.location.shopdurationapi.ShopDurationApi
import com.gypmartfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}
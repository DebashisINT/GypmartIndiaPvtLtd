package com.breezefieldsalesgypmart.features.nearbyshops.api

/**
 * Created by Pratishruti on 28-11-2017.
 */
object ShopListRepositoryProvider {
    fun provideShopListRepository(): ShopListRepository {
        return ShopListRepository(ShopListApi.create())
    }
}
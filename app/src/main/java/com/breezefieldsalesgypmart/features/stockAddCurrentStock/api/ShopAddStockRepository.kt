package com.breezefieldsalesgypmart.features.stockAddCurrentStock.api

import com.breezefieldsalesgypmart.base.BaseResponse
import com.breezefieldsalesgypmart.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalesgypmart.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesgypmart.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalesgypmart.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalesgypmart.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}
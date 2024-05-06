package com.breezefieldsalesgypmart.features.stockCompetetorStock.api

import com.breezefieldsalesgypmart.base.BaseResponse
import com.breezefieldsalesgypmart.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsalesgypmart.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalesgypmart.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}
package com.gypmartfsm.features.stockAddCurrentStock.api

import com.gypmartfsm.base.BaseResponse
import com.gypmartfsm.features.location.model.ShopRevisitStatusRequest
import com.gypmartfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.gypmartfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.gypmartfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.gypmartfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}
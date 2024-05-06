package com.breezefieldsalesgypmart.features.location.shopRevisitStatus

import com.breezefieldsalesgypmart.base.BaseResponse
import com.breezefieldsalesgypmart.features.location.model.ShopDurationRequest
import com.breezefieldsalesgypmart.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}
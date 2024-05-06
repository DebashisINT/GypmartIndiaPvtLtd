package com.breezefieldsalesgypmart.features.nearbyuserlist.api

import com.breezefieldsalesgypmart.app.Pref
import com.breezefieldsalesgypmart.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesgypmart.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesgypmart.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}
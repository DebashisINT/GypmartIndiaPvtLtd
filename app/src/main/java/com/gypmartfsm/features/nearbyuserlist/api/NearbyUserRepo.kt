package com.gypmartfsm.features.nearbyuserlist.api

import com.gypmartfsm.app.Pref
import com.gypmartfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.gypmartfsm.features.newcollection.model.NewCollectionListResponseModel
import com.gypmartfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}
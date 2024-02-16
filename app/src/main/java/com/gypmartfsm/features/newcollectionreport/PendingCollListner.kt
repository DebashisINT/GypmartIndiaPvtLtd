package com.gypmartfsm.features.newcollectionreport

import com.gypmartfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}
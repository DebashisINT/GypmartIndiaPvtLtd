package com.breezefieldsalesgypmart.features.newcollectionreport

import com.breezefieldsalesgypmart.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}
package com.breezefieldsalesgypmart.features.photoReg.adapter

import com.breezefieldsalesgypmart.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}
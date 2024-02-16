package com.gypmartfsm.features.photoReg.adapter

import com.gypmartfsm.features.photoReg.model.ProsCustom
import com.gypmartfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}
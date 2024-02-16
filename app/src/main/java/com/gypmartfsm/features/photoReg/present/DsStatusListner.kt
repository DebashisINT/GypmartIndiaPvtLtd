package com.gypmartfsm.features.photoReg.present

import com.gypmartfsm.app.domain.ProspectEntity
import com.gypmartfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}
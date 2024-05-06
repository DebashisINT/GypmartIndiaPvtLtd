package com.breezefieldsalesgypmart.features.photoReg.present

import com.breezefieldsalesgypmart.app.domain.ProspectEntity
import com.breezefieldsalesgypmart.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}
package com.breezefieldsalesgypmart.features.login.model

import com.breezefieldsalesgypmart.base.BaseResponse
import java.io.Serializable

/**
 * Created by Saikat on 16-Apr-20.
 */
class NewSettingsResponseModel : Serializable, BaseResponse() {
    var isFingerPrintMandatoryForAttendance: Boolean? = null
    var isFingerPrintMandatoryForVisit: Boolean? = null
    var isSelfieMandatoryForAttendance: Boolean? = null
    var isAddAttendence: Boolean? = null
}
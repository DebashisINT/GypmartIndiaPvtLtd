package com.gypmartfsm.features.login.model.productlistmodel

import com.gypmartfsm.app.domain.ModelEntity
import com.gypmartfsm.app.domain.ProductListEntity
import com.gypmartfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}
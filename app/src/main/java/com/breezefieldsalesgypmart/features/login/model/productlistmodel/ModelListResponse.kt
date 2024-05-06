package com.breezefieldsalesgypmart.features.login.model.productlistmodel

import com.breezefieldsalesgypmart.app.domain.ModelEntity
import com.breezefieldsalesgypmart.app.domain.ProductListEntity
import com.breezefieldsalesgypmart.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}
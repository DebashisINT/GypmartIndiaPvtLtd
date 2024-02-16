package com.gypmartfsm.features.viewAllOrder.orderOptimized

import com.gypmartfsm.app.domain.ProductOnlineRateTempEntity
import com.gypmartfsm.base.BaseResponse
import com.gypmartfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}
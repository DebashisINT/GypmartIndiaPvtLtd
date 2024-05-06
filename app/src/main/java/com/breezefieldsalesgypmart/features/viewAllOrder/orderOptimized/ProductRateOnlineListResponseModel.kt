package com.breezefieldsalesgypmart.features.viewAllOrder.orderOptimized

import com.breezefieldsalesgypmart.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesgypmart.base.BaseResponse
import com.breezefieldsalesgypmart.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}
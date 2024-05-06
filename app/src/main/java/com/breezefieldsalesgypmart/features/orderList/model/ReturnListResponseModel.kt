package com.breezefieldsalesgypmart.features.orderList.model

import com.breezefieldsalesgypmart.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}
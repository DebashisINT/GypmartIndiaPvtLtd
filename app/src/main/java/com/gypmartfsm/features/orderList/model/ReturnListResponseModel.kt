package com.gypmartfsm.features.orderList.model

import com.gypmartfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}
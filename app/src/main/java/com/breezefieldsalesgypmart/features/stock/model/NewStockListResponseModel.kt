package com.breezefieldsalesgypmart.features.stock.model

import com.breezefieldsalesgypmart.base.BaseResponse


/**
 * Created by Saikat on 17-09-2019.
 */
class NewStockListResponseModel : BaseResponse() {
    var stock_list: ArrayList<StockListDataModel>? = null
}
package com.breezefieldsalesgypmart.features.viewAllOrder.model

import com.breezefieldsalesgypmart.app.domain.NewOrderColorEntity
import com.breezefieldsalesgypmart.app.domain.NewOrderGenderEntity
import com.breezefieldsalesgypmart.app.domain.NewOrderProductEntity
import com.breezefieldsalesgypmart.app.domain.NewOrderSizeEntity
import com.breezefieldsalesgypmart.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}


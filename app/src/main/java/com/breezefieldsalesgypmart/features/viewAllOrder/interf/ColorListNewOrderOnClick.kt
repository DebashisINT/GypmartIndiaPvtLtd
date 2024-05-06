package com.breezefieldsalesgypmart.features.viewAllOrder.interf

import com.breezefieldsalesgypmart.app.domain.NewOrderColorEntity
import com.breezefieldsalesgypmart.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}
package com.breezefieldsalesgypmart.features.viewAllOrder.interf

import com.breezefieldsalesgypmart.app.domain.NewOrderProductEntity
import com.breezefieldsalesgypmart.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}
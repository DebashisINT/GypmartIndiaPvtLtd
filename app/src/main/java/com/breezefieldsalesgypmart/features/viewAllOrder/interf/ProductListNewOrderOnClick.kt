package com.breezefieldsalesgypmart.features.viewAllOrder.interf

import com.breezefieldsalesgypmart.app.domain.NewOrderGenderEntity
import com.breezefieldsalesgypmart.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}
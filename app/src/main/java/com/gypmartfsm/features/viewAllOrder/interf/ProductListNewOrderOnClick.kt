package com.gypmartfsm.features.viewAllOrder.interf

import com.gypmartfsm.app.domain.NewOrderGenderEntity
import com.gypmartfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}
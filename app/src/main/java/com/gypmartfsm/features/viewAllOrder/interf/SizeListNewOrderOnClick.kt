package com.gypmartfsm.features.viewAllOrder.interf

import com.gypmartfsm.app.domain.NewOrderProductEntity
import com.gypmartfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}
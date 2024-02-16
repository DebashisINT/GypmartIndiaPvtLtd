package com.gypmartfsm.features.viewAllOrder.interf

import com.gypmartfsm.app.domain.NewOrderColorEntity
import com.gypmartfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}
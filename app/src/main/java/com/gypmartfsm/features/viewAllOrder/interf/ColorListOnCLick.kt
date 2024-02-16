package com.gypmartfsm.features.viewAllOrder.interf

import com.gypmartfsm.app.domain.NewOrderGenderEntity
import com.gypmartfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}
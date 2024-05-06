package com.breezefieldsalesgypmart.features.viewAllOrder.interf

import com.breezefieldsalesgypmart.app.domain.NewOrderGenderEntity
import com.breezefieldsalesgypmart.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}
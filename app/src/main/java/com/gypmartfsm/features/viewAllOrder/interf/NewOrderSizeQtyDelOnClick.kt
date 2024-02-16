package com.gypmartfsm.features.viewAllOrder.interf

import com.gypmartfsm.app.domain.NewOrderGenderEntity
import com.gypmartfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}
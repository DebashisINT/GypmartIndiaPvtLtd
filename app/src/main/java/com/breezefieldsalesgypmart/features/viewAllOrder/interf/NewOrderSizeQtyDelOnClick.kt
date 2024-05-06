package com.breezefieldsalesgypmart.features.viewAllOrder.interf

import com.breezefieldsalesgypmart.app.domain.NewOrderGenderEntity
import com.breezefieldsalesgypmart.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}
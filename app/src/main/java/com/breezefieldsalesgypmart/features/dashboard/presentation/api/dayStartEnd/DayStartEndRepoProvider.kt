package com.breezefieldsalesgypmart.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesgypmart.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesgypmart.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}
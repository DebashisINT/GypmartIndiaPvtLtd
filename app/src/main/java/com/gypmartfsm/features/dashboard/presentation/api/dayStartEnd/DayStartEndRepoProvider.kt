package com.gypmartfsm.features.dashboard.presentation.api.dayStartEnd

import com.gypmartfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.gypmartfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}
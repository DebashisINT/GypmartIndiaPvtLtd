package com.gypmartfsm.features.lead.api

import com.gypmartfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.gypmartfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}
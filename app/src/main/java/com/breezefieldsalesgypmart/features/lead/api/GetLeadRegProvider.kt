package com.breezefieldsalesgypmart.features.lead.api

import com.breezefieldsalesgypmart.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesgypmart.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}
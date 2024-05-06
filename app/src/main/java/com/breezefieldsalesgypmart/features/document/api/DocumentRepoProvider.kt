package com.breezefieldsalesgypmart.features.document.api

import com.breezefieldsalesgypmart.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesgypmart.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}
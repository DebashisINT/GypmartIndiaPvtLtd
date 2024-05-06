package com.breezefieldsalesgypmart.features.survey.api

import com.breezefieldsalesgypmart.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalesgypmart.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}
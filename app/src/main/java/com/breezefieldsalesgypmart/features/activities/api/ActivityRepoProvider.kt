package com.breezefieldsalesgypmart.features.activities.api

import com.breezefieldsalesgypmart.features.member.api.TeamApi
import com.breezefieldsalesgypmart.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}
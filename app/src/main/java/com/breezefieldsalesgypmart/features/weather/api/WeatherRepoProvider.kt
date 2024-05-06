package com.breezefieldsalesgypmart.features.weather.api

import com.breezefieldsalesgypmart.features.task.api.TaskApi
import com.breezefieldsalesgypmart.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}
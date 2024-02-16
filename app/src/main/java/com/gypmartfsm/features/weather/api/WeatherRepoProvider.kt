package com.gypmartfsm.features.weather.api

import com.gypmartfsm.features.task.api.TaskApi
import com.gypmartfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}
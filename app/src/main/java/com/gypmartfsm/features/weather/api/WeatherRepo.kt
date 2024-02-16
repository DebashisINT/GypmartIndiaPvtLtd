package com.gypmartfsm.features.weather.api

import com.gypmartfsm.base.BaseResponse
import com.gypmartfsm.features.task.api.TaskApi
import com.gypmartfsm.features.task.model.AddTaskInputModel
import com.gypmartfsm.features.weather.model.ForeCastAPIResponse
import com.gypmartfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}
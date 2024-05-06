package com.breezefieldsalesgypmart.features.weather.api

import com.breezefieldsalesgypmart.base.BaseResponse
import com.breezefieldsalesgypmart.features.task.api.TaskApi
import com.breezefieldsalesgypmart.features.task.model.AddTaskInputModel
import com.breezefieldsalesgypmart.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesgypmart.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}
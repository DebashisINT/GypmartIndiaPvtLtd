package com.breezefieldsalesgypmart.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesgypmart.app.FileUtils
import com.breezefieldsalesgypmart.app.Pref
import com.breezefieldsalesgypmart.base.BaseResponse
import com.breezefieldsalesgypmart.features.addshop.model.AddLogReqData
import com.breezefieldsalesgypmart.features.addshop.model.AddShopRequestData
import com.breezefieldsalesgypmart.features.addshop.model.AddShopResponse
import com.breezefieldsalesgypmart.features.addshop.model.LogFileResponse
import com.breezefieldsalesgypmart.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesgypmart.features.contacts.CallHisDtls
import com.breezefieldsalesgypmart.features.contacts.CompanyReqData
import com.breezefieldsalesgypmart.features.contacts.ContactMasterRes
import com.breezefieldsalesgypmart.features.contacts.SourceMasterRes
import com.breezefieldsalesgypmart.features.contacts.StageMasterRes
import com.breezefieldsalesgypmart.features.contacts.StatusMasterRes
import com.breezefieldsalesgypmart.features.contacts.TypeMasterRes
import com.breezefieldsalesgypmart.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesgypmart.features.login.model.WhatsappApiData
import com.breezefieldsalesgypmart.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}
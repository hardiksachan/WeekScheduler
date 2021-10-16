package com.hardiksachan.weekscheduler.domain.repository

import com.hardiksachan.weekscheduler.common.ResultWrapper
import com.hardiksachan.weekscheduler.domain.model.User
import kotlinx.coroutines.flow.SharedFlow

typealias AuthException = Exception

interface IAuthRepository {

    suspend fun register(
        emailAddress: String,
        name: String,
        password: String,
    ): ResultWrapper<AuthException, User>

    suspend fun login(
        emailAddress: String,
        password: String,
    ): ResultWrapper<AuthException, User>

    fun getCurrentUserId(): SharedFlow<ResultWrapper<AuthException, String>>

    fun getCurrentUser(): SharedFlow<ResultWrapper<AuthException, User>>

}
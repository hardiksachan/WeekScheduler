package com.hardiksachan.weekscheduler.data.auth

import com.hardiksachan.weekscheduler.common.ResultWrapper
import com.hardiksachan.weekscheduler.domain.model.User
import com.hardiksachan.weekscheduler.domain.repository.*
import io.appwrite.services.Account
import kotlinx.coroutines.flow.SharedFlow

class AppwriteAuthRepository(
    private val authCache: IAuthCache,
    private val appwriteAuth: Account
) : IAuthRepository {

    override suspend fun register(
        emailAddress: String,
        name: String,
        password: String
    ): ResultWrapper<AuthException, User> {
        TODO("Not yet implemented")
    }

    override suspend fun login(
        emailAddress: String,
        password: String
    ): ResultWrapper<AuthException, User> {
        TODO("Not yet implemented")
    }

    override fun getCurrentUserId(): SharedFlow<ResultWrapper<AuthException, String>> {
        TODO("Not yet implemented")
    }

    override fun getCurrentUser(): SharedFlow<ResultWrapper<AuthException, User>> {
        TODO("Not yet implemented")
    }
}
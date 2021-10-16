package com.hardiksachan.weekscheduler.data.auth.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("\$id") val id: String,
    val name: String,
    val email: String,
)

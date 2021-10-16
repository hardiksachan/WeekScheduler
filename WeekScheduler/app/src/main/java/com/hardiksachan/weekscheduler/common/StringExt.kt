package com.hardiksachan.weekscheduler.common

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

inline fun <reified T> String.serialize(jsonParser: Json): T =
    jsonParser.decodeFromString(this)
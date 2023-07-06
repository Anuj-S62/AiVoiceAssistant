package com.example.aivoiceassistant.features.alarm

import java.time.LocalDateTime

data class AlarmItem(
    val time: LocalDateTime,
    val message: String
)
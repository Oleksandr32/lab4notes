package com.oleksandrlysun.lab4notes.presentation.utils

import java.text.SimpleDateFormat
import java.util.Date

object DateFormatter {

    private val sdf = SimpleDateFormat("dd.MM.yyyy")

    @JvmStatic
    fun dateAsString(date: Date): String {
        return sdf.format(date)
    }
}
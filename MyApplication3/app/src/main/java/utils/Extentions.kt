package com.example.utils


fun Double.toPassStatus(): String {
    return if (this >= 5.0) "Đạt" else "Chưa đạt"
}

fun Double.toAcademicRanking(): String {
    return when {
        this >= 8.5 -> "Giỏi"
        this >= 7.0 -> "Khá"
        this >= 5.0 -> "Trung bình"
        else -> "Yếu"
    }
}


fun String.toUppercaseName(): String {
    return this.uppercase()
}
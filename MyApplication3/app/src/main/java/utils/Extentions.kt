package com.example.utils
import com.example.Model.Student

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
fun Double.toSpeciaFormat(): String{
    return String.format("[%2f / 10.0 PTS",this)
}
fun Student.getStudentSummary():String{
    return """
        Sinh vien :${this.fullName.uppercase()}
        Chuyen nganh:${this.major}
        lop:${this.className}
        tuoi:${this.age}
    """.trimIndent()
}
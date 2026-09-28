package com.example.myapplication


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.Model.Student
import com.example.utils.toUppercaseName
import com.example.utils.toPassStatus
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myStudent = Student(
            studentId = "2415053122248",
            fullName = "Pham Tran Thanh Vinh",
            className = "24T2",
            age = 20,
            score = 8.5
        )

        binding.tvStudentId.text = "Mã SV: ${myStudent.studentId}"
        binding.tvClass.text = "Lớp: ${myStudent.className}"
        binding.tvAge.text = "Tuổi: ${myStudent.age}"
        binding.tvScore.text = "Điểm: ${myStudent.score}"

        // Tùy chọn A: Dùng Extension viết hoa tên
        binding.tvFullName.text = "Họ tên: ${myStudent.fullName.toUppercaseName()}"

        // Tùy chọn B: Dùng Extension xếp loại / Đạt - Chưa đạt
        binding.tvExtensionResult.text = "Trạng thái: ${myStudent.score.toPassStatus()}"
        // Hoặc: binding.tvExtensionResult.text = "Xếp loại: ${myStudent.score.toAcademicRanking()}"
    }
}
package com.example.cardviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cardviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val student = Student("Nguyễn Vũ Hoàng Ngân", 3.85)

        // 1. Cập nhật nội dung các View bên trong Card
        binding.tvStudentName.text = "Họ và tên: ${student.name}"
        binding.tvGpa.text = "${student.gpa}"

        // 2. Tùy biến thuộc tính CardView động tại runtime
        binding.cardStudent.radius = 32f              // Đổi bo góc
        binding.cardStudent.cardElevation = 16f       // Tăng độ nổi
    }
}

data class Student(val name: String, val gpa: Double)
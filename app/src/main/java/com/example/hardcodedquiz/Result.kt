package com.example.hardcodedquiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hardcodedquiz.databinding.ActivityResultBinding

class Result : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName=intent.getStringExtra(setData.name)
        val score=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size")

        binding.congo.text="Congratulations ${userName} !!"
        binding.Score.text="${score} / ${totalQuestion}"
        binding.button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}
package com.example.hardcodedquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.hardcodedquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        binding.button.setOnClickListener {
            if(binding.input.text.toString().isEmpty())
            {
                Toast.makeText(this,"Enter Your Name", Toast.LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra("${setData.name}",binding.input.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
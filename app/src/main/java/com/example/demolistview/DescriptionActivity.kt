package com.example.demolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demolistview.databinding.ActivityDescriptionBinding

class DescriptionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val lang = intent.getStringExtra("language")
        val descr = intent.getStringExtra("description")

        binding.txtTitleDescr.text = lang.toString()
        binding.txtSubtitleDescr.text = descr.toString()

    }
}
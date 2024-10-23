package com.example.beer

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnBeer : Button = findViewById(R.id.btnBeer)
        val tvBeer : TextView = findViewById(R.id.tvBeer)
        val spineerBeer : Spinner = findViewById(R.id.spinBeer)
        val imageBeer:ImageView=findViewById(R.id.imageView)
        btnBeer.setOnClickListener {
            val type = spineerBeer.selectedItem
            tvBeer.text = ("Ваш тип пива $type")
            when (type){
                "Тёмное"-> imageBeer.setImageResource(R.drawable.rjanoe)
                "Водка"-> imageBeer.setImageResource(R.drawable.skuf)
                "Светлое"-> imageBeer.setImageResource(R.drawable.svetloe)
                "Ржанное"-> imageBeer.setImageResource(R.drawable.gleb)
                "Сладкое"-> imageBeer.setImageResource(R.drawable.govnoasxabatamaeva)
                "Горькое"-> imageBeer.setImageResource(R.drawable.gorkoe)
            }
        }


    }
}
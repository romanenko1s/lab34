package com.example.lab34

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

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

        val buttonText1: Button = findViewById(R.id.button1)
        val buttonText2: Button = findViewById(R.id.button2)
        val buttonText3: Button = findViewById(R.id.button3)

        val buttonHide: Button = findViewById(R.id.button4)
        val buttonShow: Button = findViewById(R.id.button5)

        val textField1: TextView = findViewById(R.id.textView1)
        val textField2: TextView = findViewById(R.id.textView2)
        val textField3: TextView = findViewById(R.id.textView3)

        fun hideAllText() {
            textField1.text = ""
            textField2.text = ""
            textField3.text = ""
        }

        // обробники натискань на текст
        // при натисканні на текст, текст змінює колір на випадковий
        textField1.setOnClickListener {
            val randomColor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256),
            )
            textField1.setTextColor(randomColor)
        }
        textField2.setOnClickListener {
            val randomColor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256),
            )
            textField2.setTextColor(randomColor)
        }
        textField3.setOnClickListener {
            val randomColor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256),
            )
            textField3.setTextColor(randomColor)
        }

        // обробники кнопок
        // кнопки що наповнюють контентом текстові поля, та видаляють дані з "неактивних"
        buttonText1.setOnClickListener {
            hideAllText()
            textField1.text = "Автором цього застосунку є Романенко Ілля"
        }
        buttonText2.setOnClickListener {
            hideAllText()
            textField2.text = "Група ФІТ 4-7 налічує в собі 28 студентів"
        }
        buttonText3.setOnClickListener {
            hideAllText()
            textField3.text = "Автор цього додатку проживає в Києві"
        }

        // кнопки видимості текстових полів
        buttonHide.setOnClickListener {
            textField1.visibility = View.GONE
            textField2.visibility = View.GONE
            textField3.visibility = View.GONE
        }
        buttonShow.setOnClickListener {
            textField1.visibility = View.VISIBLE
            textField2.visibility = View.VISIBLE
            textField3.visibility = View.VISIBLE
        }
    }
}
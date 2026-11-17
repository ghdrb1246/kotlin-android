package com.androidbook.bookmarket

/*
import android.os.Bundle
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
    }
}*/

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Person {
    var name: String = ""
    var age: Int = 0
}

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

        var nickname: String? = "John"
        nickname = null
        Log.d("코틀린 : Nullable", "nickname = " + nickname)

        val name: String? = "Kotlin"
        name?.let {
            Log.d("코틀린 : let", "이름의 길이는 ${it.length}입니다.")
        }

        val greeting: String? = "Hello, Kotlin"
        val messageLength = greeting?.run {
            Log.d("코틀린 : run", "이름은 $this 입니다.")
            length
        }
        Log.d("코틀린 : run", "길이: $messageLength")

        val result = with(StringBuilder()) {
            append("Hello, ")
            append("Kotlin!")
            toString()
        }
        Log.d("코틀린 : with", result)

        val person = Person().apply {
            this.name = "John"
            age = 25
        }
        Log.d("코틀린 : apply", person.name)

        val number = mutableListOf(1, 2, 3).also {
            Log.d("코틀린 : also", "리스트의 크기: ${it.size}")
            it.add(4)
        }
        Log.d("코틀린 : also", number.toString())
    }
}
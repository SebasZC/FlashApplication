package com.example.flashapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class RegisterActivity : AppCompatActivity() {

    val app by lazy { applicationContext as DataBaseApp }
    //val app= applicationContext as DataBaseApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val button=findViewById<Button>(R.id.btn_register)
        button.setOnClickListener {

                app.room.brandLeaderDao().insert(BrandLeader(
                    100,
                    "sebas",
                    "as",
                    "za",
                    "za",
                    "aaaaa",
                    "asasas"
                ))
               val bls = app.room.brandLeaderDao().getAll()
                Log.d("", bls.toString() + "HH")



        }



    }




}
package com.erikaosgue.introduction


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.erikaosgue.introduction.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        var enterText = enterNameEdt.text

        showNameButton.setOnClickListener{ resultId.text = enterText}

        // Appears the message Hello there, for a short time
        Toast.makeText(this, "Hello there", Toast.LENGTH_LONG)
            .show()


    }
}
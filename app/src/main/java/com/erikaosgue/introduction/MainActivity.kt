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


        /************************* Exercise 1 **********************/
        /**
        var enterText = enterNameEdt.text

        showNameButton.setOnClickListener{ resultId.text = enterText}

        // Appears the message Hello there, for a short time
        Toast.makeText(this, "Hello there", Toast.LENGTH_LONG)
            .show()
        **/

        /************************* Exercise 2 **********************/
        // Exercise of Linear Layouts
        //* Add a Child LinearLayout and Inside of this add the grant children


        /************************* Exercise 3 **********************/
        // Exercise of Relative Layouts
        /* Change the Parent constraint for RelativeLayout
        KeyWords:
            * centerHorizontal
            * centerVertical
            * toRightOf
            * alignBottom
        */





    }
}
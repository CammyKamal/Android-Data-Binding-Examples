package com.kamal.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kamal.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var userObj: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        userObj = User("Updating Value in OnCreate")
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).also {
                it.user = userObj
            }

        btn_click.setOnClickListener {
            userObj = User("Changed Value on Click")
            binding.user = userObj
            binding.executePendingBindings()
        }
    }
}

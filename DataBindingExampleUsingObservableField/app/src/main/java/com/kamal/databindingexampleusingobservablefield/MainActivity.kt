package com.kamal.databindingexampleusingobservablefield

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.kamal.databindingexampleusingobservablefield.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var userObj: User= User(ObservableField("changed in on Create"))
        val binding: ActivityMainBinding= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main).also{
            it.user=userObj
        }

        btn_click.setOnClickListener {
            binding.user!!.name.set("Changed value inside onclick")
        }
    }
}
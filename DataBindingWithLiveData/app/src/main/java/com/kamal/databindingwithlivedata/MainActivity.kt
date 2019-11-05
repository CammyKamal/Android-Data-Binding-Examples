package com.kamal.databindingwithlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProviders
import com.kamal.databindingwithlivedata.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]
        viewModel.name = MutableLiveData()
        viewModel.name.value = "Value set inside OnCreate"
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).also {
            it.viewModel = viewModel
            it.lifecycleOwner = this
        }

        btn_click.setOnClickListener {
            viewModel.name.value = "Value set on Button Click"
        }
    }
}

package com.kamal.recyclerviewdatabindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.kamal.recyclerviewdatabindingexample.databinding.ActivityMainBinding
import com.kamal.ui.MyAdapterClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        recycler_view.adapter = MyAdapterClass(viewModel.dataList)
    }
}

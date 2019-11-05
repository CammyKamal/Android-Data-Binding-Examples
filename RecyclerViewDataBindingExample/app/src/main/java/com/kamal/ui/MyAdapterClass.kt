package com.kamal.ui

import android.util.Log
import com.kamal.base.ClickCallback
import com.kamal.recyclerviewdatabindingexample.DataClass
import com.kamal.recyclerviewdatabindingexample.R
import com.kamal.recyclerviewdatabindingexample.RecyclerBaseAdapterClass

class MyAdapterClass(var data: List<DataClass>) : RecyclerBaseAdapterClass(), ClickCallback {

    override fun getLayoutIdForPosition(position: Int) = R.layout.row_data_item

    override fun getDataModel(position: Int) = data[position]

    override fun getItemCount() = data.size

    override fun getOnClickListener()= this

    override fun onClick( position: Int) {
        Log.e("Clicked Pos:", position.toString())
    }

}
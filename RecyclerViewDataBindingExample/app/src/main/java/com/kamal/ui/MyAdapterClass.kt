package com.kamal.ui

import android.util.Log
import com.kamal.base.ClickCallback
import com.kamal.model.DataClass
import com.kamal.model.R
import com.kamal.model.RecyclerBaseAdapterClass

class MyAdapterClass(var data: List<DataClass>) : RecyclerBaseAdapterClass(), ClickCallback {

    override fun getLayoutIdForPosition(position: Int) = R.layout.row_data_item

    override fun getDataModel(position: Int) = data[position]

    override fun getItemCount() = data.size

    override fun getOnClickListener()= this

    override fun onClick( position: Int) {
        Log.e("Clicked Pos:", position.toString())
    }

}
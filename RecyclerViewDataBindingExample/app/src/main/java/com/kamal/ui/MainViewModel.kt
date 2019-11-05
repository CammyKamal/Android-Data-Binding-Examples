package com.kamal.recyclerviewdatabindingexample

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var dataList: ArrayList<DataClass> = ArrayList()

    init {
        dataList.add(DataClass("1"))
        dataList.add(DataClass("2"))
        dataList.add(DataClass("3"))
        dataList.add(DataClass("4"))
        dataList.add(DataClass("5"))
    }
}
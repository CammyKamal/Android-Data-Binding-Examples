package com.kamal.databindingwithviewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

     var name: ObservableField<String> = ObservableField("")
}
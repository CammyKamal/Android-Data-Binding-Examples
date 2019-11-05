package com.kamal.onewaybindingexample

import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var isChecked: ObservableField<Boolean> = ObservableField(false)

    var dataValue: ObservableField<String> = ObservableField("")

    var name: ObservableField<String> = ObservableField("")

    fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        name.set(s.toString())
    }

    fun onCheckedChanged(view: View, isVisible: Boolean) {
        if (isVisible) {
            dataValue.set("Checked")
        } else {
            dataValue.set("Unchecked")
        }
    }
}
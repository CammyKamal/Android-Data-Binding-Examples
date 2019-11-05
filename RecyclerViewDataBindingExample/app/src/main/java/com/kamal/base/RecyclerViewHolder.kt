package com.kamal.recyclerviewdatabindingexample

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.kamal.base.ClickCallback

open class RecyclerViewHolder(
    val binding: ViewDataBinding,
    var context: ClickCallback?
) : RecyclerView.ViewHolder(binding.root) {
    var listener: ClickCallback? = null
    var posValue: Int = -1

    init {
        binding.root.setOnClickListener {
            listener = context
            listener!!.onClick(posValue)
        }
    }

}
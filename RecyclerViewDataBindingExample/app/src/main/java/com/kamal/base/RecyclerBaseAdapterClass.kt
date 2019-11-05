package com.kamal.recyclerviewdatabindingexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import androidx.recyclerview.widget.RecyclerView
import com.kamal.base.ClickCallback


abstract class RecyclerBaseAdapterClass : RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        RecyclerViewHolder(
            inflate(
                LayoutInflater.from(parent.context),
                viewType,
                parent,
                false
            ),
            listener

        )

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        getDataModel(position)
            ?.let {
                holder.posValue=position
                val bindingSuccess = holder.binding.setVariable(BR.data, it)
                if (!bindingSuccess) {
                    throw IllegalStateException("Binding ${holder.binding} data variable name should be 'data'")
                }
            }
    }

    override fun getItemViewType(position: Int) = getLayoutIdForPosition(position)

    abstract fun getLayoutIdForPosition(position: Int): Int

    abstract fun getDataModel(position: Int): Any?

    var listener: ClickCallback? = getOnClickListener()

    abstract fun getOnClickListener(): ClickCallback?

}
package com.test.empassignment

import com.test.empassignment.Entity.LocationModel
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.ArrayList

class HistoryAdapter(var list: ArrayList<LocationModel>, var mListener: onClic) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_history, parent, false)
        return HistoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as HistoryViewHolder).setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private inner class HistoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvID: TextView = view.findViewById(R.id.tv_id)
        var prnt: ConstraintLayout = view.findViewById(R.id.parent)
        fun setData(locationModel: LocationModel) {
            tvID.text = "" + locationModel.id
            prnt.setOnClickListener { mListener.onItemClick(locationModel) }
        }

    }

    interface onClic {
        fun onItemClick(locationModel: LocationModel?)
    }
}
package com.example.android1homework3kotlinversion

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextAdapter : RecyclerView.Adapter<TextAdapter.TextHolder>() {

    private var listForText: List<String> = emptyList()

    @SuppressLint("NotifyDataSetChanged")
    fun setListForText(listForText: List<String>) {
        this.listForText = listForText
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        return TextHolder(view)
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        holder.onBind(listForText[position])
    }

    override fun getItemCount(): Int {
        return listForText.size
    }

    inner class TextHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textJF: TextView = itemView.findViewById(R.id.text1)

        fun onBind(text: String) {
            textJF.text = text
        }
    }
}
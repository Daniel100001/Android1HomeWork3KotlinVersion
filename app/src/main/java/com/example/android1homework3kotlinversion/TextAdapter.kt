package com.example.android1homework3kotlinversion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextAdapter : RecyclerView.Adapter<TextAdapter.TextHolder>() {
    private var listForText: List<String> = emptyList()

    fun setListForText(listForText: List<String>) {
        this.listForText = listForText
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        return TextHolder(view)
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        holder.bind(listForText[position])
    }

    override fun getItemCount(): Int = listForText.size

    inner class TextHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textJF: TextView = itemView.findViewById(R.id.text1)

        fun bind(text: String) {
            textJF.text = text
        }
    }
}
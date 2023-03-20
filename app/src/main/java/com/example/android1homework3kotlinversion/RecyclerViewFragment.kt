package com.example.android1homework3kotlinversion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewFragment : Fragment() {
    private val adapter = TextAdapter()
    private val listForTextPro: MutableList<String> = ArrayList()
    private var listPOnText: RecyclerView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listPOnText = view.findViewById(R.id.recyclerviewText)

        listForTextPro.add("Почка")
        listForTextPro.add("Данчик")
        listForTextPro.add("Селезенка")
        listForTextPro.add("Легкие")
        listForTextPro.add("руки")
        listForTextPro.add("Ноги")
        listForTextPro.add("Нерв")
        listForTextPro.add("Пон")
        listForTextPro.add("Поджелудочная железа")
        listForTextPro.add("Мозг")
        listForTextPro.add("Печень")
        listForTextPro.add("Печень")
        listForTextPro.add("Воллейбол")
        listForTextPro.add("Баскетбол")
        listForTextPro.add("Бейсбол")
        listForTextPro.add("Стрит Бол")
        listForTextPro.add("Футбол")
        listForTextPro.add("Теннис")
        listForTextPro.add("Печень")
        listForTextPro.add("Печень")
        listForTextPro.add("Печень")

        initialize()
        adapter.setListForText(listForTextPro)
    }

    private fun initialize() {
        listPOnText?.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = this@RecyclerViewFragment.adapter
        }
    }
}
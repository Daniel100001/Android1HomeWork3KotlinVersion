package com.example.android1homework3kotlinversion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton

class FirstFragment : Fragment() {
    private lateinit var button: MaterialButton
    private lateinit var editText: EditText
    private val PASSWORD = "admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editText)
        editText.setText("admin")
        goToRecyclerViewFragment()
    }

    private fun goToRecyclerViewFragment() {
        button.setOnClickListener {
            val bundle = Bundle()
            val recyclerViewFragment = RecyclerViewFragment()
            if (editText.text.toString() == PASSWORD && editText.text.toString().isNotEmpty()) {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view, recyclerViewFragment)
                    .addToBackStack(null)
                    .commit()
            } else {
                Toast.makeText(context, "Пароль не верный", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
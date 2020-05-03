package com.example.redditusername

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

/**
 * A simple [Fragment] subclass.
 */
class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewName = view.findViewById<View>(R.id.textViewName) as TextView
        val textViewAge = view.findViewById<View>(R.id.textViewAge) as TextView
        val textViewUsername = view.findViewById<View>(R.id.textViewUsername) as TextView

        val sharedViewModel = ViewModelProviders.of(activity!!).get(SharedViewModel::class.java)

        sharedViewModel.name.observe(this, Observer<String> { t ->
            val formattedStringName = "Hello " + t!!.toString()
            textViewName.text = formattedStringName
        })

        sharedViewModel.age.observe(this, Observer<String> { t ->
            val formattedStringAge = "You are  " + t!!.toString() + " years of age"
            textViewAge.text = formattedStringAge
        })

        sharedViewModel.userName.observe(this, Observer<String> { t ->
            val formattedStringUsername = "And your Reddit Username is   " + t!!.toString()
            textViewUsername.text = formattedStringUsername
        })

    }
}

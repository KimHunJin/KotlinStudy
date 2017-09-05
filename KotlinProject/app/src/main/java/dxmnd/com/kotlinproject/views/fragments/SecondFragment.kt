package dxmnd.com.kotlinproject.views.fragments

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import dxmnd.com.kotlinproject.R

/**
 * Created by HunJin on 2017-08-18.
 */

class SecondFragment : Fragment() {

    companion object {
        fun getInstance() = SecondFragment()
    }

    val fab by lazy {
        activity.findViewById(R.id.fab_add) as FloatingActionButton
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater?.inflate(R.layout.fragment_second_page, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.setOnClickListener {
            Toast.makeText(context,"test",Toast.LENGTH_SHORT).show()
        }
    }
}
package dxmnd.com.kotlinproject.views.fragments

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dxmnd.com.kotlinproject.R
import dxmnd.com.kotlinproject.adapters.ImageSampleAdapter
import dxmnd.com.kotlinproject.data.ImageItem
import dxmnd.com.kotlinproject.data.model.ImageSampleData
import dxmnd.com.kotlinproject.views.presenter.ImageSampleContract
import dxmnd.com.kotlinproject.views.presenter.ImageSamplePresenter

/**
 * Created by HunJin on 2017-08-18.
 */

class FirstFragment : Fragment(), ImageSampleContract.View {

    private var image: ImageSampleContract.Presenter? = null

    private var adapter: ImageSampleAdapter? = null

    private val recyclerView by lazy {
        view?.findViewById(R.id.rcv_image) as RecyclerView
    }

    private val fab by lazy {
        activity?.findViewById(R.id.fab_add) as FloatingActionButton
    }

    companion object {
        fun getInstance() = FirstFragment()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater?.inflate(R.layout.fragment_first_page, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        image = ImageSamplePresenter()
        image?.view = this

        image?.imageSampleData = ImageSampleData()

        adapter = ImageSampleAdapter(context)
        recyclerView.adapter = adapter

        var layoutManager  = LinearLayoutManager(context,LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = layoutManager

        image?.updateImageSample(context)

        fab.setOnClickListener {
            image?.updateImageSample(context)
        }

    }

    override fun addItem(it: ImageItem) {
        adapter?.addItem(it)
    }

    override fun adapterNotify() {
        adapter?.notifyDataSetChanged()
    }

}
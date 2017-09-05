package dxmnd.com.kotlinproject.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import dxmnd.com.kotlinproject.adapters.holders.ImageSampleViewHolder
import dxmnd.com.kotlinproject.data.ImageItem

/**
 * Created by HunJin on 2017-09-01.
 */


class ImageSampleAdapter(private val context: Context) : RecyclerView.Adapter<ImageSampleViewHolder>() {

    val itemList: MutableList<ImageItem> = ArrayList()

    override fun onBindViewHolder(holder: ImageSampleViewHolder?, position: Int) {
        holder?.bindView(getItem(position), position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ImageSampleViewHolder = ImageSampleViewHolder(context, parent)

    override fun getItemCount(): Int = itemList.size

    private fun getItem(position: Int) = itemList.get(position)

    fun addItem(it: ImageItem) {
        itemList.add(it)
    }

}
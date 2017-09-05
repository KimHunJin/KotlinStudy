package dxmnd.com.kotlinproject.adapters.holders

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import dxmnd.com.kotlinproject.R
import dxmnd.com.kotlinproject.data.ImageItem

/**
 * Created by HunJin on 2017-09-01.
 */

class ImageSampleViewHolder(val context: Context, parent: ViewGroup?) :
        RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image_view, parent, false)) {

    private val imageView by lazy {
        itemView?.findViewById(R.id.image) as ImageView
    }

    fun bindView(image: ImageItem?, position: Int) {
        imageView.setImageResource(image?.imageRes ?: 0)
    }
}
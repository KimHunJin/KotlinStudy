package dxmnd.com.kotlinproject.data.model

import android.content.Context
import dxmnd.com.kotlinproject.data.ImageItem

/**
 * Created by HunJin on 2017-09-01.
 */

class ImageSampleData {
    fun getImageDatas(context: Context, size: Int): ArrayList<ImageItem> {
        val list = ArrayList<ImageItem>()
        for (index in 1..size) {
            var n: Int = (Math.random() * 3).toInt()
            var name: String? = null
            when (n) {
                0 -> name = "blackcoffee"
                1 -> name = "espresso"
                2 -> name = "latte"
            }
            val resource = context.resources.getIdentifier(name, "drawable", context.packageName)
            list.add(ImageItem(resource))
        }
        return list
    }
}
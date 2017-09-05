package dxmnd.com.kotlinproject.views.presenter

import android.content.Context
import dxmnd.com.kotlinproject.data.ImageItem
import dxmnd.com.kotlinproject.data.model.ImageSampleData

/**
 * Created by HunJin on 2017-09-01.
 */

interface ImageSampleContract {
    interface View {
        fun addItem(it: ImageItem)
        fun adapterNotify()
    }

    interface Click {
        fun click()
    }

    interface Presenter {
        var view: View?
        var imageSampleData: ImageSampleData?
        fun updateImageSample(context: Context)
    }
}
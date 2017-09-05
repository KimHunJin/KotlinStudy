package dxmnd.com.kotlinproject.views.presenter

import android.content.Context
import dxmnd.com.kotlinproject.data.model.ImageSampleData

/**
 * Created by HunJin on 2017-09-01.
 */

class ImageSamplePresenter : ImageSampleContract.Presenter {
    override var view: ImageSampleContract.View? = null
    override var imageSampleData: ImageSampleData? = null

    override fun updateImageSample(context: Context) {
        imageSampleData?.getImageDatas(context,3)?.forEach {
            view?.addItem(it)
        }
        view?.adapterNotify()
    }

}
package dxmnd.com.kotlinproject.views

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import dxmnd.com.kotlinproject.R
import dxmnd.com.kotlinproject.utils.replaceFragementToActivity
import dxmnd.com.kotlinproject.views.fragments.FirstFragment
import dxmnd.com.kotlinproject.views.fragments.SecondFragment
import dxmnd.com.kotlinproject.views.presenter.ImageSampleContract

class FragmentActivity : AppCompatActivity() {

    val fabNext by lazy {
        findViewById(R.id.fab_next) as FloatingActionButton
    }

    val fabAdd by lazy {
        findViewById(R.id.fab_add) as FloatingActionButton
    }

    var isFirst: Boolean = true

    var click : ImageSampleContract.Click? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        replaceFragementToActivity(FirstFragment.getInstance(), R.id.frame_layout)

        fabNext.setOnClickListener {
            if (isFirst) {
                replaceFragementToActivity(SecondFragment.getInstance(), R.id.frame_layout)
                isFirst = false
            } else {
                replaceFragementToActivity(FirstFragment.getInstance(), R.id.frame_layout)
                isFirst = true
            }
        }

        fabAdd.setOnClickListener {
            click
        }


    }
}

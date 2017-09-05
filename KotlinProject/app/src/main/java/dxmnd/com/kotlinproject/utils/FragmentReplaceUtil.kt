package dxmnd.com.kotlinproject.utils

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by HunJin on 2017-09-01.
 */

fun AppCompatActivity.replaceFragementToActivity(fragment: Fragment, frameId : Int) {
    val transaction = this.supportFragmentManager.beginTransaction()
    transaction.replace(frameId, fragment)
    transaction.commit()
}
package dxmnd.com.kotlinproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import dxmnd.com.kotlinproject.views.FragmentActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private val edtNum1 by lazy { findViewById(R.id.edt_first_number) as EditText }
    private val edtNum2 by lazy { findViewById(R.id.edt_second_number) as EditText }
    private val txtResult by lazy { findViewById(R.id.txt_result) as TextView }
    private val btnPlus by lazy { findViewById(R.id.btn_plus) as Button }
    private val btnMinus by lazy { findViewById(R.id.btn_minus) as Button }
    private val btnMultiple by lazy { findViewById(R.id.btn_multiple) as Button }
    private val btnDivide by lazy { findViewById(R.id.btn_divide) as Button }
    private val btnNext by lazy { findViewById(R.id.btn_next_page) as Button }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener(this)
        btnMinus.setOnClickListener(this)
        btnMultiple.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
        btnNext.setOnClickListener(this)
    }

    /**
     * type
     *  1 : +
     *  2 : -
     *  3 : *
     *  4 : /
     */
    private fun resultValue(first: Int, second: Int, type: Int): Int {
        var result: Int = 0
        when (type) {
            1 -> {
                result = first + second
            }
            2 -> {
                result = first - second
            }
            3 -> {
                result = first * second
            }
            4 -> {
                result = first / second
            }
        }
        return result
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_plus -> txtResult.text = resultValue(edtNum1.text.toString().toInt(), edtNum2.text.toString().toInt(), 1).toString()

            R.id.btn_minus -> txtResult.text = resultValue(edtNum1.text.toString().toInt(), edtNum2.text.toString().toInt(), 2).toString()

            R.id.btn_multiple -> txtResult.text = resultValue(edtNum1.text.toString().toInt(), edtNum2.text.toString().toInt(), 3).toString()

            R.id.btn_divide -> txtResult.text = resultValue(edtNum1.text.toString().toInt(), edtNum2.text.toString().toInt(), 4).toString()

            R.id.btn_next_page -> startActivity(Intent(this, FragmentActivity::class.java))
        }
    }
}

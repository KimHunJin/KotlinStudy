package dxmnd.com.kotlinproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import dxmnd.com.kotlinproject.views.FragmentActivity;

/**
 * Created by HunJin on 2017-08-18.
 */

public class Test extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = Test.class.getSimpleName();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn_divide);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_divide: {
                startActivity(new Intent(this, FragmentActivity.class));
                break;
            }
        }
    }
}

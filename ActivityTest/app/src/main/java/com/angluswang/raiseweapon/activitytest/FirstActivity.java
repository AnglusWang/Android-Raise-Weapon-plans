package com.angluswang.raiseweapon.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  //隐藏标题
        setContentView(R.layout.layout_first);
    }
}

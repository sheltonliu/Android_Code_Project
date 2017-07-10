package com.example.liushuo.testjniapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.view.CustomButton;
import com.example.view.CustomRelativeLayout;

public class ActivityViewDispatch extends Activity {

    private static final String TAG = "ActivityViewDispatch";

    private CustomRelativeLayout customRelativeLayout;
    private CustomButton btn_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__view__dispatch);

        initView();
        initListener();
    }

    private void initListener() {
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Activity Button Click ");
            }
        });

    }

    private void initView() {
        customRelativeLayout = (CustomRelativeLayout) findViewById(R.id.content_activity__view__dispatch);
        btn_test = (CustomButton) customRelativeLayout.findViewById(R.id.btn_test);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG, "Activity dispatchEvent:  "+String.valueOf(ev.getX()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "Activity onTouchEvent:  "+String.valueOf(event.getX()));
        return super.onTouchEvent(event);
    }

}

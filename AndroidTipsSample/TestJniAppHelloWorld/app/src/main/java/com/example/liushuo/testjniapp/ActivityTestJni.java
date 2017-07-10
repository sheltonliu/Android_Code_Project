package com.example.liushuo.testjniapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.utils.NDKUtils;

public class ActivityTestJni extends AppCompatActivity {

    private String TAG = "ActivityTestJni";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_jni);


        String test = NDKUtils.sayHello();
        Log.i(TAG, "test:  "+test);

        char[] cc = {'a','b','c'};
        String SS = new String(cc);

        Toast.makeText(getApplicationContext(), "test: "+test, 0).show();
    }

}

package com.example.liushuo.testjniapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.utils.MemoryUtils;

public class ActivityMemoryAnalyze extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_analyze);

        MemoryUtils.getInstance(this).showToast("Memory Analyze!");

    }
}

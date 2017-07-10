package com.example.liushuo.testjniapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.utils.NDKUtils;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private Button btn_dispatch;
    private Button btn_testjni;
    private Button btn_memory_analyze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_dispatch = (Button) findViewById(R.id.btn_test_view_despatch);
        btn_dispatch.setOnClickListener(this);

        btn_testjni = (Button) findViewById(R.id.btn_test_jni);
        btn_testjni.setOnClickListener(this);

        btn_memory_analyze = (Button) findViewById(R.id.btn_memory_analyze);
        btn_memory_analyze.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_test_view_despatch:
                Intent intent = new Intent(MainActivity.this,ActivityViewDispatch.class);
                startActivity(intent);
                break;
            case R.id.btn_test_jni:
                intent = new Intent(MainActivity.this,ActivityTestJni.class);
                startActivity(intent);
                break;
            case R.id.btn_memory_analyze:
                intent = new Intent(MainActivity.this,ActivityMemoryAnalyze.class);
                startActivity(intent);
                break;

        }
    }
}

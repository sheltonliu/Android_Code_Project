package com.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by shelton on 17/7/9.
 */

public class MemoryUtils {

    private static MemoryUtils instance = null;

    private Context context;

    private MemoryUtils(Context context){
        this.context = context;
    }

    public static MemoryUtils getInstance(Context context){
        if (instance == null){
            instance = new MemoryUtils(context);
        }
        return instance;
    }

    public void showToast(String str){
        Toast.makeText(context, str , 0).show();
    }
}

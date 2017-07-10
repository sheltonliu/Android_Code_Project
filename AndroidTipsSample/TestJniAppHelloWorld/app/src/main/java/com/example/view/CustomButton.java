package com.example.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by shelton on 17/7/8.
 */

public class CustomButton extends Button {
    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, 0);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("ActivityViewDispatch", "Button dispatch:  "+ev.getX());
        boolean bool = super.dispatchTouchEvent(ev);
        return bool;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.i("ActivityViewDispatch", "Button onTouchEvent:  "+ev.getX());
        super.onTouchEvent(ev);
//        return super.onTouchEvent(ev);

        return false;
    }

}

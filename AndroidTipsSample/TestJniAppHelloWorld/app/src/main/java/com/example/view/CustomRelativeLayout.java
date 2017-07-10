package com.example.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by shelton on 17/7/8.
 */

public class CustomRelativeLayout extends RelativeLayout{
    public CustomRelativeLayout(Context context) {
        super(context);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, 0);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("ActivityViewDispatch", "RelativeLayout dispatch:  "+ev.getX());
        boolean bool = super.dispatchTouchEvent(ev);
        Log.i("ActivityViewDispatch", "RelativeLayout dispatch  boolean:  "+bool);
        return bool;

//        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("ActivityViewDispatch", "RelativeLayout onIntercept:  "+ev.getX());
        boolean bool = super.onInterceptTouchEvent(ev);
        Log.i("ActivityViewDispatch", "RelativeLayout onIntercept boolean:  "+bool);
        return bool;

//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.i("ActivityViewDispatch", "RelativeLayout onTouchEvent:  "+ev.getX());
        return super.onTouchEvent(ev);
    }

}

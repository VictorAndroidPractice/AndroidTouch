package com.victorai60.androidtouch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Author: victor
 * Date: 2016-02-26 21:16
 * Email: 497042813@qq.com
 */
public class CustomRelativeLayout extends RelativeLayout {

    public CustomRelativeLayout(Context context) {
        super(context);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Toast.makeText(getContext(), "RelativeLayout dispatchTouchEvent " + ev.getAction(), Toast.LENGTH_SHORT).show();
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Toast.makeText(getContext(), "RelativeLayout onInterceptTouchEvent " + ev.getAction(), Toast.LENGTH_SHORT).show();
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(getContext(), "RelativeLayout onTouchEvent " + event.getAction(), Toast.LENGTH_SHORT).show();
        return super.onTouchEvent(event);
    }
}

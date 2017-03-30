package com.victorai60.androidtouch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import android.widget.Toast;

/**
 * Author: victor
 * Date: 2016-02-26 22:00
 * Email: 497042813@qq.com
 */
public class CustomScrollView extends ScrollView {

    public CustomScrollView(Context context) {
        super(context);
    }

    public CustomScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Toast.makeText(getContext(), "ScrollView onInterceptTouchEvent " + ev.getAction(), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Toast.makeText(getContext(), "ScrollView onTouchEvent " + ev.getAction(), Toast.LENGTH_SHORT).show();
        return true;
    }
}

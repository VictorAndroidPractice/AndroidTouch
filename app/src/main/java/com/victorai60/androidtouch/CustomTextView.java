package com.victorai60.androidtouch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Author: victor
 * Date: 2016-02-26 21:11
 * Email: 497042813@qq.com
 */
public class CustomTextView extends TextView {

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(getContext(), "TextView onTouchEvent " + event.getAction(), Toast.LENGTH_SHORT).show();
        return super.onTouchEvent(event);
    }
}

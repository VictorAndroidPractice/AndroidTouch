package com.victorai60.androidtouch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomTextView textView = (CustomTextView) findViewById(R.id.text);
        textView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // v.getParent().requestDisallowInterceptTouchEvent(true);
                Toast.makeText(MainActivity.this, "TextView onTouch " + event.getAction(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        textView.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Toast.makeText(MainActivity.this, "TextView onKey " + event.getAction(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(MainActivity.this, "Activity onTouchEvent " + event.getAction(), Toast.LENGTH_SHORT).show();
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Toast.makeText(MainActivity.this, "Activity onKeyDown " + event.getAction(), Toast.LENGTH_SHORT).show();
        return super.onKeyDown(keyCode, event);
    }
}

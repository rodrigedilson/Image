package com.fmu.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_linear);

        /*
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
    */
    }
}
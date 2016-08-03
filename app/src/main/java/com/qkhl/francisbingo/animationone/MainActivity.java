package com.qkhl.francisbingo.animationone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.bt);
        textView = (TextView) findViewById(R.id.textview);
        button.setOnClickListener(this);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
//        AnimationSet animationSet = new AnimationSet(false);
        RotateAnimation rotateAnimation = new RotateAnimation(0, 1800, textView.getWidth() / 2, textView.getHeight() / 2);
        rotateAnimation.setDuration(200);
        rotateAnimation.setRepeatCount(-1);
        switch (v.getId()) {
            case R.id.textview:
                textView.startAnimation(rotateAnimation);
                break;
            case R.id.bt:
                textView.clearAnimation();
                break;
        }
    }
}

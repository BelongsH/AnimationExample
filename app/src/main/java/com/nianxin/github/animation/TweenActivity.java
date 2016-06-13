package com.nianxin.github.animation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by liuhuiliang on 16/6/13.
 */
public class TweenActivity extends AppCompatActivity {

    protected Button bt_tween;
    protected TextView tv_tween_hello;
    protected Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        context = this;
        bt_tween = (Button) findViewById(R.id.bt_tween);
        tv_tween_hello = (TextView) findViewById(R.id.tv_tween_hello);
        bt_tween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TranslateAnimation animation = new TranslateAnimation(0, 0, 0, 300);
                animation.setDuration(1000);
                animation.setFillAfter(true);
                tv_tween_hello.startAnimation(animation);
            }
        });

        tv_tween_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"hello animation",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static void startActiivty(Context context) {
        context.startActivity(new Intent(context, TweenActivity.class));
    }


}

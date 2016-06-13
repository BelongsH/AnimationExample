package com.nianxin.github.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by liuhuiliang on 16/6/13.
 */
public class Property4ViewActivity extends AppCompatActivity implements View.OnClickListener, ValueAnimator.AnimatorUpdateListener {


    protected TextView tv_property_info;
    protected Button bt_property;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        bt_property = (Button) findViewById(R.id.bt_property);
        bt_property.setText("View的改变");
        tv_property_info = (TextView) findViewById(R.id.tv_property_info);
        bt_property.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv_property_info, "TranslationY", 0, 300);
        objectAnimator.addUpdateListener(this);
        objectAnimator.setDuration(500);
        objectAnimator.start();
    }

    @Override
    public void onAnimationUpdate(ValueAnimator animation) {
    }


    public static void startActiivty(Context context) {
        context.startActivity(new Intent(context, Property4ViewActivity.class));
    }
}

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

import model.Person;

/**
 * Created by liuhuiliang on 16/6/13.
 */
public class Property4ObjectActivity extends AppCompatActivity implements View.OnClickListener, ValueAnimator.AnimatorUpdateListener {


    protected Person person;
    protected TextView tv_property_info;
    protected Button bt_property;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        person = new Person();
        person.setName("张三");
        bt_property = (Button) findViewById(R.id.bt_property);
        tv_property_info = (TextView) findViewById(R.id.tv_property_info);
        bt_property.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(person, "age", 1, 100);
        objectAnimator.addUpdateListener(this);
        objectAnimator.setDuration(5000);
        objectAnimator.start();
    }

    @Override
    public void onAnimationUpdate(ValueAnimator animation) {
        int values = (int) animation.getAnimatedValue();
        person.setAge(values);
        tv_property_info.setText(person.toString());
    }


    public static void startActiivty(Context context) {
        context.startActivity(new Intent(context, Property4ObjectActivity.class));
    }
}

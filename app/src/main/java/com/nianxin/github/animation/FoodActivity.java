package com.nianxin.github.animation;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import adapter.FoodAdapter;
import datas.AppConfig;
import view.NXHooldeView;

/**
 * Created by liuhuiliang on 16/6/13.
 */
public class FoodActivity extends AppCompatActivity implements FoodAdapter.FoodActionCallback {


    ListView lv_main;
    TextView tv_good_fitting_num;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        lv_main = (ListView) findViewById(R.id.lv_main);
        tv_good_fitting_num = (TextView) findViewById(R.id.tv_good_fitting_num);
        lv_main.setAdapter(new FoodAdapter(this, AppConfig.factoryFoods(), this));
    }


    public static void startActiivty(Context context) {
        context.startActivity(new Intent(context, FoodActivity.class));
    }


    @Override
    public void addAction(View view) {
        NXHooldeView nxHooldeView = new NXHooldeView(this);
        int position[] = new int[2];
        view.getLocationInWindow(position);
        nxHooldeView.setStartPosition(new Point(position[0], position[1]));
        ViewGroup rootView = (ViewGroup) this.getWindow().getDecorView();
        rootView.addView(nxHooldeView);
        int endPosition[] = new int[2];
        tv_good_fitting_num.getLocationInWindow(endPosition);
        nxHooldeView.setEndPosition(new Point(endPosition[0], endPosition[1]));
        nxHooldeView.startBeizerAnimation();
    }

}

package com.nianxin.github.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import datas.AppConfig;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private ListView lv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_main = (ListView) findViewById(R.id.lv_main);
        List<String> datas = AppConfig.factoryDatas();
        lv_main.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, datas));
        lv_main.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                TopicActivity.startActiivty(this);
                break;
            case 1:
                TweenActivity.startActiivty(this);
                break;
            case 2:
                Property4ObjectActivity.startActiivty(this);
                break;
            case 3:
                Property4ViewActivity.startActiivty(this);
                break;
            case 4:
                FoodActivity.startActiivty(this);
                break;
        }
    }
}

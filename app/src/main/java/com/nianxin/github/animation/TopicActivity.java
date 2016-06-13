package com.nianxin.github.animation;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by liuhuiliang on 16/6/13.
 */
public class TopicActivity extends AppCompatActivity {


    AnimationDrawable iv_topicAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        ImageView iv_topic = (ImageView) findViewById(R.id.iv_topic);
        iv_topic.setBackgroundResource(R.drawable.anim_topic);
        iv_topicAnimation = (AnimationDrawable) iv_topic.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        iv_topicAnimation.start();
    }

    public static void startActiivty(Context context) {
        context.startActivity(new Intent(context, TopicActivity.class));
    }
}

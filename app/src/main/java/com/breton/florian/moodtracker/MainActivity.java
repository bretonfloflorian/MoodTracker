package com.breton.florian.moodtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageHumour1;
    private ImageView mImageHumour2;
    private ImageView mImageHumour3;
    private ImageView mImageHumour4;
    private ImageView mImageHumour5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageHumour1 = (ImageView) findViewById(R.id.image_humour_1);
        mImageHumour2 = (ImageView) findViewById(R.id.image_humour_2);
        mImageHumour3 = (ImageView) findViewById(R.id.image_humour_3);
        mImageHumour4 = (ImageView) findViewById(R.id.image_humour_4);
        mImageHumour5 = (ImageView) findViewById(R.id.image_humour_5);

        mImageHumour1.setTag(0);
        mImageHumour2.setTag(1);
        mImageHumour3.setTag(2);
        mImageHumour4.setTag(3);
        mImageHumour5.setTag(4);

    }
}

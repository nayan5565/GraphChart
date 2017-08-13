package com.jewel.androidbargraph;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;


/**
 * Created by Nayan on 8/14/2017.
 */
public class BarGraph2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_gaph2_activity);
        BarChart mBarChart = (BarChart) findViewById(R.id.barchart);

        mBarChart.addBar(new BarModel(5, 0xFF123456));
//        mBarChart.addBar(new BarModel(2.f,  0xFF343456));
//        mBarChart.addBar(new BarModel(3.3f, 0xFF563456));
//        mBarChart.addBar(new BarModel(1.1f, 0xFF873F56));
//        mBarChart.addBar(new BarModel(2.7f, 0xFF56B7F1));
//        mBarChart.addBar(new BarModel(2.f,  0xFF343456));
//        mBarChart.addBar(new BarModel(0.4f, 0xFF1FF4AC));
//        mBarChart.addBar(new BarModel(4.f,  0xFF1BA4E6));

        mBarChart.startAnimation();
    }
}

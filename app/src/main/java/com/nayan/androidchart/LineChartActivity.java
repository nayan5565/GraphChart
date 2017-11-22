package com.nayan.androidchart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.nayan.androidchart.R;
import com.numetriclabz.numandroidcharts.ChartData;
import com.numetriclabz.numandroidcharts.LineChart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nayan on 11/23/2017.
 */

public class LineChartActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_line_chart);
        LineChart lineChart = (LineChart) findViewById(R.id.chart);
        List<ChartData> values = new ArrayList<>();
        values.add(new ChartData(4f, 0.5f)); //values.add(new ChartData(y,x));
        values.add(new ChartData(8f, 1f));
        values.add(new ChartData(18f, 2f));
        values.add(new ChartData(2f, 4f));
        values.add(new ChartData(12f, 5f));
        values.add(new ChartData(9f, 7f));

//        List<ChartData> values = new ArrayList<>();
//        values.add(new ChartData(4f, "2001")); //values.add(new ChartData(y,"Labels"));
//        values.add(new ChartData(9f, "2002"));
//        values.add(new ChartData(18f,"2003"));
//        values.add(new ChartData(2f, "2004"));
//        values.add(new ChartData(12f,"2005"));
//        values.add(new ChartData(9f, "2006"));

        lineChart.setData(values);

        lineChart.setAreaChart(true);

        lineChart.setDescription("Area Chart");
    }
}

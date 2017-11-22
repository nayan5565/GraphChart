package com.nayan.androidchart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.nayan.androidchart.R;
import com.numetriclabz.numandroidcharts.AreaChart;
import com.numetriclabz.numandroidcharts.ChartData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nayan on 11/23/2017.
 */

public class AreaChartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lia_area_chart);
        areaChart();
    }

    private void areaChart() {
        AreaChart areaChart = (AreaChart) findViewById(R.id.areaChart);

        List<ChartData> value1 = new ArrayList<>();

        value1.add(new ChartData(4f, 0.5f)); //values.add(new ChartData(y,x));
        value1.add(new ChartData(9f, 1f));
        value1.add(new ChartData(18f, 2f));
        value1.add(new ChartData(2f, 4f));
        value1.add(new ChartData(12f, 5f));
        value1.add(new ChartData(9f, 7f));

        List<ChartData> value2 = new ArrayList<>();

        value2.add(new ChartData(5f, 1f)); //values.add(new ChartData(y,x));
        value2.add(new ChartData(6f, 2f));
        value2.add(new ChartData(15f, 3f));
        value2.add(new ChartData(2f, 5f));
        value2.add(new ChartData(3f, 16f));

        List<ChartData> value3 = new ArrayList<>();
        value3.add(new ChartData(value1));
        value3.add(new ChartData(value2));
        areaChart.setData(value3);

        List<String> h_lables = new ArrayList<>();
        h_lables.add("0.0");
        h_lables.add("sun");
        h_lables.add("mon");
        h_lables.add("tue");
        h_lables.add("wed");
        areaChart.setLabels(h_lables);
        List<String> type = new ArrayList<>();
        type.add("Value1");
        type.add("value2");
        areaChart.setLegends(type);
        areaChart.setCircleSize(10f);
        areaChart.setGesture(true);
    }
}

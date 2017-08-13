package com.jewel.androidbargraph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarChart barChart = (BarChart) findViewById(R.id.barchart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(8, 9));
        entries.add(new BarEntry(0, 1));
//        entries.add(new BarEntry(0, 2));
//        entries.add(new BarEntry(0, 3));
//        entries.add(new BarEntry(0, 4));
//        entries.add(new BarEntry(0, 5));
//        entries.add(new BarEntry(0, 6));

        BarDataSet bardataset = new BarDataSet(entries, "Cells");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("0");
        labels.add("1");
        labels.add("2");
        labels.add("3");
        labels.add("4");
        labels.add("5");
        labels.add("6");
        labels.add("7");
        labels.add("8");
        labels.add("9");

        BarData data = new BarData(labels, bardataset);
        barChart.setData(data); // set the data and list of lables into chart
        barChart.setClickable(false);
        barChart.setX(10);
        barChart.setDescription("Set Bar Chart Description");  // set the description
        int[] color={
            Color.GREEN,Color.YELLOW
        };
        bardataset.setColors(color);

        barChart.animateY(5000);


//        HorizontalBarChart barChart = (HorizontalBarChart) findViewById(R.id.barchart);
//
//        // create BarEntry for Bar Group 1
//        ArrayList<BarEntry> bargroup1 = new ArrayList<>();
//        bargroup1.add(new BarEntry(8f, 0));
//        bargroup1.add(new BarEntry(2f, 1));
//        bargroup1.add(new BarEntry(5f, 2));
//        bargroup1.add(new BarEntry(20f, 3));
//        bargroup1.add(new BarEntry(15f, 4));
//        bargroup1.add(new BarEntry(19f, 5));
//
//        // create BarEntry for Bar Group 1
//        ArrayList<BarEntry> bargroup2 = new ArrayList<>();
//        bargroup2.add(new BarEntry(6f, 0));
//        bargroup2.add(new BarEntry(10f, 1));
//        bargroup2.add(new BarEntry(5f, 2));
//        bargroup2.add(new BarEntry(25f, 3));
//        bargroup2.add(new BarEntry(4f, 4));
//        bargroup2.add(new BarEntry(17f, 5));
//
//        BarDataSet barDataSet1 = new BarDataSet(bargroup1, "Bar Group 1");  // creating dataset for group1
//
//        //barDataSet1.setColor(Color.rgb(0, 155, 0));
//        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);
//
//        BarDataSet barDataSet2 = new BarDataSet(bargroup2, "Brand 2"); // creating dataset for group1
//        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);
//
//        ArrayList<String> labels = new ArrayList<String>();
//        labels.add("2016");
//        labels.add("2015");
//        labels.add("2014");
//        labels.add("2013");
//        labels.add("2012");
//        labels.add("2011");
//
//        ArrayList<BarDataSet> dataSets = new ArrayList<>();  // combined all dataset into an arraylist
//        dataSets.add(barDataSet1);
//        dataSets.add(barDataSet2);
//        BarData data = new BarData(labels, dataSets); // initialize the Bardata with argument labels and dataSet
//        barChart.setData(data);
//
//
//
//
//        barChart.setDescription("Set Bar Chart Description");  // set the description
//
//        barChart.animateY(5000);
    }
}

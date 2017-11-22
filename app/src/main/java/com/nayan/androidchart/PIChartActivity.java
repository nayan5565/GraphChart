package com.nayan.androidchart;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.SeekBar;
import com.nayan.androidchart.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by Nayan on 8/19/2017.
 */
public class PIChartActivity extends AppCompatActivity implements OnChartValueSelectedListener {
    private SeekBar seekBar, seekBar2, seekBar3, seekBar4;
    private int w, x, y, z;
    //    private int max;
    //    private PieChart mPieChart;
    private PieChart pieChart2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pi_chart_activity);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        seekBar4 = (SeekBar) findViewById(R.id.seekBar4);


        pieChart2 = (PieChart) findViewById(R.id.piechart2);
        pieChart2.setOnChartValueSelectedListener(this);
        piChart();
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                w = progress;
//                max = seekBar.getMax() - w;
//                piChart();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                seekBar2.setMax(max);
                x = progress;
//                max = seekBar2.getMax() - x;
//                piChart();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                seekBar3.setMax(max);
                y = progress;
//                max = seekBar3.getMax() - y;
//                piChart();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                seekBar4.setMax(max);
                z = progress;
                piChart();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private void piChart() {
        // IMPORTANT: In a PieChart, no values (Entry) should have the same
        // xIndex (even if from different DataSets), since no values can be
        // drawn above each other.
        ArrayList<Entry> yvalues = new ArrayList<Entry>();
        yvalues.add(new Entry(w, 0));
        yvalues.add(new Entry(x, 1));
        yvalues.add(new Entry(y, 2));
        yvalues.add(new Entry(z, 3));
//        yvalues.add(new Entry(23f, 4));
//        yvalues.add(new Entry(17f, 5));

        PieDataSet dataSet = new PieDataSet(yvalues, "Election Results");

        ArrayList<String> xVals = new ArrayList<String>();

        xVals.add("January");
        xVals.add("February");
        xVals.add("March");
        xVals.add("April");
        xVals.add("May");
//        xVals.add("June");

        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);

        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());
        pieChart2.setUsePercentValues(true);
        pieChart2.setData(data);
//        pieChart2.setDrawHoleEnabled(true);
        pieChart2.setTransparentCircleRadius(50f);
        pieChart2.setHoleRadius(30f);
        pieChart2.setHoleColor(Color.GRAY);

        pieChart2.animateXY(1000, 1000);
    }

    @Override
    public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
        if (e == null)
            return;
        Log.e("VAL SELECTED",
                "Value: " + e.getVal() + ", xIndex: " + e.getXIndex()
                        + ", DataSet index: " + dataSetIndex);
    }

    @Override
    public void onNothingSelected() {
        Log.e("pichart", "Nothing Selected");

    }

//    private void piChart() {
//        mPieChart.addPieSlice(new PieModel("Freetime", w, Color.parseColor("#FE6DA8")));
//        mPieChart.addPieSlice(new PieModel("Sleep", x, Color.parseColor("#56B7F1")));
//        mPieChart.addPieSlice(new PieModel("Work", y, Color.parseColor("#CDA67F")));
//        mPieChart.addPieSlice(new PieModel("Eating", z, Color.parseColor("#FED70E")));
//
//
//
//        mPieChart.startAnimation();
//    }
}

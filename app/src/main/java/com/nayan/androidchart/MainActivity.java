package com.nayan.androidchart;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.nayan.androidchart.R;

/**
 * Created by Nayan on 8/19/2017.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBar, btnPi, btnArea, btnLine, btnMultiLine;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        btnBar = (Button) findViewById(R.id.btnBar);
        btnPi = (Button) findViewById(R.id.btnPi);
        btnArea = (Button) findViewById(R.id.btnArea);
        btnLine = (Button) findViewById(R.id.btnLine);
        btnMultiLine = (Button) findViewById(R.id.btnMultiLine);
        btnBar.setOnClickListener(this);
        btnPi.setOnClickListener(this);
        btnArea.setOnClickListener(this);
        btnLine.setOnClickListener(this);
        btnMultiLine.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnBar) {
            Intent intent = new Intent(MainActivity.this, BarChartActivity.class);
            startActivity(intent);

        } else if (v == btnPi) {
            Intent intent = new Intent(MainActivity.this, PIChartActivity.class);
            startActivity(intent);
        } else if (v == btnArea) {
            Intent intent = new Intent(MainActivity.this, AreaChartActivity.class);
            startActivity(intent);
        } else if (v == btnLine) {
            Intent intent = new Intent(MainActivity.this, LineChartActivity.class);
            startActivity(intent);
        } else if (v == btnMultiLine) {
            Intent intent = new Intent(MainActivity.this, MultiLineChartActivity.class);
            startActivity(intent);
        }

    }
}

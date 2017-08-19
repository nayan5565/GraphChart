package com.jewel.androidbargraph;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nayan on 8/19/2017.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBar, btnPi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        btnBar = (Button) findViewById(R.id.btnBar);
        btnPi = (Button) findViewById(R.id.btnPi);
        btnBar.setOnClickListener(this);
        btnPi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==btnBar){
            Intent intent=new Intent(MainActivity.this,BarChartActivity.class);
            startActivity(intent);

        }
        else if (v==btnPi){
            Intent intent=new Intent(MainActivity.this,PIChartActivity.class);
            startActivity(intent);
        }

    }
}

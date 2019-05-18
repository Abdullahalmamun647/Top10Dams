package com.example.top10dams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class top10dams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top10dams);
    }

    public void bt1(View view) {
        startActivity(new Intent(top10dams.this,dams1.class));
    }

    public void bt2(View view) {
        startActivity(new Intent(top10dams.this,dams2.class));
    }

    public void bt3(View view) {
        startActivity(new Intent(top10dams.this,dam3.class));
    }

    public void bt4(View view) {
        startActivity(new Intent(top10dams.this,dam4.class));
    }

    public void bt5(View view) {
        startActivity(new Intent(top10dams.this,dam5.class));
    }

    public void bt6(View view) {
        startActivity(new Intent(top10dams.this,dam6.class));
    }


    public void bt7(View view) {
        startActivity(new Intent(top10dams.this,dam7.class));
    }

    public void bt8(View view) {
        startActivity(new Intent(top10dams.this,dam8.class));
    }

    public void bt9(View view) {
        startActivity(new Intent(top10dams.this,dam9.class));
    }

    public void bt10(View view) {
        startActivity(new Intent(top10dams.this,dam10.class));
    }
}

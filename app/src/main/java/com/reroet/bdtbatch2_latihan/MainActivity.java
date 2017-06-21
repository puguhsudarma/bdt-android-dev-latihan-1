package com.reroet.bdtbatch2_latihan;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.tapadoo.alerter.Alert;
import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "OnCreate() yesss");

        login = (Button) findViewById(R.id.btnLogin);
        register = (Button) findViewById(R.id.btnRegister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashboard = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(dashboard);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alert Title")
                        .setText("Alert text...")
                        .setBackgroundColor(R.color.colorAccent)
                        .show();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "OnResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy()");
    }
}

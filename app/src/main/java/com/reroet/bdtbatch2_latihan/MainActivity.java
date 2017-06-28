package com.reroet.bdtbatch2_latihan;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.reroet.bdtbatch2_latihan.utilities.PrefManager;
import com.tapadoo.alerter.Alert;
import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;
    Button register;

    String validUsername = "a";
    String validPassword = "1";

    private PrefManager pref = new PrefManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "OnCreate() yesss");

        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.btnLogin);
        register = (Button) findViewById(R.id.btnRegister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });

        if(pref.getBool(this, "isLoggedIn")){
            Intent dashboard = new Intent(getApplicationContext(), DashboardActivity.class);
            startActivity(dashboard);
            MainActivity.this.finish();
        }

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

    private void validate(){
        String inputedUsername = username.getText().toString();
        String inputedPassword = password.getText().toString();

        if(inputedUsername.equals(validUsername)
                && inputedPassword.equals(validPassword)){
            pref.saveBool(this, "isLoggedIn", true);
            pref.saveString(this, "username", inputedUsername);
            Intent dashboard = new Intent(getApplicationContext(), DashboardActivity.class);
            startActivity(dashboard);
            MainActivity.this.finish();
            /*Toast.makeText(this, "login sukses", Toast.LENGTH_SHORT).show();*/
        }else{
            Alerter.create(this)
                    .setTitle("Login Failure")
                    .setText("Wrong Credentials")
                    .show();
        }
    }
}

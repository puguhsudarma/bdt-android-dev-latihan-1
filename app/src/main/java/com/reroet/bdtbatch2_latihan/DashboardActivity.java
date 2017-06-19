package com.reroet.bdtbatch2_latihan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.reroet.bdtbatch2_latihan.adapter.OrangAdapter;
import com.reroet.bdtbatch2_latihan.pojo.Orang;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reroet on 14/06/17.
 */

public class DashboardActivity extends AppCompatActivity {
    private RecyclerView rv;
    private OrangAdapter adapter;
    private List<Orang> orangs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        rv = (RecyclerView) findViewById(R.id.rv);
        createDataDummy();
        adapter = new OrangAdapter(orangs);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }

    private void createDataDummy(){
        Orang orang1 = new Orang("Samsul", "Tukang Ojek");
        Orang orang2 = new Orang("Samsul Yan", "Tukang Ojek Motor");
        Orang orang3 = new Orang("Samsul Yun", "Tukang Ojek Mobil");
        Orang orang4 = new Orang("Samsul Yen", "Tukang Ojek Sepeda");
        Orang orang5 = new Orang("Samsul Ton", "Tukang Ojek Bajay");

        orangs.add(orang1);
        orangs.add(orang2);
        orangs.add(orang3);
        orangs.add(orang4);
        orangs.add(orang5);
        orangs.add(orang1);
        orangs.add(orang2);
        orangs.add(orang3);
        orangs.add(orang4);
        orangs.add(orang5);
        orangs.add(orang1);
        orangs.add(orang2);
        orangs.add(orang3);
        orangs.add(orang4);
        orangs.add(orang5);
        orangs.add(orang1);
        orangs.add(orang2);
        orangs.add(orang3);
        orangs.add(orang4);
        orangs.add(orang5);
    }

}

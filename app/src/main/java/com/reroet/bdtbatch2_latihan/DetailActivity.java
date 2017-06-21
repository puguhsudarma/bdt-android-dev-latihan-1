package com.reroet.bdtbatch2_latihan;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by reroet on 21/06/17.
 */

public class DetailActivity extends AppCompatActivity {
    private ImageView img;
    private TextView nama;
    private TextView job;

    private String TmpImg;
    private String TmpNama;
    private String TmpJob;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = (ImageView) findViewById(R.id.img);
        nama = (TextView) findViewById(R.id.nama);
        job = (TextView) findViewById(R.id.job);

        if(getIntent() != null){
            TmpNama = getIntent().getStringExtra("nama");
            TmpJob = getIntent().getStringExtra("job");
            TmpImg = getIntent().getStringExtra("img");

            nama.setText(TmpNama);
            job.setText(TmpJob);
            Picasso.with(DetailActivity.this)
                    .load(TmpImg)
                    .into(img);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        DetailActivity.this.finish();
    }
}

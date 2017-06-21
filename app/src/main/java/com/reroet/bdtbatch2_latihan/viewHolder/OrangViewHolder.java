package com.reroet.bdtbatch2_latihan.viewHolder;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.reroet.bdtbatch2_latihan.DetailActivity;
import com.reroet.bdtbatch2_latihan.R;
import com.reroet.bdtbatch2_latihan.pojo.Orang;
import com.squareup.picasso.Picasso;
import com.tapadoo.alerter.Alerter;

/**
 * Created by reroet on 19/06/17.
 */

public class OrangViewHolder extends RecyclerView.ViewHolder{

    private TextView nama;
    private TextView pekerjaan;
    private ImageView img;

    public OrangViewHolder(View itemView) {
        super(itemView);
        nama = (TextView) itemView.findViewById(R.id.tv_nama);
        pekerjaan = (TextView) itemView.findViewById(R.id.tv_job);
        img = (ImageView) itemView.findViewById(R.id.img);
    }

    public void bind(final Orang data, final Activity activity){
        nama.setText(data.getNama());
        pekerjaan.setText(data.getPekerjaan());
        Picasso.with(itemView.getContext())
                .load(data.getImageUrl())
                .into(img);

        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent detail = new Intent(itemView.getContext(), DetailActivity.class);
                detail.putExtra("nama", data.getNama());
                detail.putExtra("job", data.getPekerjaan());
                detail.putExtra("img", data.getImageUrl());

                itemView.getContext().startActivity(detail);
            }
        });
    }
}

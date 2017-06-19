package com.reroet.bdtbatch2_latihan.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.reroet.bdtbatch2_latihan.R;
import com.reroet.bdtbatch2_latihan.pojo.Orang;

/**
 * Created by reroet on 19/06/17.
 */

public class OrangViewHolder extends RecyclerView.ViewHolder{

    private TextView nama;
    private TextView pekerjaan;

    public OrangViewHolder(View itemView) {
        super(itemView);
        nama = (TextView) itemView.findViewById(R.id.tv_nama);
        pekerjaan = (TextView) itemView.findViewById(R.id.tv_job);
    }

    public void bind(Orang data){
        nama.setText(data.getNama());
        pekerjaan.setText(data.getPekerjaan());
    }
}

package com.reroet.bdtbatch2_latihan.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reroet.bdtbatch2_latihan.R;
import com.reroet.bdtbatch2_latihan.pojo.Orang;
import com.reroet.bdtbatch2_latihan.viewHolder.OrangViewHolder;

import java.util.List;

/**
 * Created by reroet on 19/06/17.
 */

public class OrangAdapter extends RecyclerView.Adapter<OrangViewHolder> {
    private List<Orang> list;

    public OrangAdapter(List<Orang> list){
        this.list = list;
    }

    @Override
    public OrangViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_recyclerview, parent, false);

        return new OrangViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(OrangViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}

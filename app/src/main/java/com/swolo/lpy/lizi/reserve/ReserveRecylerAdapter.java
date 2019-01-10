package com.swolo.lpy.lizi.reserve;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ReserveRecylerAdapter extends RecyclerView.Adapter {

    private Context mContext;

    public ReserveRecylerAdapter(Context context) {
        this.mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class ReserveViewHolder extends RecyclerView.ViewHolder{


        public ReserveViewHolder(@NonNull View itemView) {
            super(itemView);



        }
    }
}

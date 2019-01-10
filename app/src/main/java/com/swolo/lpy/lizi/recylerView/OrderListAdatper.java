package com.swolo.lpy.lizi.recylerView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.swolo.lpy.lizi.R;

public class OrderListAdatper extends RecyclerView.Adapter<OrderListAdatper.OrderListViewHolder> {

    private Context mContext;
    public OrderListAdatper(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public OrderListAdatper.OrderListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new OrderListViewHolder(LayoutInflater.from(mContext).inflate(R.layout.orderlistitem,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final OrderListAdatper.OrderListViewHolder viewHolder, int i) {

        viewHolder.textView.setText("aaa");
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = v.findViewById(R.id.tv_orderlist_typename);
                tv.setTextColor(v.getResources().getColor(R.color.colorAccent));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 50;
    }


    class OrderListViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public OrderListViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_orderlist_typename);
        }
    }





}

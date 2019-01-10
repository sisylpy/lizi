package com.swolo.lpy.lizi.Order.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.swolo.lpy.lizi.Order.AppLIstActivity;
import com.swolo.lpy.lizi.Order.model.News;
import com.swolo.lpy.lizi.R;
import com.swolo.lpy.lizi.recylerView.OrderAppActivity;

import java.util.List;

public class MyListViewAdapter extends BaseAdapter {

    private Context context;
    private List<News> list;

    public MyListViewAdapter(Context context, List<News> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public class ViewHolder{
        TextView title;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView == null) {
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_simple_layout,null);
            vh.img = convertView.findViewById(R.id.iv1);
            vh.title = convertView.findViewById(R.id.tv1);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, AppLIstActivity.class);
//
//                context.startActivity(intent);
//            }
//        });

        vh.img.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(context,"dianjitup",Toast.LENGTH_LONG).show();
             }
        });
        News news = list.get(position);
        vh.title.setText(news.getTitle());
        vh.img.setImageResource(news.getImg());

        return convertView;
    }
}

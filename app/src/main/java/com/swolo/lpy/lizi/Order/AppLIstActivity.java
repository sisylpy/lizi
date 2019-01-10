package com.swolo.lpy.lizi.Order;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.swolo.lpy.lizi.Order.model.News;
import com.swolo.lpy.lizi.R;

public class AppLIstActivity extends AppCompatActivity {
    private ImageView iv;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);

        tv = findViewById(R.id.tv111);
        iv = findViewById(R.id.iv111);
        Intent intent = getIntent();
        News news = (News) intent.getSerializableExtra("obj");
        Bundle bundle = intent.getBundleExtra("obj");
        System.out.println("=================");
        System.out.println(bundle);
//        String arg = bundle.getString("arg1");

//        StringBuilder sbld = new StringBuilder();
//        sbld.append(arg+"\n");
//        sbld.append(news.getTitle()+"\n");
//        sbld.append(news.getPubDate()+"\n");

//        tv.setText(arg);
//        iv.setImageResource(news.getImg());

    }
}

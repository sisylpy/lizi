package com.swolo.lpy.lizi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.swolo.lpy.lizi.Order.ToOrderActivity;
import com.swolo.lpy.lizi.reserve.ReserveActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_index_01,btn_index_02;
    private TextView tv_index_words;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_index_01 = findViewById(R.id.btn_index_01);
        btn_index_02 = findViewById(R.id.btn_index_02);
        tv_index_words = findViewById(R.id.tv_index_words);



//        tv_index_words.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); //下划线



        setListeners();





//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }


    private void setListeners(){
        OnClick onClick = new OnClick();
        btn_index_01.setOnClickListener(onClick);
        btn_index_02.setOnClickListener(onClick);

    }

    private class OnClick implements View.OnClickListener{


        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_index_01:
                    intent = new Intent(MainActivity.this,ToOrderActivity.class);
                    break;
                case R.id.btn_index_02:
                    intent = new Intent(MainActivity.this,ReserveActivity.class);
                    break;
            }



            startActivity(intent);

        }
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

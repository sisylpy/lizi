package com.swolo.lpy.lizi.Order.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.swolo.lpy.lizi.Order.AppLIstActivity;
import com.swolo.lpy.lizi.Order.adapter.MyListViewAdapter;
import com.swolo.lpy.lizi.Order.model.News;
import com.swolo.lpy.lizi.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListViewFragment extends Fragment {


    public ListViewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_view, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final List<News> list = new ArrayList<>();
        ListView lv1 = getView().findViewById(R.id.lv1);
        MyListViewAdapter ma = new MyListViewAdapter(getActivity(),list);
        lv1.setAdapter(ma);

        Bundle bundle = getArguments();

        if(bundle != null) {
            int arg = bundle.getInt("arg");
            switch (arg) {
                case 1:
                    for (int i = 0; i < 20; i++) {
                        list.add(new News("kdalf","ggjlkj",R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp));
                    }
                    ma.notifyDataSetChanged();
                    break;
                case 2:
                    for (int i = 0; i < 20; i++) {
                        list.add(new News("kdalf","ggjlkj",R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp));
                    }
                    ma.notifyDataSetChanged();
                    break;
                case 3:
                    for (int i = 0; i < 20; i++) {
                        list.add(new News("kdalf","ggjlkj",R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp));
                    }
                    ma.notifyDataSetChanged();
                    break;
                case 4:
                    for (int i = 0; i < 20; i++) {
                        list.add(new News("kdalf","ggjlkj",R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp));
                    }
                    ma.notifyDataSetChanged();
                    break;
                case 5:
                    for (int i = 0; i < 20; i++) {
                        list.add(new News("kdalf","ggjlkj",R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp,R.drawable.ic_add_black_24dp));
                    }
                    ma.notifyDataSetChanged();
                    break;
                    default:break;
            }
        }

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                News news = list.get(position);
                Toast.makeText(getActivity(), news.getTitle(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(),AppLIstActivity.class);
                intent.putExtra("obj",news);
                Bundle bundle1 = new Bundle();
                bundle1.putString("arg1","news content");
                intent.putExtra("bundle",bundle1);
                System.out.println("???????????????????");
                System.out.println(intent);
                startActivity(intent);
            }
        });

    }




}

package com.swolo.lpy.lizi.reserve;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swolo.lpy.lizi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReserveViewFragment extends Fragment {


    public ReserveViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reserve_view, container, false);
    }

}

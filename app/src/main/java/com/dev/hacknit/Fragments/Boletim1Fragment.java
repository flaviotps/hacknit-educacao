package com.dev.hacknit.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.hacknit.Database.Bimestre;
import com.dev.hacknit.Database.Database;
import com.dev.hacknit.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Boletim1Fragment extends Fragment {


    public Boletim1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bimestre bi = Database.dataModel.getBimestreByID(0);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_boletim1, container, false);
    }

}

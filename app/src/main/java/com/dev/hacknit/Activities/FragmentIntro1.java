package com.dev.hacknit.Activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.hacknit.R;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentIntro1 extends Fragment {

    private View fragmentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentView = inflater.inflate(R.layout.fragment_intro1, container, false);



        return fragmentView;
    }






}
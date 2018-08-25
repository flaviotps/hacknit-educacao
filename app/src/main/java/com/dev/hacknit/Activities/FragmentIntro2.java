package com.dev.hacknit.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dev.hacknit.R;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentIntro2 extends Fragment implements View.OnClickListener {

    private View fragmentView;
    Button btnOK;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentView = inflater.inflate(R.layout.fragment_intro2, container, false);

        btnOK = fragmentView.findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);
        return fragmentView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnOK:
                startActivity(new Intent(this.getContext(),MainActivity.class));
                break;
        }
    }
}



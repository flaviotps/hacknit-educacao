package com.dev.hacknit.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dev.hacknit.Database.Bimestre;
import com.dev.hacknit.Database.Database;
import com.dev.hacknit.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Boletim4Fragment extends Fragment {

    private TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;

    public Boletim4Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_boletim4, container, false);

        Bimestre bi = Database.dataModel.getBimestreByID(0);

        txt1 = v.findViewById(R.id.txtBoletimArtes4);
        txt1.setText(String.valueOf(bi.getArtes()));

        txt2 = v.findViewById(R.id.txtBoletimBiologia4);
        txt2.setText(String.valueOf(bi.getBiologia()));

        txt3 = v.findViewById(R.id.txtBoletimEdFis4);
        txt3.setText(String.valueOf(bi.getEducacaofisica()));

        txt4 = v.findViewById(R.id.txtBoletimFilosofia4);
        txt4.setText(String.valueOf(bi.getFilosofia()));

        txt5 = v.findViewById(R.id.txtBoletimGeog4);
        txt5.setText(String.valueOf(bi.getGeografia()));

        txt6 = v.findViewById(R.id.txtBoletimHistoria4);
        txt6.setText(String.valueOf(bi.getHistoria()));

        txt7 = v.findViewById(R.id.txtBoletimIng4);
        txt7.setText(String.valueOf(bi.getIngles()));

        txt8 = v.findViewById(R.id.txtBoletimMatematica4);
        txt8.setText(String.valueOf(bi.getMatematica()));

        txt9 = v.findViewById(R.id.txtBoletimPort4);
        txt9.setText(String.valueOf(bi.getPortugues()));

        txt10 = v.findViewById(R.id.txtBoletimRedacao4);
        txt10.setText(String.valueOf(bi.getRedacao()));

        // Inflate the layout for this fragment
        return v;
    }
}

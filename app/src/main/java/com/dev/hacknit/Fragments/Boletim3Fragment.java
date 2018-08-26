package com.dev.hacknit.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dev.hacknit.Database.Bimestre;
import com.dev.hacknit.Database.Database;
import com.dev.hacknit.R;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Boletim3Fragment extends Fragment {

    private TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;

    public Boletim3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_boletim3, container, false);

        Bimestre bi = Database.dataModel.getBimestreByID(2);

        txt1 = v.findViewById(R.id.txtBoletimArtes3);
        txt1.setText(bi.getNotaAsText(bi.getArtes()));

        txt2 = v.findViewById(R.id.txtBoletimBiologia3);
        txt2.setText(bi.getNotaAsText(bi.getBiologia()));

        txt3 = v.findViewById(R.id.txtBoletimEdFis3);
        txt3.setText(bi.getNotaAsText(bi.getEducacaofisica()));

        txt4 = v.findViewById(R.id.txtBoletimFilosofia3);
        txt4.setText(bi.getNotaAsText(bi.getFilosofia()));

        txt5 = v.findViewById(R.id.txtBoletimGeog3);
        txt5.setText(bi.getNotaAsText(bi.getGeografia()));

        txt6 = v.findViewById(R.id.txtBoletimHistoria3);
        txt6.setText(bi.getNotaAsText(bi.getHistoria()));

        txt7 = v.findViewById(R.id.txtBoletimIng3);
        txt7.setText(bi.getNotaAsText(bi.getIngles()));

        txt8 = v.findViewById(R.id.txtBoletimMatematica3);
        txt8.setText(bi.getNotaAsText(bi.getMatematica()));

        txt9 = v.findViewById(R.id.txtBoletimPort3);
        txt9.setText(bi.getNotaAsText(bi.getPortugues()));

        txt10 = v.findViewById(R.id.txtBoletimRedacao3);
        txt10.setText(bi.getNotaAsText(bi.getRedacao()));

        // Inflate the layout for this fragment
        return v;
    }
}

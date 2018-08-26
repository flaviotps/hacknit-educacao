package com.dev.hacknit.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dev.hacknit.Database.Database;
import com.dev.hacknit.Helpers.ChartAdapter;
import com.dev.hacknit.Database.ChartModel;
import com.dev.hacknit.Helpers.Constants;
import com.dev.hacknit.R;

import java.util.ArrayList;
import java.util.List;

public class GraficosFaltasActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ChartAdapter chartAdapter;
    public List<ChartModel> chartModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_grafico_notas);
        chartModels = new ArrayList<>();


        getSupportActionBar().setTitle("Resumo de faltas");


        for(int i=0;i<Database.dataModels.get(0).getAnoList().size();i++){
            chartModels.add(new ChartModel(Database.dataModel.getAnoList().get(i).getBimestreList().get(0).getFaltasAsDataString(),"Falta, Presensença", Constants.CHART_TYPE_PIE,"Presença ("+(i+1)+"• semestre)"));

        }





        //////
        chartAdapter = new ChartAdapter(chartModels);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView = findViewById(R.id.Chart1Recycler);
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(chartAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }



    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
package com.dev.hacknit.Activities;

import android.os.Bundle;

import com.dev.hacknit.Database.ChartModel;
import com.dev.hacknit.Database.Database;
import com.dev.hacknit.Helpers.ChartAdapter;
import com.dev.hacknit.Helpers.Constants;
import com.dev.hacknit.R;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GraficosNotasActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ChartAdapter chartAdapter;
    public List<ChartModel> chartModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_grafico_faltas);
        chartModels = new ArrayList<>();

        getSupportActionBar().setTitle("Médias bimestrais");


        chartModels.add(new ChartModel(Database.dataModel.getMatematica(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Matemática"));

        chartModels.add(new ChartModel(Database.dataModel.getPortugues(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Português"));

        chartModels.add(new ChartModel(Database.dataModel.getIngles(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Inglês"));

        chartModels.add(new ChartModel(Database.dataModel.getRedacao(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Redação"));

        chartModels.add(new ChartModel(Database.dataModel.getArtes(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Artes"));

        chartModels.add(new ChartModel(Database.dataModel.getEducacaoFisica(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Educação Física"));

        chartModels.add(new ChartModel(Database.dataModel.getBiologia(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Biologia"));

        chartModels.add(new ChartModel(Database.dataModel.getHistoria(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"História"));

        chartModels.add(new ChartModel(Database.dataModel.getGeografia(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Geografia"));

        chartModels.add(new ChartModel(Database.dataModel.getFilosofia(),"Primeiro, Segundo, Terceiro, Quarto - (Bimestre)", Constants.CHART_TYPE_BAR,"Filosofia"));





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
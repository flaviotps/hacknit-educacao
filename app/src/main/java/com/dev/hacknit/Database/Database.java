package com.dev.hacknit.Database;


import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

    private Activity activity;
    public static List<DataModel> dataModels;

    public Database(Activity activity) {
        this.activity = activity;
        dataModels = new ArrayList<>();
    }

    public void readItems(int resource) throws JSONException {

        dataModels = new ArrayList<>();

        InputStream inputStream = activity.getResources().openRawResource(resource);
        String json = new Scanner(inputStream).useDelimiter("\\A").next();
        JSONArray array = new JSONArray(json);
        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            DataModel data = new DataModel();
            data.id = object.getInt("id");
            data.idade = object.getInt("idade");
            data.nome = object.getString("nome");
            data.escola = object.getString("escola");
            data.cpf = object.getString("cpf");
            data.pai = object.getString("pai_nome");
            data.paiCpf = object.getString("pai_cpf");
            data.mae = object.getString("mae_nome");
            data.maeCpf = object.getString("mae_cpf");

            for(int j=0;j<=3;j++) {

               JSONObject disc = object.getJSONObject("ano").getJSONObject("0").getJSONObject(String.valueOf(j)).getJSONObject("disciplinas");
               Ano ano = new Ano();
               ano.index = j;


               Bimestre bi = new Bimestre();
               bi.faltas = object.getJSONObject("ano").getJSONObject("0").getJSONObject(String.valueOf(j)).getInt("faltas");
               bi.matematica = disc.getInt("matematica");
               bi.artes = disc.getInt("artes");
               bi.biologia = disc.getInt("biologia");
               bi.educacaofisica = disc.getInt("educacaofisica");
               bi.filosofia = disc.getInt("filosofia");
               bi.historia = disc.getInt("historia");
               bi.geografia = disc.getInt("geografia");
               bi.ingles = disc.getInt("ingles");
               bi.portugues = disc.getInt("portugues");
               bi.redacao = disc.getInt("redacao");

               ano.bimestreList.add(bi);
               data.anoList.add(ano);
               dataModels.add(data);

            }


        }

    }
}

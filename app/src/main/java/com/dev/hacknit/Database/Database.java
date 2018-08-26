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

import es.dmoral.toasty.Toasty;

public class Database {

    private Activity activity;
    public static List<DataModel> dataModels;
    public static DataModel dataModel;

    public Database(Activity activity) {
        this.activity = activity;
        dataModels = new ArrayList<>();
    }

    public DataModel getDataModel(String CPF, String IMEP){
        Log.i("TEST", CPF + "/" + IMEP);
        for (DataModel d:dataModels) {
            if(d.getMatricula().trim().equals(IMEP)){
                Log.i("cpf", d.getResponsavelCpf());
                if (d.getResponsavelCpf().equals(CPF)) {
                    dataModel = d;
                    return d;
                }else{
                    Toasty.error(activity, "A senha digitada está incorreta!", Toast.LENGTH_SHORT, true).show();
                    break;
                }
            }
            else{
                Toasty.error(activity, "O número de matrícula não existe ou não foi encontrado.", Toast.LENGTH_SHORT, true).show();
                break;
            }
        }
        return null;
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
            data.matricula = object.getString("matricula");
            data.nome = object.getString("nome");
            data.escola = object.getString("escola");
            data.cpf = object.getString("cpf");
            data.pai = object.getString("pai_nome");
            data.responsavelCpf = object.getString("responsavel_cpf");
            data.mae = object.getString("mae_nome");


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
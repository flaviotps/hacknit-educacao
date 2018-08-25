package com.dev.hacknit.Database;


import android.app.Activity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    private Activity activity;

    public Database(Activity activity) {
        this.activity = activity;
    }

    public ArrayList<Aluno> ReadAlunos(int resource) throws JSONException {
        ArrayList<Aluno> list = new ArrayList<Aluno>();
        InputStream inputStream = activity.getResources().openRawResource(resource);
        String json = new Scanner(inputStream).useDelimiter("\\A").next();
        JSONArray array = new JSONArray(json);
        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            String nome = object.getString("nome");
            list.add(new Aluno(nome));
        }
        return list;
    }
}

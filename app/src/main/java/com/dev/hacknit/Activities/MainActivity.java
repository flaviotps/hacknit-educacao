package com.dev.hacknit.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dev.hacknit.Database.Aluno;
import com.dev.hacknit.Database.Database;
import com.dev.hacknit.R;

import org.json.JSONException;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    public Database database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = new Database(this);

        try {
           List<Aluno> alunos = database.ReadAlunos(R.raw.data);
            for (Aluno aluno:alunos) {
                Log.i("ALUNO",aluno.nome);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
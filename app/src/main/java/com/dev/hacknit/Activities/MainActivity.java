package com.dev.hacknit.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.dev.hacknit.Database.Database;
import com.dev.hacknit.R;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView cardView1;
    private CardView cardView2;
    private CardView cardView3;
    private CardView cardView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardView1: {
                Intent telaAluno = new Intent(MainActivity.this, AlunoActivity.class);
                startActivity(telaAluno);
                break;
            }
            case R.id.cardView2: {
                Intent telaBoletim = new Intent(MainActivity.this, BoletimActivity.class);
                startActivity(telaBoletim);
                break;
            }
            case R.id.cardView3: {
                Intent telasFaltas = new Intent(MainActivity.this, GraficosNotasActivity.class);
                startActivity(telasFaltas);
                break;
            }
            case R.id.cardView4: {
                Intent telaOpcao4 = new Intent(MainActivity.this, GraficosFaltasActivity.class);
                startActivity(telaOpcao4);
                break;
            }
        }
    }
}
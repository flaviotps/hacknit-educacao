package com.dev.hacknit.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.dev.hacknit.Database.Database;
import com.dev.hacknit.R;

public class AlunoActivity extends AppCompatActivity {

    private TextView txtCPFResponsavel,txtNomeAluno,txtEscolaAluno,txtAlunoIMEP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Informações pessoais");

       txtNomeAluno = findViewById(R.id.txtAlunoNome);
       txtEscolaAluno = findViewById(R.id.txtAlunoEscola);
       txtAlunoIMEP = findViewById(R.id.txtAlunoIMEP);

       txtCPFResponsavel = findViewById(R.id.txtCPFresponsavel);

       txtNomeAluno.setText(Database.dataModel.getNome());
        txtEscolaAluno.setText(Database.dataModel.getEscola());
       txtAlunoIMEP.setText(Database.dataModel.getMatricula());
       txtCPFResponsavel.setText(Database.dataModel.getMaeCpf());
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}
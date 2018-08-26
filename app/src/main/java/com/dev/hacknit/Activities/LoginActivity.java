package com.dev.hacknit.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.dev.hacknit.Database.Database;
import com.dev.hacknit.R;
import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONException;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    public Database database;
    private TextInputEditText IMEP;
    private TextInputEditText CPF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        IMEP = findViewById(R.id.inputLogin);
        CPF = findViewById(R.id.inputSenha);

        database = new Database(this);
        try {
            database.readItems(R.raw.dados);
        } catch (JSONException e) {
            e.printStackTrace();

        }

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        btnLogin = findViewById(R.id.btnLogar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(database.getDataModel(String.valueOf(CPF.getText()),String.valueOf(IMEP.getText()))!=null) {
                    Intent MenuPrincipal = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(MenuPrincipal);
                    finish();
                }
            }
        });
    }
}

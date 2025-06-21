package com.example.comabem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    EditText edtNome, edtQuantidade, edtPreco;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtNome = findViewById(R.id.edtNome);
        edtQuantidade = findViewById(R.id.edtQuantidade);
        edtPreco = findViewById(R.id.edtPreco);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String nome = edtNome.getText().toString();
            String quantidade = edtQuantidade.getText().toString();
            String preco = edtPreco.getText().toString();

            if (nome.isEmpty() || quantidade.isEmpty() || preco.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Produto salvo com sucesso!", Toast.LENGTH_SHORT).show();
                // Aqui futuramente você pode salvar em um banco ou lista
            }
        });
    }
}

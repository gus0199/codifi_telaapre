package com.example.comabem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.widget.ImageView;

public class CadastroActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView imgProduto;
    Button btnFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        imgProduto = findViewById(R.id.imgProduto);
        btnFoto = findViewById(R.id.btnFoto);

        btnFoto.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap foto = (Bitmap) extras.get("data");
            imgProduto.setImageBitmap(foto);
        }
    }
}

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

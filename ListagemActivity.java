package com.example.comabem;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListagemActivity extends AppCompatActivity {

    ListView listViewProdutos;
    ArrayList<String> listaProdutos;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        listViewProdutos = findViewById(R.id.listViewProdutos);

        // Simulando produtos cadastrados
        listaProdutos = new ArrayList<>();
        listaProdutos.add("Arroz Integral - R$ 8,90 - 2 unid.");
        listaProdutos.add("Feijão Preto - R$ 6,50 - 1 unid.");
        listaProdutos.add("Banana Prata - R$ 5,00 - 6 unid.");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaProdutos);
        listViewProdutos.setAdapter(adapter);
    }
}

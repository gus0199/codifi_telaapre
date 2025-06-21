package com.example.comabem;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Aguarda 3 segundos e redireciona para a próxima tela
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, CadastroActivity.class);
            startActivity(intent);
            finish(); // Finaliza a Splash
        }, 3000);
    }
}

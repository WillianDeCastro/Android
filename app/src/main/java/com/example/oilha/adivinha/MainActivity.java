package com.example.oilha.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void InformaValor(View view) {
        ((TextView)findViewById(R.id.txtResulta)).setText(new Numeros().MensagemFinal());

        Toast.makeText(getApplicationContext(),"Mais sorte da próxima", Toast.LENGTH_LONG).show();
    }
}

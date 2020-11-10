package com.example.en_camino_con_mama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConcepcionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepcion);
    }
    public void onClick5(View v){
        Intent anterior = new Intent(this, SegundoActivity.class);
        startActivity(anterior);
    }
}
package com.example.en_camino_con_mama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }
    // Metodo para el boton anterior
    public void onClick2(View v){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    public void onClick3(View v){
        Intent anterior = new Intent(this, GestacionalActivity.class);
        startActivity(anterior);
    }
    public void onClick4(View v){
        Intent anterior = new Intent(this, ConcepcionActivity.class);
        startActivity(anterior);
    }
    public void onClickParto(View v){
        Intent anterior = new Intent(this, PartoActivity.class);
        startActivity(anterior);
    }
    public void onClickNinguna(View v){
        Intent anterior = new Intent(this, NingunaActivity.class);
        startActivity(anterior);
    }
}
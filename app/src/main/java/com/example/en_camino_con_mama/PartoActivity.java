package com.example.en_camino_con_mama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PartoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parto);
    }
    public void onClickParto(View v){
        Intent anterior = new Intent(this, SegundoActivity.class);
        startActivity(anterior);
    }
}
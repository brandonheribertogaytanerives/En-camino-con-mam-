package com.example.en_camino_con_mama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    TextView textView2;
    ImageView imgvWimag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }
}
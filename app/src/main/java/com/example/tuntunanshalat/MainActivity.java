package com.example.tuntunanshalat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);
    }

    public void  clickniatshalat(View view) {
        Intent i = new Intent(this,niatshalatwajib.class);
        startActivity(i);
    }
    public void clickbacaanshalat(View view){
        Intent i = new Intent(this,BacaanShalat.class);
        startActivity(i);
    }
    public void clickayatkursi(View view){
        Intent i = new Intent(this,AyatKursi.class);
        startActivity(i);
    }
}
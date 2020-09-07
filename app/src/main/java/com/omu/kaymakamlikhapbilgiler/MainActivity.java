package com.omu.kaymakamlikhapbilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnGuncelBilgiler,btnKisiselNotlar,btnYardimciKaynaklar,btnGeriBildirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        btnKisiselNotlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,KisiselNotlar.class);
                startActivity(intent1);
                Animatoo.animateFade(MainActivity.this);
            }
        });
        btnYardimciKaynaklar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,YardimciKaynaklar.class);
                startActivity(intent2);
                Animatoo.animateFade(MainActivity.this);
            }
        });
        btnGeriBildirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,GeriBildirim.class);
                startActivity(intent3);
                Animatoo.animateFade(MainActivity.this);
            }
        });

    }
    public void tanimla(){
    btnGuncelBilgiler=findViewById(R.id.btnGuncelBilgiler);
    btnKisiselNotlar=findViewById(R.id.btnKisiselNotlar);
    btnYardimciKaynaklar=findViewById(R.id.btnYardimciKaynaklar);
    btnGeriBildirim = findViewById(R.id.btnGeriBildirim);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSwipeRight(this);
    }

}
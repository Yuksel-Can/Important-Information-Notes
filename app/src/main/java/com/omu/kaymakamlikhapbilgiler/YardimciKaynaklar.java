package com.omu.kaymakamlikhapbilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class YardimciKaynaklar extends AppCompatActivity {

    LinearLayout btnGuncelBilgiler,btnKisiselNotlar,btnYardimciKaynaklar,btnGeriBildirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yardimci_kaynaklar);

        tanimla();
        btnGuncelBilgiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(YardimciKaynaklar.this,MainActivity.class);
                startActivity(intent1);
                Animatoo.animateFade(YardimciKaynaklar.this);
            }
        });
        btnKisiselNotlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(YardimciKaynaklar.this,KisiselNotlar.class);
                startActivity(intent2);
                Animatoo.animateFade(YardimciKaynaklar.this);
            }
        });
        btnGeriBildirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(YardimciKaynaklar.this,GeriBildirim.class);
                startActivity(intent3);
                Animatoo.animateFade(YardimciKaynaklar.this);
            }
        });
    }
    public void tanimla() {
        btnGuncelBilgiler = findViewById(R.id.btnGuncelBilgiler);
        btnKisiselNotlar = findViewById(R.id.btnKisiselNotlar);
        btnYardimciKaynaklar = findViewById(R.id.btnYardimciKaynaklar);
        btnGeriBildirim = findViewById(R.id.btnGeriBildirim);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSwipeRight(this);
    }
}
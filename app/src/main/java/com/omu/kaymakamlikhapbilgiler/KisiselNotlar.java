package com.omu.kaymakamlikhapbilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class KisiselNotlar extends AppCompatActivity {

    LinearLayout btnGuncelBilgiler,btnKisiselNotlar,btnYardimciKaynaklar,btnGeriBildirim;
    LinearLayout btnGenelKultur, btnAlanBilgisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisisel_notlar);

        tanimla();
        btnGuncelBilgiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(KisiselNotlar.this,MainActivity.class);
                startActivity(intent1);
                Animatoo.animateFade(KisiselNotlar.this);
            }
        });
        btnYardimciKaynaklar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(KisiselNotlar.this,YardimciKaynaklar.class);
                startActivity(intent2);
                Animatoo.animateFade(KisiselNotlar.this);
            }
        });
        btnGeriBildirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(KisiselNotlar.this,GeriBildirim.class);
                startActivity(intent3);
                Animatoo.animateFade(KisiselNotlar.this);
            }
        });

        btnGenelKultur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(KisiselNotlar.this,GenelYetenekKultur.class);
                startActivity(intent3);
                Animatoo.animateFade(KisiselNotlar.this);
            }
        });
        btnAlanBilgisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(KisiselNotlar.this,AlanBilgisi.class);
                startActivity(intent3);
                Animatoo.animateFade(KisiselNotlar.this);
            }
        });
    }
    public void tanimla() {
        btnGuncelBilgiler = findViewById(R.id.btnGuncelBilgiler);
        btnKisiselNotlar = findViewById(R.id.btnKisiselNotlar);
        btnYardimciKaynaklar = findViewById(R.id.btnYardimciKaynaklar);
        btnGeriBildirim = findViewById(R.id.btnGeriBildirim);
        btnGenelKultur = findViewById(R.id.btnGenelKultur);
        btnAlanBilgisi = findViewById(R.id.btnAlanBilgisi);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSwipeRight(this);
    }

}
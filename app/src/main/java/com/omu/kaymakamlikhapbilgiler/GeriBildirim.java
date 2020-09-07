package com.omu.kaymakamlikhapbilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class GeriBildirim extends AppCompatActivity {

    LinearLayout btnGuncelBilgiler,btnKisiselNotlar,btnYardimciKaynaklar,btnGeriBildirim;
    Button gecici;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geri_bildirim);

        tanimla();
        btnGuncelBilgiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(GeriBildirim.this,MainActivity.class);
                startActivity(intent1);
                Animatoo.animateFade(GeriBildirim.this);
            }
        });
        btnKisiselNotlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GeriBildirim.this,KisiselNotlar.class);
                startActivity(intent2);
                Animatoo.animateFade(GeriBildirim.this);
            }
        });
        btnYardimciKaynaklar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(GeriBildirim.this,YardimciKaynaklar.class);
                startActivity(intent3);
                Animatoo.animateFade(GeriBildirim.this);
            }
        });
        gecici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(GeriBildirim.this, BildirimActivity.class);
                startActivity(intent4);
                Animatoo.animateFade(GeriBildirim.this);
            }
        });
    }
    public void tanimla() {
        btnGuncelBilgiler = findViewById(R.id.btnGuncelBilgiler);
        btnKisiselNotlar = findViewById(R.id.btnKisiselNotlar);
        btnYardimciKaynaklar = findViewById(R.id.btnYardimciKaynaklar);
        btnGeriBildirim = findViewById(R.id.btnGeriBildirim);
        gecici = findViewById(R.id.gecici);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSwipeRight(this);
    }
}
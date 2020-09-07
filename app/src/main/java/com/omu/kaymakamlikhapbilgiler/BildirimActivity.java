package com.omu.kaymakamlikhapbilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class BildirimActivity extends AppCompatActivity {

    LinearLayout btnGuncelBilgiler,btnKisiselNotlar,btnYardimciKaynaklar,btnGeriBildirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bildirim);

        tanimla();

        btnGuncelBilgiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(BildirimActivity.this,MainActivity.class);
                startActivity(intent1);
                Animatoo.animateFade(BildirimActivity.this);
            }
        });
        btnKisiselNotlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(BildirimActivity.this,KisiselNotlar.class);
                startActivity(intent2);
                Animatoo.animateFade(BildirimActivity.this);
            }
        });
        btnYardimciKaynaklar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(BildirimActivity.this,KisiselNotlar.class);
                startActivity(intent2);
                Animatoo.animateFade(BildirimActivity.this);
            }
        });
        btnGeriBildirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(BildirimActivity.this,GeriBildirim.class);
                startActivity(intent3);
                Animatoo.animateFade(BildirimActivity.this);
            }
        });
    }
    public void tanimla() {
        btnGuncelBilgiler = findViewById(R.id.btnGuncelBilgiler);
        btnKisiselNotlar = findViewById(R.id.btnKisiselNotlar);
        btnYardimciKaynaklar = findViewById(R.id.btnYardimciKaynaklar);
        btnGeriBildirim = findViewById(R.id.btnGeriBildirim);
        btnYardimciKaynaklar = findViewById(R.id.btnYardimciKaynaklar);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Animatoo.animateSwipeRight(this);
    }
}
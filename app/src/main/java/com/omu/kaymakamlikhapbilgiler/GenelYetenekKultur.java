package com.omu.kaymakamlikhapbilgiler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class GenelYetenekKultur extends AppCompatActivity {

    LinearLayout btnGuncelBilgiler,btnKisiselNotlar,btnYardimciKaynaklar,btnGeriBildirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genel_yetenek_kultur);

        tanimla();
        btnGuncelBilgiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(GenelYetenekKultur.this,MainActivity.class);
                startActivity(intent1);
                Animatoo.animateFade(GenelYetenekKultur.this);
            }
        });
        btnYardimciKaynaklar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GenelYetenekKultur.this,YardimciKaynaklar.class);
                startActivity(intent2);
                Animatoo.animateFade(GenelYetenekKultur.this);
            }
        });
        btnGeriBildirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(GenelYetenekKultur.this,GeriBildirim.class);
                startActivity(intent3);
                Animatoo.animateFade(GenelYetenekKultur.this);
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
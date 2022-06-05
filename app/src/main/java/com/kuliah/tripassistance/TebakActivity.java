package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class TebakActivity extends AppCompatActivity implements View.OnClickListener {
    TextView pertanyaan;
    Button jwb1, jwb2, jwb3, submitJwb;
    ImageView gambarSoal;
    int nilai;
    int jumlahPertanyaan =  SoalTebak.kuis.length;
    int pertanyaanIndex = 0;
    String pilihan = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        pertanyaan = findViewById(R.id.pertanyaan);
        submitJwb = findViewById(R.id.submitJwb);
        jwb1 = findViewById(R.id.jwb1);
        jwb2 = findViewById(R.id.jwb2);
        jwb3 = findViewById(R.id.jwb3);
        gambarSoal = findViewById(R.id.gambarSoal);

        pertanyaan.setOnClickListener(this);
        jwb1.setOnClickListener(this);
        jwb2.setOnClickListener(this);
        jwb3.setOnClickListener(this);
        submitJwb.setOnClickListener(this);
        gambarSoal.setOnClickListener(this);

        loadPertanyaan();
    }

    @Override
    public void onClick(View view) {

        jwb1.setBackgroundColor(Color.WHITE);
        jwb2.setBackgroundColor(Color.WHITE);
        jwb3.setBackgroundColor(Color.WHITE);

        Button pilihanSubmit = (Button) view;
        if(pilihanSubmit.getId() == R.id.submitJwb){
            if (pilihan.equals(SoalTebak.jawaban[pertanyaanIndex])){
                nilai++;
            }
            pertanyaanIndex++;
            loadPertanyaan();
            loadPertanyaan();

        }else{
            pilihan = pilihanSubmit.getText().toString();
            pilihanSubmit.setBackgroundColor(Color.RED);
        }
    }

    void loadPertanyaan(){
        if(pertanyaanIndex == 4){
            selesai();
            return;
        }
        pertanyaan.setText("Menurutmu apakah gambar di atas?");
        jwb1.setText(SoalTebak.pilihan[pertanyaanIndex][0]);
        jwb2.setText(SoalTebak.pilihan[pertanyaanIndex][1]);
        jwb3.setText(SoalTebak.pilihan[pertanyaanIndex][2]);
        gambarSoal.setImageResource(SoalTebak.gambar[pertanyaanIndex]);

    }

    void selesai(){
        String status = "";
        if (nilai >=2 ){
            status = "Lulus";
        }else{
            status = "Gagal";
        }

        new AlertDialog.Builder(this)
                .setTitle(status)
                .setMessage("Jumlah Nilai "+ nilai)
                .setPositiveButton("Menu Utama", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(TebakActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                })
                .setCancelable(false)
                .show();
    }
}
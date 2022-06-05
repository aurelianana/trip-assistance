package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailWisataActivity extends AppCompatActivity {

    private TextView tvNamaTempat, tvDescTempat;
    private ImageView ivGambarTempat;
    private String yNama;
    private String yDeskripsi;
    private int yFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        initView();

        Bundle terima = getIntent().getExtras();
        yNama = terima.getString("namaTempatWisata");
        yDeskripsi = terima.getString("descTempatWisata");
        yFoto = terima.getInt("fotoWisata");

        tvNamaTempat.setText(yNama);
        tvDescTempat.setText(yDeskripsi);
        ivGambarTempat.setImageResource(yFoto);
    }

    private void initView(){
        tvNamaTempat = findViewById(R.id.tvNamaWisata);
        tvDescTempat = findViewById(R.id.tvDescWisata);
        ivGambarTempat = findViewById(R.id.fotoWisata);
    }
}

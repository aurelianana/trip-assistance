package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.kuliah.tripassistance.model.ModelKuliner;


public class DetailKulinerActivity extends AppCompatActivity {

    Toolbar tbDetailKuliner;
    GoogleMap googleMaps;
    TextView tvNamaKuliner, tvAddressKuliner, tvPhoneKuliner, tvOpenTime, tvDesc;
    String idKuliner, NamaKuliner, AddressKuliner, PhoneKuliner, OpenTime, Desc;
    ImageView ivKuliner;
    ModelKuliner modelKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuliner);


        modelKuliner = (ModelKuliner) getIntent().getSerializableExtra("detailKuliner");
        if (modelKuliner != null) {
            idKuliner = modelKuliner.getIdKuliner();
            NamaKuliner = modelKuliner.getTxtNamaKuliner();

            //set Id
            tvNamaKuliner = findViewById(R.id.tvNamaKuliner);
            tvAddressKuliner = findViewById(R.id.tvAddressKuliner);
            tvPhoneKuliner = findViewById(R.id.tvPhoneKuliner);
            tvOpenTime = findViewById(R.id.tvOpenTime);
            tvDesc = findViewById(R.id.tvDesc);
            tvDesc = findViewById(R.id.tvDesc);
            ivKuliner = findViewById(R.id.imgKuliner);

            tvNamaKuliner.setText("Warung " + modelKuliner.getTxtNamaKuliner());
            tvAddressKuliner.setText(modelKuliner.getTxtAlamatKuliner());
            tvPhoneKuliner.setText("082847593923");
            tvDesc.setText(modelKuliner.getDeskripsiKuliner());
            tvOpenTime.setText(modelKuliner.getTxtOpenTime());
            ivKuliner.setImageResource(modelKuliner.getGambarWarung());
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
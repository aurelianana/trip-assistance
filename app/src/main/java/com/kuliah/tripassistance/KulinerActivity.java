package com.kuliah.tripassistance;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kuliah.tripassistance.R;
import com.kuliah.tripassistance.adapter.ListKulinerAdapter;
import com.kuliah.tripassistance.ornament.LayoutMarginDecoration;
import com.kuliah.tripassistance.model.ModelKuliner;
import com.kuliah.tripassistance.utils.Tools;


import java.util.ArrayList;
import java.util.List;

public class KulinerActivity extends AppCompatActivity implements ListKulinerAdapter.onSelectData {

    RecyclerView rvKuliner;
    LayoutMarginDecoration gridMargin;
    ListKulinerAdapter kulinerAdapter;
    ProgressDialog progressDialog;
    List<ModelKuliner> modelKuliner = new ArrayList<>();
    Toolbar tbKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);


        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Mohon Tunggu");
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Sedang menampilkan data...");

        rvKuliner = findViewById(R.id.rvKuliner);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,
                1, RecyclerView.VERTICAL, false);
        rvKuliner.setLayoutManager(mLayoutManager);
        gridMargin = new LayoutMarginDecoration(2, Tools.dp2px(this, 4));
        rvKuliner.addItemDecoration(gridMargin);
        rvKuliner.setHasFixedSize(true);

        getKuliner();
    }

    private void getKuliner() {
        progressDialog.show();

        modelKuliner.add(new ModelKuliner("1", "Babi Guling", "Jl. Raya Kuta No.116, Kuta, Kec. Kuta, Kabupaten Badung, Bali 80361", "19.00 - 02.00", "1000", R.drawable.babi, R.drawable.warung_babi, "Babi guling Bali adalah salah satu kuliner yang cukup dikenal di Pulau Dewata. Olahan makanan yang menjadikan babi sebagai bahan baku utamanya cukup banyak dikonsumsi oleh warga lokalnya. Selain untuk dimakan, menu ini juga wajib disuguhkan ketika menyelenggarakan perayaan keagamaan. Menu ini juga sudah dicatat sebagai Warisan Budaya Tak Benda UNESCO di Indonesia sejak 2011 silam. Fakta ini juga membuat banyak wisatawan penasaran dengan bentuk dan rasanya. Kebanyakan hotel berbintang, restoran, hingga warung makan menyajikan nasi babi guling dengan harga per porsi biasanya dibanderol mulai dari Rp30 ribuan."));
        modelKuliner.add(new ModelKuliner("2", "Sate Lilit", "Jl. Pulau Buru No.10, Dauh Puri, Kec. Denpasar Bar., Kota Denpasar, Bali 80232", "06.30 - 15.00", "1000", R.drawable.sate_lilit, R.drawable.warung_satelilit,"Sate lilit adalah makanan khas Bali, di mana hampir di setiap upacara orang Bali selalu tersedia sate lilit. Daging yang digunakan pada sate lilit lebih banyak adalah daging ayam atau ikan, tapi ada juga yang menggunakan daging babi. Sate Lilit merupakan hidangan khas daerah Klungkung. Satu hal menarik terkait keberadaan kuliner khas Bali ini adalah bagi warga Bali, sate lilit bukan sekadar makanan yang disantap setiap hari, namun secara khusus bagi para laki-laki Bali, sate lilit merupakan salah satu bukti kejantanan mereka."));
        modelKuliner.add(new ModelKuliner("3", "Ayam Betutu", "Jl. Tukad Irawadi No.5, Panjer, Denpasar Selatan, Kota Denpasar, Bali 80234", "10.00 - 17.00", "1000", R.drawable.ayam_betutu, R.drawable.warung_ayambetutu, "Ayam betutu merupakan masakan khas dari Bali. Menurut ahli Gastronomi, Betutu adalah garis walacenya seni kuliner nusantara. Pembatas antara Seni makanan Barat dan Timur Di Indonesia. Sebagai peralihan dari makanan manis di Jawa ke makanan pedas di Timur, Betutu sudah mendapat penetapan sebagai Warisan Budaya Tak benda (WBTB) Indonesia. Karena itu, kuliner betutu konon sedang diusahakan ditingkatkan fungsinya sebagai sarana diplomasi. Nasi betutu biasanya tersaji bersama lauk tambahan seperti telur masak bali, satai lilit, lawar dan sambal matah. Cara memasak Betutu masih terbilang tradisional yakni dengan menggunakan sekam dan bara api."));
        modelKuliner.add(new ModelKuliner("4", "Nasi Campur", "Jl. Bukit Tunggal No.18, Pemecutan, Kec. Denpasar Bar., Kota Denpasar, Bali 80119", "16.00 - 02.00", "1000", R.drawable.nasi_campur, R.drawable.warung_nasicampur, "Salah satu menu khas Bali yang wajib dicoba ketika berkunjung ke Bali adalah nasi campur Bali. Sesuai namanya, Nasi Campur Bali merupakan campuran nasi dengan berbagai macam lauk pauk seperti ayam, telur sayuran dan juga sate lilit yang biasanya terbuat dari ikan atau ayam. Lauk ayam yang digunakan juga merupakan ayam yang dipanggang dengan bumbu Bali serta dengan cita rasanya yang gurih."));
        modelKuliner.add(new ModelKuliner("5", "Nasi Jinggo", "No. 36xxA, Jl. Kediri, Kuta, Kec. Kuta, Kabupaten Badung, Bali 80361", "08.00 - 22.00", "1000", R.drawable.nasi_jinggo, R.drawable.nasi_jinggo, "Nasi jinggo berasal dari daerah Bali sejak tahun 1990-an. Menurut para penjual, nasi jinggo pertama kali dijual di kawasan Jalan Gajah Mada, Denpasar, di dekat Pasar Kumbasari. Nasi jinggo khas Bali mirip dengan nasi kucing yang ada di Yogyakarta. Namun, nasi jinggo biasanya hanya berisi sekepal nasi, ayam sisit, potongan tempe kecil-kecil, mi goreng, serundeng dan sambal khas penjual. Dan harga seporsi nasi jinggo dibanderol Rp 5 ribu."));

        progressDialog.dismiss();


        showKuliner();
    }

    private void showKuliner() {
        kulinerAdapter = new ListKulinerAdapter(KulinerActivity.this, modelKuliner, this);
        rvKuliner.setAdapter(kulinerAdapter);
    }

    @Override
    public void onSelected(ModelKuliner modelKuliner) {
        Intent intent = new Intent(KulinerActivity.this, DetailKulinerActivity.class);
        intent.putExtra("detailKuliner", modelKuliner);
        startActivity(intent);
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
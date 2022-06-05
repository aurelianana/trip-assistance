package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import com.kuliah.tripassistance.adapter.ListWisataAdapter;
import com.kuliah.tripassistance.model.ModelWisata;

import java.util.ArrayList;

public class WisataActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelWisata> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        getData();

        recyclerView = findViewById(R.id.rvWisata);
        ListWisataAdapter listWisata= new ListWisataAdapter(data);
        recyclerView.setAdapter(listWisata);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(WisataActivity.this, 2);
        recyclerView.setLayoutManager(layoutManager);

        listWisata.setOnItemClickCallBack(new ListWisataAdapter.OnClickItemCallBack() {
            @Override
            public void onItemClicked(ModelWisata data) {
                Intent intent = new Intent(WisataActivity.this, DetailWisataActivity.class);
                intent.putExtra("namaTempatWisata", data.getNamatempatwisata());
                intent.putExtra("descTempatWisata", data.getDesctempatwisata());
                intent.putExtra("fotoWisata", data.getGambartempatwisata());
                startActivity(intent);
            }
        });
    }

    public void getData() {
        data.add(new ModelWisata("Savana", R.drawable.savanaa, "Savana Tianyar", "Savana Tianyar adalah hamparan padang rumput yang tandus dan gersang pada musim panas, terlihat seperti padang savana yang berada di luar sana, menyuguhkan pemandangan alam begitu cantik, bebatuan gunung yang berada di antara hamparan rumput kuning kecoklatan berpadu indah menyuguhkan panorama alam yang berbeda dari biasanya, dengan latar belakang Gunung Agung yang menjulang tinggi, serta deretan perbukitan, termasuk bukit Mangun dan bendungan yang berada di kawasan ini, tersaji indah, ketika pagi hari lengkap dengan sajian matahari terbit dan sore harinya matahari terbenam (sunset) di balik Gunung Agung."));
        data.add(new ModelWisata("Pantai", R.drawable.kutaa, "Pantai Kuta", "Pantai Kuta adalah sebuah tempat pariwisata yang terletak di kecamatan Kuta, sebelah selatan Kota Denpasar, Bali, Indonesia. Daerah ini merupakan sebuah tujuan wisata turis mancanegara dan telah menjadi objek wisata andalan Pulau Bali sejak awal tahun 1970-an. Pantai Kuta sering pula disebut sebagai pantai matahari terbenam (sunset beach) sebagai lawan dari pantai Sanur."));
        data.add(new ModelWisata("Patung", R.drawable.gwk, "GWK", "Garuda Wisnu Kencana atau yang disering disingkat dengan GWK adalah sebuah taman wisata budaya di bagian selatan pulau Bali. Taman wisata ini terletak di Desa Ungasan, Kecamatan Kuta Selatan, Kabupaten Badung, kira-kira 40 kilometer di sebelah selatan Denpasar, ibu kota provinsi Bali.Di sini berdiri megah sebuah landmark atau maskot Bali, yakni patung Garuda Wisnu Kencana yang menggambarkan sosok Dewa Wisnu menunggangi tunggangannya, Garuda, setinggi 121 meter."));
        data.add(new ModelWisata("Pantai", R.drawable.sanur, "Pantai Sanur", "Pantai Sanur adalah salah satu pantai wisata yang ada di pulau Bali. Pantai ini terletak persis di sebelah timur kota Denpasar, Bali. Sanur berada di Kotamadya Denpasar. Karena memiliki ombak yang cukup tenang, maka pantai Sanur tidak bisa dipakai untuk selancar layaknya Pantai Kuta. Tak jauh dari Pantai Sanur terdapat juga lokasi wisata selam dan snorkeling. Lokasi selam ini dapat digunakan oleh para penyelam dari semua tingkatan keahlian. Pantai Sanur juga dikenal sebagai sunrise beach (pantai untuk melihat matahari terbit), berlawanan dengan Pantai Kuta yang lebih dikenal dengan pemandangan matahari tenggelam."));
        data.add(new ModelWisata("Taman", R.drawable.tamanmumbul, "Taman Mumbul", "Taman Mumbul Sangeh merupakan lokasi yang disucikan karena di taman ini terdapat sebuah tempat suci (pura) dan taman ini juga digunakan sebagai tempat upacara Melasti bagi masyarakat desa Sangeh. Di taman ini terdapat sebuah kolam dengan air yang sangat jernih dan dihuni oleh ribuan ikannya yang siap menyapa anda. Taman ini merupakan sebuah area hijau yang asri. Dari sisi sebelah selatan kolam kita bisa menyaksikan indahnya panorama kolam dan sekitarnya serta teduhnya pepohonan menaungi sebuah kolam."));
        data.add(new ModelWisata("Kebun", R.drawable.bedugul, "Kebun Raya Bedugul", "Kebun Raya Bedugul merupakan sebuah kebun botani terbesar di Indonesia yang terletak di Desa Candikuning, Kecamatan Baturiti, Kabupaten Tabanan, Bali berjarak sekitar 60 km dari Denpasar. Kebun ini merupakan kebun raya pertama yang didirikan oleh putra bangsa Indonesia. Pengelolaannya dilakukan oleh Lembaga Ilmu Pengetahuan Indonesia (LIPI) dan secara struktur organisasi berada di bawah pembinaan Pusat Konservasi Tumbuhan Kebun Raya Bogor. Kebun ini didirikan pada 15 Juli 1959."));
        data.add(new ModelWisata("Meseum", R.drawable.geo, "Museum Geopark", "Museum Geopark Batur adalah museum yang menyajikan informasi taman bumi nasional dan mancanegara. Letaknya di Jalan Raya Penelokan, Kintamani, Bangli, Bali. Peresmiannya dilakukan pada tanggal 10 Mei 2017. Sebelumnya, Museum Geopark Batur bernama Museum Gunungapi Batur. Namanya diganti setelah diadakan pengembangan bangunan oleh pemerintah Kabupaten Bangli dan Kementerian Energi dan Sumber Daya Mineral Indonesia. Museum Geopark Batur dimanfaatkan untuk memberikan informasi kepada masyarakat tentang manfaat dan bahaya yang diakibatkan oleh gunung berapi yang ada di Indonesia."));
        data.add(new ModelWisata("Sawah", R.drawable.jatiluwih, "Jatiluwih Rice Terraces", "Jatiluwih Rice Terraces atau yang lebih dikenal dengan sebutan Sawah Terasering Jatiluwih  adalah salah satu objek wisata di Bali yang selalu banyak dikunjungi wisatawan setiap harinya.  Objek wisata ini berada di Desa Jatiluwih, menawarkan pemandangan menakjubkan dari sawah irigasi berkontur dengan menggunakan sistem air komunal yang dikembangkan oleh petani Bali. Dari namanya saja sudah bisa dipastikan bahwa Anda bisa melihat pemandangan yang luar biasa dari Sawah Terasering Jatiluwih. Bagaimana tidak faktanya  Anda bisa melihat sawah terasering di area seluas 53.000 hektar."));
        data.add(new ModelWisata("Desa", R.drawable.penglipuran, "Desa Penglipuran", "Desa Penglipuran merupakan salah satu desa adat yang telah berkembang menjadi desa wisata yang sangat ramai dikunjungi para wisatawan, lokal maupun mancanegara. Bahkan, pada awal penetapannya desa ini sebagai desa wisata, turis asing-lah yang sering memadati desa yang terletak di Bangli ini. Awalnya, desa ini hanyalah sebuah desa yang ingin mempertahankan kebudayaan nenek moyang, leluhur. Tapi pada sekitar tahun 1990, mahasiswa Udayana melakukan Kuliah Kerja Nyata (KKN) dengan meninggalkan jejak berupa pembangunan taman-taman kecil dan penataan lingkungan, yang kemudian pada tahun 1991/1992 ada beberapa wisatawan yang mengunjungi desa ini."));
        data.add(new ModelWisata("Kebun Binatang", R.drawable.safari, "Bali Safari", "Bali Safari & Marine Park (BSMP) merupakan tempat wisata keluarga berwawasan lingkungan yang terletak di Desa Serongga, Kec. Gianyar, Kabupaten Gianyar, Bali. Bali Safari & Marine Park ini menyediakan sebuah medium unik, kombinasi dari kehidupan satwa liar di habitat aslinya dengan ekosistem bersinggungan dengan kebudayaan masyarakat Bali. BSMP menjadi tempat penangkaran hewan endemik atau rawan punah di Indonesia dan beberapa negara tetangga."));
    }
}

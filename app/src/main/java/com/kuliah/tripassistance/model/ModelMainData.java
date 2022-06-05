package com.kuliah.tripassistance.model;

import com.kuliah.tripassistance.R;

import java.util.ArrayList;

public class ModelMainData {
    private static String [] nama_layanan = {
            "Wisata Khas Bali",
            "Wisata Kuliner",
            "Wisata Religi",
            "Tebak Wisata"
    };

    private static int[] icon_layanan ={
            R.drawable.wisata_alam,
            R.drawable.wisata_kuliner,
            R.drawable.wisata_religi,
            R.drawable.tebak_wisata

    };

    public static ArrayList<ModelMain> getListData(){
        ArrayList<ModelMain> list = new ArrayList<>();
        for (int position = 0; position <nama_layanan.length; position++){
            ModelMain main = new ModelMain();
            main.setNama_layanan(nama_layanan[position]);
            main.setIcon_layanan(icon_layanan[position]);
            list.add(main);
        }
        return list;
    }
}

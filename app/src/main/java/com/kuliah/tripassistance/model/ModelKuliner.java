package com.kuliah.tripassistance.model;

import java.io.Serializable;


public class ModelKuliner implements Serializable {


    private String idKuliner, txtNamaKuliner, txtAlamatKuliner, txtOpenTime, Koordinat, KategoriKuliner, DeskripsiKuliner;
    Integer GambarKuliner, GambarWarung;

    public ModelKuliner(String idKuliner, String txtNamaKuliner, String txtAlamatKuliner, String txtOpenTime, String Koordinat, Integer GambarKuliner, Integer GambarWarung, String DeskripsiKuliner) {
        this.idKuliner = idKuliner;
        this.txtNamaKuliner = txtNamaKuliner;
        this.txtAlamatKuliner = txtAlamatKuliner;
        this.txtOpenTime = txtOpenTime;
        this.Koordinat = Koordinat;
        this.GambarKuliner = GambarKuliner;
        this.GambarWarung = GambarWarung;
        this.KategoriKuliner = KategoriKuliner;
        this.DeskripsiKuliner = DeskripsiKuliner;
    }

    public String getIdKuliner() {
        return idKuliner;
    }

    public void setIdKuliner(String idKuliner) {
        this.idKuliner = idKuliner;
    }

    public String getTxtNamaKuliner() {
        return txtNamaKuliner;
    }

    public void setTxtNamaKuliner(String txtNamaKuliner) {
        this.txtNamaKuliner = txtNamaKuliner;
    }

    public String getTxtAlamatKuliner() {
        return txtAlamatKuliner;
    }

    public void setTxtAlamatKuliner(String txtAlamatKuliner) {
        this.txtAlamatKuliner = txtAlamatKuliner;
    }

    public String getTxtOpenTime() {
        return txtOpenTime;
    }

    public void setTxtOpenTime(String txtOpenTime) {
        this.txtOpenTime = txtOpenTime;
    }

    public String getKoordinat() {
        return Koordinat;
    }

    public void setKoordinat(String koordinat) {
        this.Koordinat = koordinat;
    }

    public Integer getGambarKuliner() {
        return GambarKuliner;
    }

    public void setGambarKuliner(Integer gambarKuliner) {
        this.GambarKuliner = gambarKuliner;
    }

    public String getKategoriKuliner() {
        return KategoriKuliner;
    }

    public void setKategoriKuliner(String kategoriKuliner) {
        this.KategoriKuliner = kategoriKuliner;
    }

    public Integer getGambarWarung() {
        return GambarWarung;
    }

    public void setGambarWarung(Integer gambarWarung) {
        this.GambarWarung = gambarWarung;
    }

    public String getDeskripsiKuliner() {
        return DeskripsiKuliner;
    }

    public void setDeskripsiKuliner(String deskripsiKuliner) {
        this.DeskripsiKuliner = deskripsiKuliner;
    }
}

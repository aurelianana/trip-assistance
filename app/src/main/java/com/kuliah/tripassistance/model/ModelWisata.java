package com.kuliah.tripassistance.model;

public class ModelWisata {
    String namawisata;
    int gambartempatwisata;
    String namatempatwisata;
    String desctempatwisata;

    public ModelWisata(String namawisata, int gambartempatwisata, String namatempatwisata, String desctempatwisata) {
        this.namawisata = namawisata;
        this.gambartempatwisata = gambartempatwisata;
        this.namatempatwisata = namatempatwisata;
        this.desctempatwisata = desctempatwisata;
    }

    public String getNamawisata() {
        return namawisata;
    }

    public void setNamawisata(String namawisata) {
        this.namawisata = namawisata;
    }

    public int getGambartempatwisata() {
        return gambartempatwisata;
    }

    public void setGambartempatwisata(int gambartempatwisata) {
        this.gambartempatwisata = gambartempatwisata;
    }

    public String getNamatempatwisata() {
        return namatempatwisata;
    }

    public void setNamatempatwisata(String namatempatwisata) {
        this.namatempatwisata = namatempatwisata;
    }

    public String getDesctempatwisata() {
        return desctempatwisata;
    }

    public void setDesctempatwisata(String desctempatwisata) {
        this.desctempatwisata = desctempatwisata;
    }
}
package com.rplbo.utsnota;

public class KertasHVS extends Barang{
    private int gram;

    public KertasHVS(String deskripsi, int harga, int berat, String kodebarang, int gram) {
        super(deskripsi, harga, berat, kodebarang);
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public int getGram() {
        return gram;
    }

    @Override
    public void getinformasi() {
        super.getinformasi();
    }
}

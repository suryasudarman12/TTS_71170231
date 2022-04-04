package com.rplbo.utsnota;

public class Pulpen extends Barang{
    private String Warna;

    public Pulpen(String deskripsi, int harga, int berat, String kodebarang, String warna) {
        super(deskripsi, harga, berat, kodebarang);
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    @Override
    public void getinformasi() {
        super.getinformasi();
    }
}

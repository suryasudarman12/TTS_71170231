package com.rplbo;

public class Perempuan {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta;
    private Pria jodoh;
    private Pria temanKencan;
    private Double StandarJumlahCinta;

    public Perempuan(String nama, int usia, double jumlahCinta) {

    }

    public void MengajakKencan(Pria pria){
        if (pria == temanKencan) {
            jumlahCinta += 0.5 ;
        }else {
            System.out.println("YA KALI MAU SELINGKUH");
        }
    }

    public String getStatus() {
        return status;
    }

    public int getUsia() {
        return usia;
    }

    public String getNama() {
        return nama;
    }

    public Double getJumlah() {
        return jumlahCinta;
    }

    public Double getStandarJumlahCinta() {
        return StandarJumlahCinta;
    }

    public Pria getJodoh() {
        return jodoh;
    }

    public Pria getTemanKencan() {
        return temanKencan;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setTemanKencan() {
        this.temanKencan = temanKencan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }

    public void setJumlah(Double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public void setStandarJumlahCinta(Double standarJumlahCinta) {
        StandarJumlahCinta = standarJumlahCinta;
    }
}

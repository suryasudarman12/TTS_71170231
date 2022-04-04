package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia){


    }

    public void PDKT(Perempuan calon){


    }
    public void MengajakKencan(Perempuan perempuan){

        if (perempuan == jumlahCinta) {
         jumlahCinta +=1 ;
        }else {
         System.out.println("YA KALI MAU SELINGKUH");
     }
    }

    public void MenembakKekasih(){

    }

    public String getNama() {
        return nama;
    }

    public Double getJumlahCcinta() {
        return jumlahCinta;
    }

    public int getUsia() {
        return usia;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public String getStatus() {
        return status;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public void setJumlahCcinta(Double jumlahCcinta) {
        this.jumlahCinta = jumlahCcinta;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
}

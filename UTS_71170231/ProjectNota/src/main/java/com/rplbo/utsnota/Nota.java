package com.rplbo.utsnota;

public class Nota {
    private String nota;
    private String notelpembeli;
    private Item item;
    private String namaPembeli;

    public Nota(String nota, String notelpembeli, String namaPembeli, Item item){

    }

    public void setNotelpembeli(String notelpembeli) {
        this.notelpembeli = notelpembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getNota() {
        return nota;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    public void tampilNota(){

    }

    public String getNotelpembeli() {
        return notelpembeli;
    }
    public int hitungTotalBayar(){

        return 0;
    }
}

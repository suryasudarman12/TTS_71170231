package com.rplbo.utsnota;

public class Item {

        private KertasHVS[] krshvs;
        private BukuTulis[] bktulis;
        private Pulpen[] pen;

        public Item(KertasHVS[] krshvs) {
            this.krshvs = krshvs;
        }

        public Item(BukuTulis[] bktulis) {
            this.bktulis = bktulis;
        }

        public Item(Pulpen[] pen) {
            this.pen = pen;
        }

        public Item(BukuTulis[] bktulis, Pulpen[] pen) {
            this.bktulis = bktulis;
            this.pen = pen;
        }

        public Item(KertasHVS[] krshvs, Pulpen[] pen) {
            this.krshvs = krshvs;
            this.pen = pen;
        }

        public Item(KertasHVS[] krshvs, BukuTulis[] bktulis) {
            this.krshvs = krshvs;
            this.bktulis = bktulis;
        }

        public Item(KertasHVS[] krshvs, BukuTulis[] bktulis, Pulpen[] pen) {
            this.krshvs = krshvs;
            this.bktulis = bktulis;
            this.pen = pen;
        }

        public int getJumlahBukuTulis() {

            return 0;
        }

        public int getJumlahPen() {

            return 0;
        }

        public Pulpen[] getPen() {
            return pen;
        }

        public void getJumlahKertasHVS() {

        }

        public BukuTulis[] getBktulis() {
            return bktulis;
        }

        public KertasHVS[] getKrshvs() {
            return krshvs;
        }


    }

package com.sitijuniyanti.uts_10116653.model;

/*
* Siti Juniyanti
* IF13
* UTS AKB
* 23 Mei 2019
*
*
* */
public class TemanModel {
    private String nim, nama, kelas, tlp, email, ig;

    public TemanModel(String nim, String nama, String kelas, String tlp, String email, String ig) {
       this.nim = nim;
       this.nama = nama;
       this.kelas = kelas;
       this.tlp = tlp;
       this.email = email;
       this.ig = ig;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIg() {
        return ig;
    }

    public void setIg(String ig) {
        this.ig = ig;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author - LENOVO -
 */
public class RuangKelas {
   private String namaruang;
   private String lokasiruang;
   private String namafakultas;
   private int panjang;
   private int lebar;
   private int jumlahkursi;
   private int jumlahjendela;
   private int jumlahpintu;
   private double luas;
   private double rasio;
   private int jumlahstopkontak;
   private int kondisistopkontak;
   private int posisistopkontak;
   private int jumlahLCD;
   private int kondisiLCD;
   private int posisiLCD;
   private int jumlahlampu;
   private int posisilampu;
   private int jumlahkipas;
   private int posisikipas;
   private int jumlahAC;
   private int posisiAC;
   private int SSID;
   private int bandwidth;
   private int jumlahCCTV;
   private int posisiCCTV;
   private int sirkulasiudara;
   private int pencahayaan;
   private int kelembapan;
   private int suhu;
    
    
    double hitungluas(){
        luas= this.panjang*this.lebar;
        return luas;
    }
    double hitungrasio(){
        rasio= luas/jumlahkursi;
        return rasio;
    }

    public String getNamaruang() {
        return namaruang;
    }

    public void setNamaruang(String namaruang) {
        this.namaruang = namaruang;
    }

    public String getLokasiruang() {
        return lokasiruang;
    }

    public void setLokasiruang(String lokasiruang) {
        this.lokasiruang = lokasiruang;
    }

    public String getNamafakultas() {
        return namafakultas;
    }

    public void setNamafakultas(String namafakultas) {
        this.namafakultas = namafakultas;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getJumlahkursi() {
        return jumlahkursi;
    }

    public void setJumlahkursi(int jumlahkursi) {
        this.jumlahkursi = jumlahkursi;
    }

    public int getJumlahjendela() {
        return jumlahjendela;
    }

    public void setJumlahjendela(int jumlahjendela) {
        this.jumlahjendela = jumlahjendela;
    }

    public int getJumlahpintu() {
        return jumlahpintu;
    }

    public void setJumlahpintu(int jumlahpintu) {
        this.jumlahpintu = jumlahpintu;
    }

    public int getJumlahstopkontak() {
        return jumlahstopkontak;
    }

    public void setJumlahstopkontak(int jumlahstopkontak) {
        this.jumlahstopkontak = jumlahstopkontak;
    }

    public int getKondisistopkontak() {
        return kondisistopkontak;
    }

    public void setKondisistopkontak(int kondisistopkontak) {
        this.kondisistopkontak = kondisistopkontak;
    }

    public int getPosisistopkontak() {
        return posisistopkontak;
    }

    public void setPosisistopkontak(int posisistopkontak) {
        this.posisistopkontak = posisistopkontak;
    }

    public int getJumlahLCD() {
        return jumlahLCD;
    }

    public void setJumlahLCD(int jumlahLCD) {
        this.jumlahLCD = jumlahLCD;
    }

    public int getKondisiLCD() {
        return kondisiLCD;
    }

    public void setKondisiLCD(int kondisiLCD) {
        this.kondisiLCD = kondisiLCD;
    }

    public int getPosisiLCD() {
        return posisiLCD;
    }

    public void setPosisiLCD(int posisiLCD) {
        this.posisiLCD = posisiLCD;
    }

    public int getJumlahlampu() {
        return jumlahlampu;
    }

    public void setJumlahlampu(int jumlahlampu) {
        this.jumlahlampu = jumlahlampu;
    }

    public int getPosisilampu() {
        return posisilampu;
    }

    public void setPosisilampu(int posisilampu) {
        this.posisilampu = posisilampu;
    }

    public int getJumlahkipas() {
        return jumlahkipas;
    }

    public void setJumlahkipas(int jumlahkipas) {
        this.jumlahkipas = jumlahkipas;
    }

    public int getPosisikipas() {
        return posisikipas;
    }

    public void setPosisikipas(int posisikipas) {
        this.posisikipas = posisikipas;
    }

    public int getJumlahAC() {
        return jumlahAC;
    }

    public void setJumlahAC(int jumlahAC) {
        this.jumlahAC = jumlahAC;
    }

    public int getPosisiAC() {
        return posisiAC;
    }

    public void setPosisiAC(int posisiAC) {
        this.posisiAC = posisiAC;
    }

    public int getSSID() {
        return SSID;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getJumlahCCTV() {
        return jumlahCCTV;
    }

    public void setJumlahCCTV(int jumlahCCTV) {
        this.jumlahCCTV = jumlahCCTV;
    }

    public int getPosisiCCTV() {
        return posisiCCTV;
    }

    public void setPosisiCCTV(int posisiCCTV) {
        this.posisiCCTV = posisiCCTV;
    }

    public int getSirkulasiudara() {
        return sirkulasiudara;
    }

    public void setSirkulasiudara(int sirkulasiudara) {
        this.sirkulasiudara = sirkulasiudara;
    }

    public int getPencahayaan() {
        return pencahayaan;
    }

    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
}

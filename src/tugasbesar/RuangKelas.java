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
    
    
}

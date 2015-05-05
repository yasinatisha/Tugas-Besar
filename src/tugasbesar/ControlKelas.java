package tugasbesar;

import java.util.Scanner;
public class ControlKelas extends RuangKelas {
   
     //method-method analisis
    double hitungluas(){
        luas= panjang*lebar;
        return luas;
    }
    
    double hitungrasio(){
        rasio= luas/jumlahkursi;
        return rasio;
    }
    
    double HitungBentukRuang(){
        if(panjang != luas){
            System.out.println("persegi panjang");
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double HitungBentukRuang=0;
        return HitungBentukRuang;
    }
    
    double HitungRasioLuas(){
        if (rasio>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double HitungRasioLuas = 0;
        return HitungRasioLuas;
    }
    
    double AnalisisPintudanJendela(){
        if(jumlahpintu>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if (jumlahjendela>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisPintudanJendela = 0;
        return AnalisisPintudanJendela;
    }
    
    double AnalisisKelistrikan(){
        if (jumlahstopkontak>=4){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if(kondisistopkontak==4){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if(posisistopkontak==1 && posisistopkontak==2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisKelistrikan=0;
        return AnalisisKelistrikan;
    }
    
    double AnalisisLCD(){
        if (jumlahLCD>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if(kondisiLCD==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if(posisiLCD==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisLCD=0;
        return AnalisisLCD;
    }
    
    double AnalisisLampu(){
        if (jumlahlampu>=8){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if(posisilampu==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisLampu=0;
        return AnalisisLampu;
    }
    
    double AnalisisKipas(){
        if (jumlahkipas>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if(posisikipas==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisKipas=0;
        return AnalisisKipas;
    }
    
    double analisisAC(){
        if (jumlahAC>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if(posisiAC==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double analisisAC=0;
        return analisisAC;
    }
    
    double AnalisisInternet(){
        if (SSID==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        if(bandwidth==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisInternet=0;
        return AnalisisInternet;
    }
        
    double AnalisisCCTV(){
        if (jumlahCCTV>=2){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }
            if(posisiCCTV==1 && posisiCCTV==2){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }
        double AnalisisCCTV=0;
        return AnalisisCCTV;
    }
        
    double AnalsisKebersihan(){
        int x=0;
        if (x==1){
            System.out.println("SESUAI");
        }
        if (x==2){
            System.out.println("TIDAK SESUAI");
        }
        double AnalsisKebersihan=0;
        return AnalsisKebersihan;
    }
        
    double AnalisisSirkulasiUdara(){
        if (sirkulasiudara==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisSirkulasiUdara=0;
        return AnalisisSirkulasiUdara;
    }
        
    double AnalisisPencahayaan(){
        if (pencahayaan>=250 && pencahayaan<=350){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisPencahayaan=0;
        return AnalisisPencahayaan;
    }
        
    double AnalisisKelembapan(){
        if (kelembapan>=70 && kelembapan<=80){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisKelembapan=0;
        return AnalisisKelembapan;
    }
        
    double AnalisisSuhu(){
        if (suhu>=25 && suhu<=35){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double AnalisisSuhu=0;
        return AnalisisSuhu;
    }
        
    double Kebisingan(){
        int s=0;
        if (s==1){
            System.out.println("TIDAK SESUAI");
        }
        if (s==2){
            System.out.println("SESUAI");
        }
        double Kebisingan=0;
        return Kebisingan;
    }
        
    double Bau(){
        int y=0;
        if (y==1){
            System.out.println("TIDAK SESUAI");
        }
        if (y==2){
            System.out.println("SESUAI");
        }
        double Bau=0;
        return Bau;
    }
        
    double Kebocoran(){
        int z=0;
        if (z==1){
            System.out.println("TIDAK SESUAI");
        }
        if (z==2){
            System.out.println("SESUAI");
        }
        double Kebocoran=0;
        return Kebocoran;
    }
        
    double Kerusakan(){
        int a=0;
        if (a==1){
            System.out.println("TIDAK SESUAI");
        }
        if (a==2){
            System.out.println("SESUAI");
        }
        double Kerusakan=0;
        return Kerusakan;
    }
        
    double Keausan(){
        int b=0;
        if (b==1){
            System.out.println("TIDAK SESUAI");
        }
        if (b==2){
            System.out.println("SESUAI");
        }
        double Keausan=0;
        return Keausan;
    }
        
    double Kekokohan(){
        int c=0;
        if (c==1){
            System.out.println("TIDAK SESUAI");
        }
        if (c==2){
            System.out.println("SESUAI");
        }
        double Kekokohan=0;
        return Kekokohan;
    }
        
    double KunciPintudanJendela(){
        int d=0;
        if (d==1){
        System.out.println("TIDAK SESUAI");
        }
        if (d==2){
            System.out.println("SESUAI");
        }
        double KunciPintudanJendela=0;
        return KunciPintudanJendela;
    }
        
    double KeamananRuang(){
        int e=0;
        if (e==1){
            System.out.println("TIDAK SESUAI");
        }
        if (e==2){
            System.out.println("SESUAI");
        }
        double KeamananRuang=0;
        return KeamananRuang;
    }
    
    double cetak(){
        int x;
        for(x=0; x<Gedung.length; x++){
            System.out.println("Nama ruang: " + Gedung[x].getNamaruang());
            System.out.println("Lokasi ruang: " + Gedung[x].getLokasiruang());
            System.out.println("Fakultas: " + Gedung[x].getNamafakultas());
            System.out.println("Luas= " + Gedung[x].luas);
            System.out.println("Rasio luas= " + Gedung[x].rasio);
        }
        double cetak=0;
        return cetak;
    }
}

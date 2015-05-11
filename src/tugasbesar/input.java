/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasbesar;

/**
 *
 * @author Owner
 */
import java.util.Scanner;
public class input extends RuangKelas{    

    public input(String namaruang, String lokasiruang, String namafakultas, double panjang, double lebar, double jumlahkursi, double jumlahjendela, double jumlahpintu, double luas, double rasio, int jumlahstopkontak, int kondisistopkontak, int posisistopkontak, int jumlahLCD, int kondisiLCD, int posisiLCD, int jumlahlampu, int posisilampu, int jumlahkipas, int posisikipas, int jumlahAC, int posisiAC, int SSID, int bandwidth, int jumlahCCTV, int posisiCCTV, int sirkulasiudara, int pencahayaan, int kelembapan, int suhu) {
        super(namaruang, lokasiruang, namafakultas, panjang, lebar, jumlahkursi, jumlahjendela, jumlahpintu, luas, rasio, jumlahstopkontak, kondisistopkontak, posisistopkontak, jumlahLCD, kondisiLCD, posisiLCD, jumlahlampu, posisilampu, jumlahkipas, posisikipas, jumlahAC, posisiAC, SSID, bandwidth, jumlahCCTV, posisiCCTV, sirkulasiudara, pencahayaan, kelembapan, suhu);
    }
   
    public void inputkelas(){
        //InputIndentitasRuangKelas 
           Scanner in= new Scanner (System.in);
           System.out.println("Nama Ruang: ");
           this.namaruang=in.next();
           System.out.println("Lokasi Ruangan: ");
           this.lokasiruang=in.next();
           System.out.println("Nama Fakultas: ");
           this.namafakultas=in.next();
           
           //InputKondisiRuangKelas
           System.out.println("Jumlah Panjang: ");
           this.panjang=in.nextInt();
           System.out.println("Jumlah Lebar: ");
           this.lebar=in.nextInt();
           System.out.println("Jumlah Pintu: ");
           this.jumlahpintu=in.nextInt();
           System.out.println("Jumlah Kursi: ");
           this.jumlahkursi=in.nextInt();
           System.out.println("Jumalah Jendela: ");
           this.jumlahjendela=in.nextInt();
           
           //InputjumlahKondisiPosisiSarana
            System.out.println("Masukkan jumlah stop kontak: ");
            this.jumlahstopkontak=in.nextInt();
            System.out.println("Masukkan kondisi stop kontak yang baik: ");
            this.kondisistopkontak=in.nextInt();
            System.out.println("Masukkan posisi stop kontak: ");
            System.out.println("1.Pojok ruangan");
            System.out.println("2.Dekat dosen");
            this.posisistopkontak=in.nextInt();
            System.out.println("Masukkan jumlah kabel LCD: ");
            this.jumlahLCD=in.nextInt();
            System.out.println("Masukkan kondisi kabel LCD: ");
            System.out.println("1.Berfungsi");
            System.out.println("2.Tidak berfungsi");
            this.kondisiLCD=in.nextInt();
            System.out.println("Masukkan posisi kabel LCD: ");
            System.out.println("1.Dekat dosen");
            System.out.println("2.Lain");
            this.posisiLCD=in.nextInt();
            System.out.println("Masukkan jumlah dan kondisi lampu: ");
            this.jumlahlampu=in.nextInt();
            System.out.println("Masukkan posisi lampu: ");
            System.out.println("1.Atap ruangan");
            System.out.println("2.Lain");
            this.posisilampu=in.nextInt();
            System.out.println("Masukkan jumlah dan kondisi kipas angin: ");
            this.jumlahkipas=in.nextInt();
            System.out.println("Masukkan posisi kipas angin: ");
            System.out.println("1.Atap ruangan");
            System.out.println("2.Lain");
            this.posisikipas=in.nextInt();
            System.out.println("Masukkan jumlah dan kondisi AC: ");
            this.jumlahAC=in.nextInt();
            System.out.println("Masukkan posisi AC: ");
            System.out.println("1.Belakang/Samping");
            System.out.println("2.Lain");
            this.posisiAC=in.nextInt();
            System.out.println("Pilih SSID: ");
            System.out.println("1.UMM hotspot");
            System.out.println("2.Lain");
            this.SSID=in.nextInt();
            System.out.println("Masukkan bandwidth: ");
            System.out.println("1.Bisa login");
            System.out.println("2.Tidak bisa login");
            this.bandwidth=in.nextInt();
            System.out.println("Masukkan jumlah dan kondisi CCTV: ");
            this.jumlahCCTV=in.nextInt();
            System.out.println("Masukkan posisi CCTV: ");
            System.out.println("1.Depan");
            System.out.println("2.Belakang");
            this.posisiCCTV=in.nextInt();
            
              
           // InputLingkunganKelas
             int x;
            System.out.println("Kondisi Lantai");
            System.out.println("Kondisi Pintu");
            System.out.println("Kondisi Jendela");
            System.out.println("Kondisi Atap");
            System.out.println("Kondisi Dinding");
            System.out.println("1.  bersih");
            System.out.println("2.  kotor ");
            System.out.println("Maukkan pilihan anda: ");
            x = in.nextInt();
        
            //InputKebersihanKelas
            System.out.println("Masukkan sirkulasi udara: ");
            System.out.println("1.Lancar");
            System.out.println("2.Tidak lancar");
            this.sirkulasiudara=in.nextInt();
            System.out.println("Masukkan nilai pencahayaan: ");
            this.pencahayaan=in.nextInt();
            System.out.println("Masukkan kelembapan(%): ");
            this.kelembapan=in.nextInt();
            System.out.println("Masukkan suhu(celcius): ");
            this.suhu=in.nextInt();
            
            //InputKenyamananKelas
           int s,y,z,a,b;
            System.out.println("Kebisingan");
            System.out.println("1.  bising");
            System.out.println("2.  tidak bising ");
            s = in.nextInt();
            System.out.println("Bau");
            System.out.println("1.  bau");
            System.out.println("2.  tidak bau ");
            y = in.nextInt();
            System.out.println("Kebocoran");
            System.out.println("1.  bocor");
            System.out.println("2.  tidak bocor ");
            z = in.nextInt();
            System.out.println("Kerusakan");
            System.out.println("1.  rusak");
            System.out.println("2.  tidak rusak ");
            a = in.nextInt();
            System.out.println("Keausan");
            System.out.println("1.  aus");
            System.out.println("2.  tidak aus "); 
            b = in.nextInt();

            //InputKeamananKelas
            int c,d,e;
            System.out.println("Kekokohan");
            System.out.println("1.  kokoh");
            System.out.println("2.  tidak kokoh ");
            c = in.nextInt();
            System.out.println("Kunci Pintu dan jendela");
            System.out.println("1.  ada");
            System.out.println("2.  tidak ada ");
            d = in.nextInt();
            System.out.println("Bahaya");
            System.out.println("1.  aman");
            System.out.println("2.  tidak aman ");
            e = in.nextInt(); 
    }
    
    
    
    @Override
    public void cetak() {
    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Nama ruang: " + getNamaruang());
            System.out.println("Lokasi ruang: " + getLokasiruang());
            System.out.println("Fakultas: " + getNamafakultas());
            System.out.println("Luas= " + luas);
            System.out.println("Rasio luas= " + rasio);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
    }
    
}

package tugasbesar;

mport java.util.Scanner;
public class ControlKelas {
     public static void main(String[] args){
        int x;
        RuangKelas[]Gedung;
        Gedung = new RuangKelas[3];
     }
public ControlKelas(){
    
}
  
    void InsertIndentitasRuangKelas(){
        int x;
        RuangKelas[]Gedung;
        Gedung = new RuangKelas[1];
           for(x=0; x<Gedung.length; x++){
           Gedung[x]= new RuangKelas();
           Scanner in= new Scanner (System.in);
           System.out.println("Nama Ruang: ");
           Gedung[x].setNamaruang(in.next());
           System.out.println("Lokasi Ruangan: ");
           Gedung[x].setLokasiruang(in.next());
           System.out.println("Nama Fakultas: ");
           Gedung[x].setNamafakultas(in.next());
         }
    }

    void KondisiRuangKelas(){
        int x;
        int panjang = 0;
        int luas = 0;
        int rasio = 0;
        int jumlahpintu = 0;
        int jumlahjendela = 0;
        RuangKelas[]Gedung;
        Gedung = new RuangKelas[1];
            for(x=0; x<Gedung.length; x++){
            Gedung[x]= new RuangKelas();
            Scanner in= new Scanner (System.in);
            System.out.println("Jumlah Panjang: ");
            Gedung[x].setPanjang(in.nextInt());
            System.out.println("Jumlah Lebar: ");
            Gedung[x].setLebar(in.nextInt());
            System.out.println("Jumlah Pintu: ");
            Gedung[x].setJumlahpintu(in.nextInt());
            System.out.println("Jumlah Kursi: ");
            Gedung[x].setJumlahkursi(in.nextInt());
            System.out.println("Jumalah Jendela: ");
            Gedung[x].setJumlahjendela(in.nextInt());
            }
            //hitung luas ruang dan hitung bentuk ruang
            if(panjang != luas){
                System.out.println("persegi panjang");
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }

            //hitung rasio luas
            if (rasio>=05){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }

            //analisis pintu dan jendela
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
        Gedung[x].hitungluas();
        Gedung[x].hitungrasio();
    }

    void JumlahKondisiPosisiSarana(){
        int x;
        int jumlahstopkontak = 0;
        int kondisistopkontak = 0;
        int posisistopkontak = 0;
        int jumlahsLCD = 0;
        int kondisiLCD = 0;
        int posisiLCD = 0;
        int jumlahlampu = 0;
        int posisilampu = 0;
        int jumlahkipas = 0;
        int posisikipas = 0;
        int jumlahAC = 0;
        int posisiAC = 0;
        int SSID = 0;
        int bandwidth = 0;
        int jumlahCCTV = 0;
        int posisiCCTV = 0;
        RuangKelas []Gedung;
        Gedung = new RuangKelas[1];
            for(x=0; x<Gedung.length; x++){
            Gedung[x]= new RuangKelas();
            Scanner in=new Scanner (System.in);
            System.out.println("Masukkan jumlah stop kontak: ");
            Gedung[x].setJumlahstopkontak(in.nextInt());
            System.out.println("Masukkan kondisi stop kontak yang baik: ");
            Gedung[x].setKondisistopkontak(in.nextInt());
            System.out.println("Masukkan posisi stop kontak: ");
            System.out.println("1.Pojok ruangan");
            System.out.println("2.Dekat dosen");
            Gedung[x].setPosisistopkontak(in.nextInt());
            System.out.println("Masukkan jumlah kabel LCD: ");
            Gedung[x].setJumlahLCD(in.nextInt());
            System.out.println("Masukkan kondisi kabel LCD: ");
            System.out.println("1.Berfungsi");
            System.out.println("2.Tidak berfungsi");
            Gedung[x].setKondisiLCD(in.nextInt());
            System.out.println("Masukkan posisi kabel LCD: ");
            System.out.println("1.Dekat dosen");
            System.out.println("2.Lain");
            Gedung[x].setPosisiLCD(in.nextInt());
            System.out.println("Masukkan jumlah dan kondisi lampu: ");
            Gedung[x].setJumlahlampu(in.nextInt());
            System.out.println("Masukkan posisi lampu: ");
            System.out.println("1.Atap ruangan");
            System.out.println("2.Lain");
            Gedung[x].setPosisilampu(in.nextInt());
            System.out.println("Masukkan jumlah dan kondisi kipas angin: ");
            Gedung[x].setJumlahkipas(in.nextInt());
            System.out.println("Masukkan posisi kipas angin: ");
            System.out.println("1.Atap ruangan");
            System.out.println("2.Lain");
            Gedung[x].setPosisikipas(in.nextInt());
            System.out.println("Masukkan jumlah dan kondisi AC: ");
            Gedung[x].setJumlahAC(in.nextInt());
            System.out.println("Masukkan posisi AC: ");
            System.out.println("1.Belakang/Samping");
            System.out.println("2.Lain");
            Gedung[x].setPosisiAC(in.nextInt());
            System.out.println("Pilih SSID: ");
            System.out.println("1.UMM hotspot");
            System.out.println("2.Lain");
            Gedung[x].setSSID(in.nextInt());
            System.out.println("Masukkan bandwidth: ");
            System.out.println("1.Bisa login");
            System.out.println("2.Tidak bisa login");
            Gedung[x].setBandwidth(in.nextInt());
            System.out.println("Masukkan jumlah dan kondisi CCTV: ");
            Gedung[x].setJumlahCCTV(in.nextInt());
            System.out.println("Masukkan posisi CCTV: ");
            System.out.println("1.Depan");
            System.out.println("2.Belakang");
            Gedung[x].setPosisiCCTV(in.nextInt());
            }

            //analisis kelistrikan
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

            //analisis LCD
             if (jumlahsLCD>=1){
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

            //analisis lampu
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

            //analisis kipas angin
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

            //analisis AC
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

            //analisis internet
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

            //analisis CCTV
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
    }

    void LingkunganKelas(){  
        int v;
        Scanner in= new Scanner (System.in);
        System.out.println("Kondisi Lantai");
        System.out.println("Kondisi Pintu");
        System.out.println("Kondisi Jendela");
        System.out.println("Kondisi Atap");
        System.out.println("Kondisi Dinding");
        System.out.println("1.  bersih");
        System.out.println("2.  kotor ");
        System.out.println("Maukkan pilihan anda: ");
        v = in.nextInt();

        //analsis kebersihan
        if (v==1){
            System.out.println("SESUAI");
        }
        if (v==2){
            System.out.println("TIDAK SESUAI");
        }

    }

    void KebersihanKelas(){
        int x;
        int sirkulasiudara = 0;
        int pencahayaan = 0;
        int kelembapan = 0;
        int suhu = 0;
        RuangKelas[]Gedung;
        Gedung = new RuangKelas[1];
            for(x=0; x<Gedung.length; x++){
            Scanner in=new Scanner (System.in);
            System.out.println("Masukkan sirkulasi udara: ");
            System.out.println("1.Lancar");
            System.out.println("2.Tidak lancar");
            Gedung[x].setSirkulasiudara(in.nextInt());
            System.out.println("Masukkan nilai pencahayaan: ");
            Gedung[x].setPencahayaan(in.nextInt());
            System.out.println("Masukkan kelembapan(%): ");
            Gedung[x].setKelembapan(in.nextInt());
            System.out.println("Masukkan suhu(celcius): ");
            Gedung[x].setSuhu(in.nextInt());
            }

            //analisis sirkulasi udara
            if (sirkulasiudara==1){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }

            //analisis pencahayaan
            if (pencahayaan>=250 && pencahayaan<=350){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }

            //analisis kelembapan
            if (kelembapan>=70 && kelembapan<=80){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }

            //analisis suhu
            if (suhu>=25 && suhu<=35){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }

    }
   
    void KenyamananKelas(){
        int x,y,z,a,b;
        Scanner in= new Scanner (System.in);
        System.out.println("Kebisingan");
        System.out.println("1.  bising");
        System.out.println("2.  tidak bising ");
        x = in.nextInt();
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

        ////analisis kebisingan, bau, kebocoran, kerusakan, keausan
        if (x==1 && y==1 && z==1 && a==1 && b==1){
            System.out.println("TIDAK SESUAI");
        }
        if (x==2 && y==2 && z==2 && a==2 && b==2){
            System.out.println("SESUAI");
        }
    }
  
  
    void KeamananKelas(){
        int c,d,e;
        Scanner in= new Scanner (System.in);
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

        //analisis kekokohan, kunci pintu dan jendela, bahaya
        if (c==1 && d==1 && e==1 ){
            System.out.println("SESUAI");
        }
        if (c==2 && d==2 && e==2){
            System.out.println("TIDAK SESUAI");
        }

    }
}
    /*void CetakData(){
        int x;
        RuangKelas[]Gedung;
        Gedung = new RuangKelas[1];
        for(x=0; x<Gedung.length; x++){
            System.out.println("======================================");
            System.out.println("IDENTITAS RUANG KELAS");
            System.out.println("Nama ruang: " + Gedung[x].getNamaruang());
            System.out.println("Lokasi ruang: " + Gedung[x].getLokasiruang());
            System.out.println("Nama fakultas: " + Gedung[x].getNamafakultas());
            System.out.println("======================================");
             
            System.out.println("KONDISI RUANG KELAS");
            System.out.println("Panjang: " + Gedung[x].getPanjang());
            System.out.println("Lebar: " + Gedung[x].getLebar());
            System.out.println("Jumlah pintu: " + Gedung[x].getJumlahpintu());
            System.out.println("Jumlah kursi: " + Gedung[x].getJumlahkursi());
            System.out.println("Jumlah jendela: " + Gedung[x].getJumlahjendela());
            System.out.println("Luas ruang kelas: " + Gedung[x].hitungluas());
            System.out.println("Bentuk ruang kelas: ");
            System.out.println("Rasio luas ruang kelas: " + Gedung[x].hitungrasio());
            System.out.println("Analisis pintu dan jendela: ");
            System.out.println("======================================");
            
            System.out.println("JUMLAH, KONDISI DAN POSISI SARANA RUANG KELAS");
            System.out.println("Jumlah stop kontak" + Gedung[x].getJumlahstopkontak());
            System.out.println("Kondisi stop kontak" + Gedung[x].getKondisistopkontak());
            System.out.println("Posisi stop kontak" + Gedung[x].getPosisistopkontak());
            System.out.println("Jumlah kabel LCD: " + Gedung[x].getJumlahLCD());
            System.out.println("Kondisi kabel LCD: " + Gedung[x].getKondisiLCD());
            System.out.println("Posisi kabel LCD: " + Gedung[x].getPosisiLCD());
            System.out.println("Jumlah dan kondisi lampu: " + Gedung[x].getJumlahlampu());
            System.out.println("Posisi lampu: " + Gedung[x].getPosisilampu());
            System.out.println("Jumlah dan kondisi kipas angin: " + Gedung[x].getJumlahkipas());
            System.out.println("Posisi kipas angin: " + Gedung[x].getPosisikipas());
            System.out.println("Jumlah dan kondisi AC: " + Gedung[x].getJumlahAC());
            System.out.println("Posisi AC: " + Gedung[x].getPosisiAC());
            System.out.println("SSID: " + Gedung[x].getSSID());
            System.out.println("Bandwidth: " + Gedung[x].getBandwidth());
            System.out.println("Jumlah dan kondisi CCTV: " + Gedung[x].getJumlahCCTV());
            System.out.println("Posisi CCTV: " + Gedung[x].getPosisiCCTV());
            System.out.println("======================================");
        }
    }*/

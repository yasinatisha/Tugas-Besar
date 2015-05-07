package tugasbesar;

public abstract class RuangKelas {
   String namaruang;
   String lokasiruang;
   String namafakultas;
   double panjang;
   double lebar;
   double jumlahkursi;
   double jumlahjendela;
   double jumlahpintu;
   double luas;
   double rasio;
   int jumlahstopkontak;
   int kondisistopkontak;
   int posisistopkontak;
   int jumlahLCD;
   int kondisiLCD;
   int posisiLCD;
   int jumlahlampu;
   int posisilampu;
   int jumlahkipas;
   int posisikipas;
   int jumlahAC;
   int posisiAC;
   int SSID;
   int bandwidth;
   int jumlahCCTV;
   int posisiCCTV;
   int sirkulasiudara;
   int pencahayaan;
   int kelembapan;
   int suhu;
   
   public RuangKelas (String namaruang,String lokasiruang,String namafakultas,
           double panjang,double lebar,double jumlahkursi,double jumlahjendela,
           double jumlahpintu,double luas,double rasio,int jumlahstopkontak,
           int kondisistopkontak,int posisistopkontak,int jumlahLCD,int kondisiLCD,
           int posisiLCD,int jumlahlampu,int posisilampu,int jumlahkipas,
           int posisikipas,int jumlahAC,int posisiAC,int SSID,int bandwidth,
           int jumlahCCTV,int posisiCCTV,int sirkulasiudara,int pencahayaan,
           int kelembapan,int suhu){
       this.namaruang = namaruang;
       this.lokasiruang = lokasiruang;
       this.namafakultas = namafakultas;
       this.panjang = panjang;
       this.lebar = lebar;
       this.jumlahkursi = jumlahkursi;
       this.jumlahjendela = jumlahjendela;
       this.jumlahpintu = jumlahpintu;
       this.luas = luas;
       this.rasio = rasio;
       this.jumlahstopkontak = jumlahstopkontak;
       this.kondisistopkontak = kondisistopkontak;
       this.posisistopkontak = posisistopkontak;
       this.jumlahLCD = jumlahLCD;
       this.kondisiLCD = kondisiLCD;
       this.posisiLCD = posisiLCD;
       this.jumlahlampu = jumlahlampu;
       this.posisilampu = posisilampu ;
       this.jumlahkipas = jumlahkipas;
       this.posisikipas = posisikipas;
       this.jumlahAC = jumlahAC;
       this.posisiAC = posisiAC;
       this.SSID = SSID;
       this.bandwidth = bandwidth;
       this.jumlahCCTV = jumlahCCTV;
       this.posisiCCTV = posisiCCTV;
       this.sirkulasiudara = sirkulasiudara;
       this.pencahayaan = pencahayaan;
       this.kelembapan = kelembapan;
       this.suhu = suhu;
   }

    public String getNamaruang() {
        return namaruang;
    }

    public String getLokasiruang() {
        return lokasiruang;
    }

    public String getNamafakultas() {
        return namafakultas;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getJumlahkursi() {
        return jumlahkursi;
    }

    public double getJumlahjendela() {
        return jumlahjendela;
    }

    public double getJumlahpintu() {
        return jumlahpintu;
    }

    public double getLuas() {
        return luas;
    }

    public double getRasio() {
        return rasio;
    }

    public int getJumlahstopkontak() {
        return jumlahstopkontak;
    }

    public int getKondisistopkontak() {
        return kondisistopkontak;
    }

    public int getPosisistopkontak() {
        return posisistopkontak;
    }

    public int getJumlahLCD() {
        return jumlahLCD;
    }

    public int getKondisiLCD() {
        return kondisiLCD;
    }

    public int getPosisiLCD() {
        return posisiLCD;
    }

    public int getJumlahlampu() {
        return jumlahlampu;
    }

    public int getPosisilampu() {
        return posisilampu;
    }

    public int getJumlahkipas() {
        return jumlahkipas;
    }

    public int getPosisikipas() {
        return posisikipas;
    }

    public int getJumlahAC() {
        return jumlahAC;
    }

    public int getPosisiAC() {
        return posisiAC;
    }

    public int getSSID() {
        return SSID;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public int getJumlahCCTV() {
        return jumlahCCTV;
    }

    public int getPosisiCCTV() {
        return posisiCCTV;
    }

    public int getSirkulasiudara() {
        return sirkulasiudara;
    }

    public int getPencahayaan() {
        return pencahayaan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }
    
    public abstract void cetak() ;
}

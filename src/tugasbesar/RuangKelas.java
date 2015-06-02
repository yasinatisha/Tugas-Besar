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

    public void setNamaruang(String namaruang) {
        this.namaruang = namaruang;
    }

    public void setLokasiruang(String lokasiruang) {
        this.lokasiruang = lokasiruang;
    }

    public void setNamafakultas(String namafakultas) {
        this.namafakultas = namafakultas;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setJumlahkursi(double jumlahkursi) {
        this.jumlahkursi = jumlahkursi;
    }

    public void setJumlahjendela(double jumlahjendela) {
        this.jumlahjendela = jumlahjendela;
    }

    public void setJumlahpintu(double jumlahpintu) {
        this.jumlahpintu = jumlahpintu;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public void setRasio(double rasio) {
        this.rasio = rasio;
    }

    public void setJumlahstopkontak(int jumlahstopkontak) {
        this.jumlahstopkontak = jumlahstopkontak;
    }

    public void setKondisistopkontak(int kondisistopkontak) {
        this.kondisistopkontak = kondisistopkontak;
    }

    public void setPosisistopkontak(int posisistopkontak) {
        this.posisistopkontak = posisistopkontak;
    }

    public void setJumlahLCD(int jumlahLCD) {
        this.jumlahLCD = jumlahLCD;
    }

    public void setKondisiLCD(int kondisiLCD) {
        this.kondisiLCD = kondisiLCD;
    }

    public void setPosisiLCD(int posisiLCD) {
        this.posisiLCD = posisiLCD;
    }

    public void setJumlahlampu(int jumlahlampu) {
        this.jumlahlampu = jumlahlampu;
    }

    public void setPosisilampu(int posisilampu) {
        this.posisilampu = posisilampu;
    }

    public void setJumlahkipas(int jumlahkipas) {
        this.jumlahkipas = jumlahkipas;
    }

    public void setPosisikipas(int posisikipas) {
        this.posisikipas = posisikipas;
    }

    public void setJumlahAC(int jumlahAC) {
        this.jumlahAC = jumlahAC;
    }

    public void setPosisiAC(int posisiAC) {
        this.posisiAC = posisiAC;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public void setJumlahCCTV(int jumlahCCTV) {
        this.jumlahCCTV = jumlahCCTV;
    }

    public void setPosisiCCTV(int posisiCCTV) {
        this.posisiCCTV = posisiCCTV;
    }

    public void setSirkulasiudara(int sirkulasiudara) {
        this.sirkulasiudara = sirkulasiudara;
    }

    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    
    public abstract void cetak() ;
}

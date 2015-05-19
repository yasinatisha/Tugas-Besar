package tugasbesar;

abstract public class ControlKelas extends RuangKelas implements Kelas {

    public ControlKelas(String namaruang, String lokasiruang, String namafakultas, double panjang, double lebar, double jumlahkursi, double jumlahjendela, double jumlahpintu, double luas, double rasio, int jumlahstopkontak, int kondisistopkontak, int posisistopkontak, int jumlahLCD, int kondisiLCD, int posisiLCD, int jumlahlampu, int posisilampu, int jumlahkipas, int posisikipas, int jumlahAC, int posisiAC, int SSID, int bandwidth, int jumlahCCTV, int posisiCCTV, int sirkulasiudara, int pencahayaan, int kelembapan, int suhu) {
        super(namaruang, lokasiruang, namafakultas, panjang, lebar, jumlahkursi, jumlahjendela, jumlahpintu, luas, rasio, jumlahstopkontak, kondisistopkontak, posisistopkontak, jumlahLCD, kondisiLCD, posisiLCD, jumlahlampu, posisilampu, jumlahkipas, posisikipas, jumlahAC, posisiAC, SSID, bandwidth, jumlahCCTV, posisiCCTV, sirkulasiudara, pencahayaan, kelembapan, suhu);
    }
   
        input i = new input();
    i.inputkelas;
    Ruangkelas k = new RuangKelas();
    k = i.getRuangKelas();
    
    
     //method-method analisis
    double hitungluas(){
        this.luas= panjang*lebar;
        return luas;
    }
    
    double hitungrasio(){
        this.rasio= luas/jumlahkursi;
        return rasio;
    }
    
    double HitungBentukRuang(double HitungBentukRuang){
        if(this.getPanjang() != this.getLuas()){
            System.out.println("persegi panjang");
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return HitungBentukRuang;
    }
    
    double HitungRasioLuas(double HitungRasioLuas){
        if (this.getRasio()>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return HitungRasioLuas;
    }
    
    double AnalisisPintu(double AnalisisPintu){
        if(this.getJumlahpintu()>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisPintu;
    }
    
        double AnalisisJendela(double AnalisisPintudanJendela){
        if (this.getJumlahjendela()>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisPintudanJendela;
    }
 
        double KondisiStopkontak(double KondisiStopkontak){
        if(this.getKondisistopkontak()==4){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return KondisiStopkontak;
    }
    
        double PosisiStopkontak(double PosisiStopkontak){
        if(this.getKondisistopkontak()==1 && this.getPosisistopkontak()==2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiStopkontak;
    }
    
    double KondisiLCD(double KondisiLCD){
        if(this.getKondisiLCD()==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return KondisiLCD;
    }
    
    double PosisiLCD(double PosisiLCD){
        if(this.getPosisiLCD()==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiLCD;
    }
    
    double PosisiLampu(double PosisiLampu){
        if(this.getPosisilampu()==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiLampu;
    }
    
    double PosisiKipas(double PosisiKipas){
        if(this.getPosisikipas()==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiKipas;
    }
    
        double PosisiAC(double PosisiAC){
        if(this.getPosisiAC()==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiAC;
    }
    
    double InternetSSID(double InternetSSID){
        if (this.getSSID()==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return InternetSSID;
    }
    double InternetBandwidth(double InternetBandwidth){
        if(this.getBandwidth()==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return InternetBandwidth;
    }
        
    double PosisiCCTV(double PosisiCCTV){
            if(this.getPosisiCCTV()==1 && this.getPosisiCCTV()==2){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }
        return PosisiCCTV;
    }
        
    double AnalisisKebersihan(double AnalisisKebersihan){
        int x=0;
        if (x==1){
            System.out.println("SESUAI");
        }
        if (x==2){
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisKebersihan;
    }
        
    double AnalisisSirkulasiUdara(double AnalisisSirkulasiUdara){
        if (this.getSirkulasiudara()==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisSirkulasiUdara;
    }
        
    double AnalisisPencahayaan(double AnalisisPencahayaan){
        if (this.getPencahayaan()>=250 && this.getPencahayaan()<=350){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisPencahayaan;
    }
        
    double AnalisisKelembapan(double AnalisisKelembapan){
        if (this.getKelembapan()>=70 && this.getKelembapan()<=80){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisKelembapan;
    }
        
    double AnalisisSuhu(double AnalisisSuhu){
        if (this.getSuhu()>=25 && this.getSuhu()<=35){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisSuhu;
    }
        
    double Kebisingan(double Kebisingan){
        int s=0;
        if (s==1){
            System.out.println("TIDAK SESUAI");
        }
        if (s==2){
            System.out.println("SESUAI");
        }
        return Kebisingan;
    }
        
    double Bau(double Bau){
        int y=0;
        if (y==1){
            System.out.println("TIDAK SESUAI");
        }
        if (y==2){
            System.out.println("SESUAI");
        }
        return Bau;
    }
        
    double Kebocoran(double Kebocoran){
        int z=0;
        if (z==1){
            System.out.println("TIDAK SESUAI");
        }
        if (z==2){
            System.out.println("SESUAI");
        }
        return Kebocoran;
    }
        
    double Kerusakan(double Kerusakan){
        int a=0;
        if (a==1){
            System.out.println("TIDAK SESUAI");
        }
        if (a==2){
            System.out.println("SESUAI");
        }
        return Kerusakan;
    }
        
    double Keausan(double Keausan){
        int b=0;
        if (b==1){
            System.out.println("TIDAK SESUAI");
        }
        if (b==2){
            System.out.println("SESUAI");
        }
        return Keausan;
    }
        
    double Kekokohan(double Kekokohan){
        int c=0;
        if (c==1){
            System.out.println("TIDAK SESUAI");
        }
        if (c==2){
            System.out.println("SESUAI");
        }
        return Kekokohan;
    }
        
    double KunciPintudanJendela(double KunciPintudanJendela){
        int d=0;
        if (d==1){
        System.out.println("TIDAK SESUAI");
        }
        if (d==2){
            System.out.println("SESUAI");
        }
        return KunciPintudanJendela;
    }
        
    double KeamananRuang(double KeamananRuang){
        int e=0;
        if (e==1){
            System.out.println("TIDAK SESUAI");
        }
        if (e==2){
            System.out.println("SESUAI");
        }
        return KeamananRuang;
    }

    @Override
    public int Jumlahstopkontak(int Jumlahstopkontak) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //this.jumlahstopkontak = jumlahstopkontak;
        if (this.getJumlahstopkontak()>=4){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return Jumlahstopkontak;
    }

    @Override
    public int JumlahLCD(int JumlahLCD) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if (this.getJumlahLCD()>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return JumlahLCD;
    }

    @Override
    public int Jumlahlampu(int Jumlahlampu) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if (this.getJumlahlampu()>=8){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return Jumlahlampu;
    }

    @Override
    public int Jumlahkipas(int Jumlahkipas) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     if (this.getJumlahkipas()>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return Jumlahkipas;
    }

    @Override
    public int JumlahAC(int JumlahAC) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if (this.getJumlahAC()>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return JumlahAC;
    }

    @Override
    public int JumlahCCTV(int JumlahCCTV) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if (this.getJumlahCCTV()>=2){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }
        return JumlahCCTV;
    }
}

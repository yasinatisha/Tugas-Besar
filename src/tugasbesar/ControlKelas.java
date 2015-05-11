package tugasbesar;

public abstract class ControlKelas extends RuangKelas {

    public ControlKelas(String namaruang, String lokasiruang, String namafakultas, double panjang, double lebar, double jumlahkursi, double jumlahjendela, double jumlahpintu, double luas, double rasio, int jumlahstopkontak, int kondisistopkontak, int posisistopkontak, int jumlahLCD, int kondisiLCD, int posisiLCD, int jumlahlampu, int posisilampu, int jumlahkipas, int posisikipas, int jumlahAC, int posisiAC, int SSID, int bandwidth, int jumlahCCTV, int posisiCCTV, int sirkulasiudara, int pencahayaan, int kelembapan, int suhu) {
        super(namaruang, lokasiruang, namafakultas, panjang, lebar, jumlahkursi, jumlahjendela, jumlahpintu, luas, rasio, jumlahstopkontak, kondisistopkontak, posisistopkontak, jumlahLCD, kondisiLCD, posisiLCD, jumlahlampu, posisilampu, jumlahkipas, posisikipas, jumlahAC, posisiAC, SSID, bandwidth, jumlahCCTV, posisiCCTV, sirkulasiudara, pencahayaan, kelembapan, suhu);
    }
   
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
        if(panjang != luas){
            System.out.println("persegi panjang");
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return HitungBentukRuang;
    }
    
    double HitungRasioLuas(double HitungRasioLuas){
        if (rasio>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return HitungRasioLuas;
    }
    
    double AnalisisPintu(double AnalisisPintu){
        if(jumlahpintu>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisPintu;
    }
    
        double AnalisisJendela(double AnalisisPintudanJendela){
        if (jumlahjendela>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisPintudanJendela;
    }
 
    
    double JumlahStopkontak(double JumlahStopkontak){
        if (jumlahstopkontak>=4){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return JumlahStopkontak;
    }
        
        double KondisiStopkontak(double KondisiStopkontak){
        if(kondisistopkontak==4){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return KondisiStopkontak;
    }
    
        double PosisiStopkontak(double PosisiStopkontak){
        if(posisistopkontak==1 && posisistopkontak==2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiStopkontak;
    }
    
    double JumlahLCD(double JumlahLCD){
        if (jumlahLCD>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return JumlahLCD;
    }
    
    double KondisiLCD(double KondisiLCD){
        if(kondisiLCD==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return KondisiLCD;
    }
    
    double PosisiLCD(double PosisiLCD){
        if(posisiLCD==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiLCD;
    }
    
    double JumlahLampu(double JumlahLampu){
        if (jumlahlampu>=8){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return JumlahLampu;
    }
    
    double PosisiLampu(double PosisiLampu){
        if(posisilampu==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiLampu;
    }
    
    double JumlahKipas(double JumlahKipas){
        if (jumlahkipas>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return JumlahKipas;
    }
    
    double PosisiKipas(double PosisiKipas){
        if(posisikipas==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiKipas;
    }
    
    double JumlahAC(double JumlahAC){
        if (jumlahAC>=1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return JumlahAC;
    }
    
        double PosisiAC(double PosisiAC){
        if(posisiAC==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return PosisiAC;
    }
    
    double InternetSSID(double InternetSSID){
        if (SSID==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return InternetSSID;
    }
    double InternetBandwidth(double InternetBandwidth){
        if(bandwidth==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return InternetBandwidth;
    }
        
    double JumlahCCTV(double JumlahCCTV){
        if (jumlahCCTV>=2){
                System.out.println("SESUAI");
            }else{
                System.out.println("TIDAK SESUAI");
            }
        return JumlahCCTV;
    }
    
    double PosisiCCTV(double PosisiCCTV){
            if(posisiCCTV==1 && posisiCCTV==2){
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
        if (sirkulasiudara==1){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisSirkulasiUdara;
    }
        
    double AnalisisPencahayaan(double AnalisisPencahayaan){
        if (pencahayaan>=250 && pencahayaan<=350){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisPencahayaan;
    }
        
    double AnalisisKelembapan(double AnalisisKelembapan){
        if (kelembapan>=70 && kelembapan<=80){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return AnalisisKelembapan;
    }
        
    double AnalisisSuhu(double AnalisisSuhu){
        if (suhu>=25 && suhu<=35){
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
}
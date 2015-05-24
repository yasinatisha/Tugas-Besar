
package tugasbesar;

 abstract public class TestRuangKelas extends ControlKelas {
     
//     public static void main(String[] args) {
//         TestRuangKelas main = new TestRuangKelas(null, null, null, panjang, lebar, jumlahkursi, jumlahjendela, jumlahpintu, luas, rasio, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak, jumlahstopkontak) {
//         }
//     }
     
    public void utama(double HitungBentukRuang, double HitungRasioLuas, double JumlahStopkontak, double KondisiStopkontak, double PosisiStopkontak, int JumlahAC, double PosisiAC, int JumlahLCD, double KondisiLCD, double PosisiLCD, int Jumlahkipas, double PosisiKipas, int Jumlahlampu, double PosisiLampu, int JumlahCCTV, double PosisiCCTV, double InternetSSID, double InternetBandwidth, int Jumlahstopkontak) {
        //controlKelas adm = new ControlKelas();
        luas = super.hitungluas();
        rasio= super.hitungrasio();
        super.HitungBentukRuang(HitungBentukRuang);
        super.HitungRasioLuas(HitungRasioLuas);
        super.Jumlahstopkontak(Jumlahstopkontak);
        super.KondisiStopkontak(KondisiStopkontak);
        super.PosisiStopkontak(PosisiStopkontak);
        super.JumlahAC(JumlahAC);
        super.PosisiAC(PosisiAC);
        super.JumlahLCD(JumlahLCD);
        super.KondisiLCD(KondisiLCD);
        super.PosisiLCD(PosisiLCD);
        super.Jumlahkipas(Jumlahkipas);
        super.PosisiKipas(PosisiKipas);
        super.Jumlahlampu(Jumlahlampu);
        super.PosisiLampu(PosisiLampu);
        super.JumlahCCTV(JumlahCCTV);
        super.PosisiCCTV(PosisiCCTV);
        super.InternetSSID(InternetSSID);
        super.InternetBandwidth(InternetBandwidth);
        super.AnalisisKebersihan(HitungBentukRuang);
        super.AnalisisSirkulasiUdara(HitungBentukRuang);
        super.AnalisisPencahayaan(HitungBentukRuang);
        super.AnalisisKelembapan(HitungBentukRuang);
        super.AnalisisSuhu(HitungBentukRuang);
        super.Kebisingan(HitungBentukRuang);
        super.Bau(HitungBentukRuang);
        super.Kebocoran(HitungBentukRuang);
        super.Kerusakan(HitungBentukRuang);
        super.Keausan(HitungBentukRuang);
        super.Kekokohan(HitungBentukRuang);
        super.KunciPintudanJendela(HitungBentukRuang);
        super.KeamananRuang(HitungBentukRuang);
    }

    public TestRuangKelas(String namaruang, String lokasiruang, String namafakultas, double panjang, double lebar, double jumlahkursi, double jumlahjendela, double jumlahpintu, double luas, double rasio, int jumlahstopkontak, int kondisistopkontak, int posisistopkontak, int jumlahLCD, int kondisiLCD, int posisiLCD, int jumlahlampu, int posisilampu, int jumlahkipas, int posisikipas, int jumlahAC, int posisiAC, int SSID, int bandwidth, int jumlahCCTV, int posisiCCTV, int sirkulasiudara, int pencahayaan, int kelembapan, int suhu) {
        super(namaruang, lokasiruang, namafakultas, panjang, lebar, jumlahkursi, jumlahjendela, jumlahpintu, luas, rasio, jumlahstopkontak, kondisistopkontak, posisistopkontak, jumlahLCD, kondisiLCD, posisiLCD, jumlahlampu, posisilampu, jumlahkipas, posisikipas, jumlahAC, posisiAC, SSID, bandwidth, jumlahCCTV, posisiCCTV, sirkulasiudara, pencahayaan, kelembapan, suhu);
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

   

//    private static class ControlKelasImpl extends ControlKelas {
//
//        public ControlKelasImpl() {
//            super();
//        }
    }

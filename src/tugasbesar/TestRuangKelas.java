
package tugasbesar;

 abstract public class TestRuangKelas extends ControlKelas {
    public static void main(String[] args, double HitungBentukRuang, double HitungRasioLuas, double JumlahStopkontak, double KondisiStopkontak, double PosisiStopkontak, int JumlahAC, double PosisiAC, int JumlahLCD, double KondisiLCD, double PosisiLCD, int Jumlahkipas, double PosisiKipas, int Jumlahlampu, double PosisiLampu, int JumlahCCTV, double PosisiCCTV, double InternetSSID, double InternetBandwidth, int Jumlahstopkontak) {
        ControlKelas adm = new ControlKelas() {};
        adm.hitungluas();
        adm.hitungrasio();
        adm.HitungBentukRuang(HitungBentukRuang);
        adm.HitungRasioLuas(HitungRasioLuas);
        adm.Jumlahstopkontak(Jumlahstopkontak);
        adm.KondisiStopkontak(KondisiStopkontak);
        adm.PosisiStopkontak(PosisiStopkontak);
        adm.JumlahAC(JumlahAC);
        adm.PosisiAC(PosisiAC);
        adm.JumlahLCD(JumlahLCD);
        adm.KondisiLCD(KondisiLCD);
        adm.PosisiLCD(PosisiLCD);
        adm.Jumlahkipas(Jumlahkipas);
        adm.PosisiKipas(PosisiKipas);
        adm.Jumlahlampu(Jumlahlampu);
        adm.PosisiLampu(PosisiLampu);
        adm.JumlahCCTV(JumlahCCTV);
        adm.PosisiCCTV(PosisiCCTV);
        adm.InternetSSID(InternetSSID);
        adm.InternetBandwidth(InternetBandwidth);
        adm.AnalisisKebersihan(HitungBentukRuang);
        adm.AnalisisSirkulasiUdara(HitungBentukRuang);
        adm.AnalisisPencahayaan(HitungBentukRuang);
        adm.AnalisisKelembapan(HitungBentukRuang);
        adm.AnalisisSuhu(HitungBentukRuang);
        adm.Kebisingan(HitungBentukRuang);
        adm.Bau(HitungBentukRuang);
        adm.Kebocoran(HitungBentukRuang);
        adm.Kerusakan(HitungBentukRuang);
        adm.Keausan(HitungBentukRuang);
        adm.Kekokohan(HitungBentukRuang);
        adm.KunciPintudanJendela(HitungBentukRuang);
        adm.KeamananRuang(HitungBentukRuang);
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



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
public class TestRuangKelas {
    public static void main(String[] args, double HitungBentukRuang, double HitungRasioLuas, double JumlahStopkontak, double KondisiStopkontak, double PosisiStopkontak, double JumlahAC, double PosisiAC, double JumlahLCD, double KondisiLCD, double PosisiLCD, double JumlahKipas, double PosisiKipas, double JumlahLampu, double PosisiLampu, double JumlahCCTV, double PosisiCCTV, double InternetSSID, double InternetBandwidth) {
        ControlKelas adm = new ControlKelas() {};
        adm.cetak();
        adm.hitungluas();
        adm.hitungrasio();
        adm.HitungBentukRuang(HitungBentukRuang);
        adm.HitungRasioLuas(HitungRasioLuas);
        adm.JumlahStopkontak(JumlahStopkontak);
        adm.KondisiStopkontak(KondisiStopkontak);
        adm.PosisiStopkontak(PosisiStopkontak);
        adm.JumlahAC(JumlahAC);
        adm.PosisiAC(PosisiAC);
        adm.JumlahLCD(JumlahLCD);
        adm.KondisiLCD(KondisiLCD);
        adm.PosisiLCD(PosisiLCD);
        adm.JumlahKipas(JumlahKipas);
        adm.PosisiKipas(PosisiKipas);
        adm.JumlahLampu(JumlahLampu);
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
}
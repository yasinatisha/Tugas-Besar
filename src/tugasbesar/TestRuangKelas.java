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
    public static void main(String[] args) {
        ControlKelas adm = new ControlKelas();
        adm.cetak();
        adm.hitungluas();
        adm.hitungrasio();
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

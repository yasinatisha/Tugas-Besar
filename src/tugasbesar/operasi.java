/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasbesar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class operasi {
    private Connection connection;
	private final String insertindentitasruangkelas = "INSERT INTO ruangkelas ( namaruang,lokasiruang,namafakultas,panjang,lebar,jumlahkursi,jumlahjendela,"
                + "jumlahpintu,luas,rasio,jumlahstopkontak,kondisistopkontak,posisistopkontak,jumlahLCD,kondisiLCD,posisiLCD,jumlahlampu,posisilampu,"
                + "jumlahkipas,posisikipas,jumlahAC,posisiAC,SSID,bandwidth,jumlahCCTV,posisiCCTV,sirkulasiudara,pencahayaan,kelembapan,suhu) VALUES (txnamaruang,txlokasiruang,txnamafakultas,"
                + "txpanjang,txlebar,txjumlahkursi,txjumlahjendela,txjumlahpintu,txjumlahstopkontak,txkondisistopkontak,lblposisistopkontak,"
                + "txjumlahLCD,lblkondisiLCD,lblposisiLCD,txjumlahlampu,lblposisilampu,txjumlahkipas,lblposisikipas,txjumlahAC,lblposisiAC,lblSSID,"
                + "lblbandhwith,txjumlahCCTV,lblposisiCCTV,lblsirkulasiudara,lblpencahayaan,lblkelembapan,lblsuhu,lblx,lbls,lbly,lblz,lbla,lblb,lblc,lbld,lble)";
	private final String selectindentitasruangkelas = "SELECT namaruang,lokasiruang FROM Indentitasruangkelas WHERE identitasruangkelas LIKE namafakultas";
	private final String deleteindentitasruangkelas = "DELETE namaruang,lokasiruang FROM Indentitasruangkelas WHERE identitasruangkelas LIKE namafakultas";


//	private final String insertkondisiruangkelas = "INSERT INTO kondisiruangkelas (jumlahpanjang,jumlahlebar,jumlahpintu,jumlahkursi,jumlahjendela) VALUES (jumlahpanjang,jumlahlebar,jumlahpintu,jumlahkursi,jumlahjendela)";
//	private final String selectkondisiruangkelas = "SELECT jumlahpanjang,jumlahlebar,jumlahpintu,jumlahkursi FROM kondisiruangkelas WHERE kondisiruangkelas LIKE jumlahjendela";
//	private final String deletekondisiruangkelas = "DELETE SELECT jumlahpanjang,jumlahlebar,jumlahpintu,jumlahkursi FROM kondisiruangkelas WHERE kondisiruangkelas LIKE jumlahjendela";
//
//
//	private final String insertjumlahKondisiposisisarana = "INSERT INTO jumlahKondisiposisisarana (jumlahstopkontak,kondisistopkontak,posisistopkontak,jumlahLCD,kondisiLCD,posisiLCD,jumlahlampu,posisilampu,jumlahkipas,posisikipas,jumlahAC,posisiAC,SSID,bandwidth,jumlahCCTV,posisiCCTV) VALUES (jumlahstopkontak,kondisistopkontak,posisistopkontak,jumlahLCD,kondisiLCD,posisiLCD,jumlahlampu,posisilampu,jumlahkipas,posisikipas,jumlahAC,posisiAC,SSID,bandwidth,jumlahCCTV,posisiCCTV)";
//	private final String selectjumlahKondisiposisisarana = "SELECT kondisistopkontak,posisistopkontak,jumlahLCD,kondisiLCD,posisiLCD,jumlahlampu,posisilampu,jumlahkipas,posisikipas,jumlahAC,posisiAC,SSID,bandwidth,jumlahCCTV,posisiCCTV FROM jumlahkondisiposisisarana WHERE jumlahkondisiposisisarana LIKE jumlahstopkontak";
//	private final String deletejumlahKondisiposisisarana = "DELETE kondisistopkontak,posisistopkontak,jumlahLCD,kondisiLCD,posisiLCD,jumlahlampu,posisilampu,jumlahkipas,posisikipas,jumlahAC,posisiAC,SSID,bandwidth,jumlahCCTV,posisiCCTV FROM jumlahkondisiposisisarana WHERE jumlahkondisiposisisarana LIKE jumlahstopkontak";
//
//
//	private final String insertlingkungankelas = "INSERT INTO lingkungankelas (x) VALUES (x)";
//	private final String selectlingkungankelas = "SELECT x FROM lingkungankelas WHERE lingkungankelas LIKE x";
//	private final String deletelingkungankelas = "DELETE x FROM lingkungankelas WHERE lingkungankelas LIKE x";
//
//
//	private final String insertkebersihankelas = "INSERT INTO kebersihankelas(sirkulasiudara,pencahayaan,kelembapan,suhu) VALUES (sirkulasiudara,pencahayaan,kelembapan,suhu)";
//	private final String selectkebersihankelas = "SELECT pencahayaan,kelembapan,suhu FROM kebersihankelas WHERE kebersihankelas LIKE sirkulasiudara";
//	private final String deletekebersihankelas = "DELETE pencahayaan,kelembapan,suhu FROM kebersihankelas WHERE kebersihankelas LIKE sirkulasiudara";
//
//
//	private final String insertKenyamananKelas = "INSERT INTO KenyamananKelas (s,y,z,a,b) VALUES (s,y,z,a,b)";
//	private final String selectKenyamananKelas = "SELECT y,z,a,b FROM KenyamananKelas WHERE KenyamananKelas LIKE s";
//	private final String deleteKenyamananKelas = "DELETE y,z,a,b FROM KenyamananKelas WHERE KenyamananKelas LIKE s";
//
//
//	private final String insertkeamanankelas = "INSERT INTO keamanankelas (c,d,e) VALUES (c,d,e)";
//	private final String selectkeamanankelas = "SELECT d,e FROM keamanankelas WHERE keamanankelas LIKE c";
//	private final String deletekeamanankelas = "DELETE d,e FROM keamanankelas WHERE keamanankelas LIKE c";
//
//

// tolong di tambahin exception handlingnya ya ....
        // yg try {}

	
} 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasbesar;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class inputbaru extends javax.swing.JFrame{
  
JDesktopPane desktop=new JDesktopPane(); 
    
    
  //InputIndentitasRuangKelas 
JLabel lblnamaruang=new JLabel("Nama Ruang");
JTextField txnamaruang=new JTextField(20);
JLabel lbllokasiruang=new JLabel("Lokasi Ruang");
JTextField txlokasiruang=new JTextField(20);
JLabel lblnamafakultas=new JLabel("Nama Fakultas");
JTextField txnamafakultas=new JTextField(20);

//InputKondisiRuangKelas
JLabel lblpanjang=new JLabel("Panjang");
JTextField txpanjang=new JTextField(20);
JLabel lbllebar=new JLabel("Lebar");
JTextField txlebar=new JTextField(20);
JLabel lbljumlahpintu=new JLabel("Jumlah Pintu");
JTextField txjumlahpintu=new JTextField(20);
JLabel lbljumlahkursi=new JLabel("Jumlah Kursi");
JTextField txjumlahkursi=new JTextField(20);
JLabel lbljumlahjendela=new JLabel("Jumlah Jendela");
JTextField txjumlahjendela=new JTextField(20);

//InputjumlahKondisiPosisiSarana
JLabel lbljumlahstopkontak=new JLabel("Jumlah Stopkontak");
JTextField txjumlahstopkontak=new JTextField(20);
JLabel lblkondisistopkontak=new JLabel("Kondisi Stopkontak");
JTextField txkondisistopkontak=new JTextField(20); 
JLabel lblposisistopkontak=new JLabel("Posisi Stopkontak ");
JRadioButton posisistopkontak1=new JRadioButton("Pojok Ruangan");
JRadioButton posisistopkontak2=new JRadioButton("Dekat Dosen");
JLabel lbljumlahLCD=new JLabel("Jumlah Kabel LCD");
JTextField txjumlahLCD=new JTextField(20);
JLabel lblkondisiLCD=new JLabel("Kondisi Kabel LCD");
JRadioButton kondisiLCD1=new JRadioButton("Berfungsi");
JRadioButton kondisiLCD2=new JRadioButton("Tidak Berfungsi");
JLabel lblposisiLCD=new JLabel("Posisi LCD");
JRadioButton posisiLCD1=new JRadioButton("Dekat Dosen");
JRadioButton posisiLCD2=new JRadioButton("Lain");
JLabel lbljumlahlampu=new JLabel("Jumlah Kabel Lampu");
JTextField txjumlahlampu=new JTextField(20);
JLabel lblposisilampu=new JLabel("Jumlah Kondisi Lampu");
JRadioButton posisilampu1=new JRadioButton("Atap Ruanagan");
JRadioButton posisilampu2=new JRadioButton("Lain");
JLabel lbljumlahkipas=new JLabel("Jumlah Kipas Angin");
JTextField txjumlahkipas=new JTextField(20);
JLabel lblposisikipas=new JLabel("Jumlah Kondisi Kipas Angin");
JRadioButton posisikipas1=new JRadioButton("Atap Ruangan");
JRadioButton posisikipas2=new JRadioButton("Lain");
JLabel lbljumlahAC=new JLabel("Jumlah AC");
JTextField txjumlahAC=new JTextField(20);
JLabel lblposisiAC=new JLabel("Jumlah Kondisi AC");
JRadioButton posisiAC1=new JRadioButton("Belakang / Samping");
JRadioButton posisiAC2=new JRadioButton("Lain");
JLabel lblSSID=new JLabel("Pilih SSID");
JRadioButton SSID1=new JRadioButton("UMM Hotspot");
JRadioButton SSID2=new JRadioButton("Lain");
JLabel lblbandhwith=new JLabel("Pilih Bandhwith");
JRadioButton bandhwith1=new JRadioButton("Bisa Login");
JRadioButton bandhwith2=new JRadioButton("Tidak Bisa Login");
JLabel lbljumlahCCTV=new JLabel("Jumlah CCTV");
JTextField txjumlahCCTV=new JTextField(20);
JLabel lblposisiCCTV=new JLabel("posisi CCTV");
JRadioButton posisiCCTV1=new JRadioButton("Depan");
JRadioButton posisiCCTV2=new JRadioButton("Belakang");
    
// InputLingkunganKelas
JLabel lblx=new JLabel("Kondisi Lantai"+"Kondisi pintu"+"Kondisi jendela"+"Kondisi pintu"+"Kondisi atap"+"Kondisi dinding");
JRadioButton x1=new JRadioButton("Bersih");
JRadioButton x2=new JRadioButton("Kotor");

//InputKebersihanKelas
JLabel lblsirkulasiudara=new JLabel("Pilih Sirkulasi Udara");
JRadioButton sirkulasiudara1=new JRadioButton("Lancar");
JRadioButton sirkulasiudara2=new JRadioButton("Tidak Lancar");
JLabel lblpencahayaan=new JLabel("Niali pencahayaan");
JTextField txpencahayaan=new JTextField(20);
JLabel lblkelembapan=new JLabel("kelembapan(%):");
JTextField txkelembapan=new JTextField(20);
JLabel lblsuhu=new JLabel("suhu (celcius)");
JTextField txsuhu=new JTextField(20);

//InputKenyamananKelas
JLabel lbls=new JLabel("kebisingan");
JRadioButton s1=new JRadioButton("Bising");
JRadioButton s2=new JRadioButton("Tidak Bising");
JLabel lbly=new JLabel("Bau");
JRadioButton y1=new JRadioButton("Bau");
JRadioButton y2=new JRadioButton("Tidak Bau");
JLabel lblz=new JLabel("Kebocoran");
JRadioButton z1=new JRadioButton("Bocor");
JRadioButton z2=new JRadioButton("Tidak Bocor");
JLabel lbla=new JLabel("Kerusakan");
JRadioButton a1=new JRadioButton("Rusak");
JRadioButton a2=new JRadioButton("Tidak Rusak");
JLabel lblb=new JLabel("Keausan");
JRadioButton b1=new JRadioButton("Aus");
JRadioButton b2=new JRadioButton("Tidak Aus");

//InputKeamananKelas
JLabel lblc=new JLabel("Kekokohan");
JRadioButton c1=new JRadioButton("Kokoh");
JRadioButton c2=new JRadioButton("Tidak Kokoh");
JLabel lbld=new JLabel("Kunci pintu dan jendela");
JRadioButton d1=new JRadioButton("Ada");
JRadioButton d2=new JRadioButton("Tidak Ada");
JLabel lble=new JLabel("Bahaya");
JRadioButton e1=new JRadioButton("Aman");
JRadioButton e2=new JRadioButton("Tidak Aman");   

JButton tblinsert=new JButton("Insert");
JButton tblupdate=new JButton("Update");
JButton tbldelete=new JButton("Delete");
    
String namaruang="";
String lokasiruang="";
String namafakultas="";    
    
inputbaru(){
setTitle("iki sek nyacak");
setLocation(200,100);
setSize(450,120);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

void komponenVisual()
{
getContentPane().setLayout(null);
//getContentPane().setLayout(new FlowLayout());

//InputIndentitasRuangKelas
getContentPane().add(lblnamaruang);
lblnamaruang.setBounds(10,10,70,20);
getContentPane().add(txnamaruang);
txnamaruang.setBounds(75,10,100,20);

getContentPane().add(lbllokasiruang);
lbllokasiruang.setBounds(10,30,70,20);
getContentPane().add(txlokasiruang);
txlokasiruang.setBounds(75,30,100,20);

getContentPane().add(lblnamafakultas);
lblnamafakultas.setBounds(10,50,70,20);
getContentPane().add(txnamafakultas);
txnamafakultas.setBounds(75,50,100,20);

//InputKondisiRuangKelas
getContentPane().add(lblpanjang);
lblpanjang.setBounds(10,70,70,20);
getContentPane().add(txpanjang);
txpanjang.setBounds(75,70,100,20);
getContentPane().add(lbllebar);
lbllebar.setBounds(10,90,70,20);
getContentPane().add(txlebar);
txlebar.setBounds(75,90,100,20);
getContentPane().add(lbljumlahpintu);
lbljumlahpintu.setBounds(10,110,70,20);
getContentPane().add(txjumlahpintu);
txjumlahpintu.setBounds(75,110,100,20);
getContentPane().add(lbljumlahkursi);
lbljumlahkursi.setBounds(10,130,70,20);
getContentPane().add(txjumlahkursi);
txjumlahkursi.setBounds(75,130,100,20);
getContentPane().add(lbljumlahjendela);
lbljumlahjendela.setBounds(10,150,70,20);
getContentPane().add(txjumlahjendela);
txjumlahjendela.setBounds(75,150,100,20);

//InputjumlahKondisiPosisiSarana
getContentPane().add(lbljumlahstopkontak);
lbljumlahstopkontak.setBounds(10,170,70,20);
getContentPane().add(txjumlahstopkontak);
txjumlahstopkontak.setBounds(75,170,100,20);

getContentPane().add(lblkondisistopkontak);
lblkondisistopkontak.setBounds(10,190,70,20);
getContentPane().add(txkondisistopkontak);
txkondisistopkontak.setBounds(75,190,100,20);

getContentPane().add(lblposisistopkontak);
lblposisistopkontak.setBounds(10,210,70,20);
getContentPane().add(posisistopkontak1);
posisistopkontak1.setBounds(75,210,50,20);
getContentPane().add(posisistopkontak2);
posisistopkontak2.setBounds(125,210,50,20);

getContentPane().add(lbljumlahLCD);
lbljumlahLCD.setBounds(10,230,70,20);
getContentPane().add(txjumlahLCD);
txjumlahLCD.setBounds(75,230,100,20);

getContentPane().add(lblkondisiLCD);
lblkondisiLCD.setBounds(10,250,70,20);
getContentPane().add(kondisiLCD1);
kondisiLCD1.setBounds(75,250,50,20);
getContentPane().add(kondisiLCD2);
kondisiLCD2.setBounds(125,250,50,20);

getContentPane().add(lblposisiLCD);
lblposisiLCD.setBounds(10,270,70,20);
getContentPane().add(posisiLCD1);
posisiLCD1.setBounds(75,270,50,20);
getContentPane().add(posisiLCD2);
posisiLCD2.setBounds(125,270,50,20);

getContentPane().add(lbljumlahlampu);
lbljumlahlampu.setBounds(10,290,70,20);
getContentPane().add(txjumlahlampu);
txjumlahlampu.setBounds(75,290,100,20);

getContentPane().add(lblposisilampu);
lblposisilampu.setBounds(10,310,70,20);
getContentPane().add(posisilampu1);
posisilampu1.setBounds(75,310,50,20);
getContentPane().add(posisilampu2);
posisilampu2.setBounds(125,310,50,20);

getContentPane().add(lbljumlahkipas);
lbljumlahkipas.setBounds(10,330,70,20);
getContentPane().add(txjumlahkipas);
txjumlahkipas.setBounds(75,330,100,20);

getContentPane().add(lblposisikipas);
lblposisikipas.setBounds(10,350,70,20);
getContentPane().add(posisikipas1);
posisikipas1.setBounds(75,350,50,20);
getContentPane().add(posisikipas2);
posisikipas2.setBounds(125,350,50,20);

getContentPane().add(lbljumlahAC);
lbljumlahAC.setBounds(10,370,70,20);
getContentPane().add(txjumlahAC);
txjumlahAC.setBounds(75,370,100,20);

getContentPane().add(lblposisiAC);
lblposisiAC.setBounds(10,390,70,20);
getContentPane().add(posisiAC1);
posisiAC1.setBounds(75,390,50,20);
getContentPane().add(posisiAC2);
posisiAC2.setBounds(125,390,50,20);

getContentPane().add(lblSSID);
lblSSID.setBounds(10,410,70,20);
getContentPane().add(SSID1);
SSID1.setBounds(75,410,50,20);
getContentPane().add(SSID2);
SSID2.setBounds(125,410,50,20);

getContentPane().add(lblbandhwith);
lblbandhwith.setBounds(10,430,70,20);
getContentPane().add(bandhwith1);
bandhwith1.setBounds(75,430,50,20);
getContentPane().add(bandhwith2);
bandhwith2.setBounds(125,430,50,20);

getContentPane().add(lbljumlahCCTV);
lbljumlahCCTV.setBounds(10,450,70,20);
getContentPane().add(txjumlahCCTV);
txjumlahCCTV.setBounds(75,450,100,20);

getContentPane().add(lblposisiCCTV);
lblposisiCCTV.setBounds(10,470,70,20);
getContentPane().add(posisiCCTV1);
posisiCCTV1.setBounds(75,470,50,20);
getContentPane().add(posisiCCTV2);
posisiCCTV2.setBounds(125,470,50,20);

getContentPane().add(lblx);
lblx.setBounds(10,490,70,20);
getContentPane().add(x1);
x1.setBounds(75,490,50,20);
getContentPane().add(x2);
x2.setBounds(125,490,50,20);

getContentPane().add(lblsirkulasiudara);
lblsirkulasiudara.setBounds(10,510,70,20);
getContentPane().add(sirkulasiudara1);
sirkulasiudara1.setBounds(75,510,50,20);
getContentPane().add(sirkulasiudara2);
sirkulasiudara2.setBounds(125,510,50,20);

getContentPane().add(lblpencahayaan);
lblpencahayaan.setBounds(10,530,70,20);
getContentPane().add(txpencahayaan);
txpencahayaan.setBounds(75,530,100,20);

getContentPane().add(lblkelembapan);
lblkelembapan.setBounds(10,550,70,20);
getContentPane().add(txkelembapan);
txkelembapan.setBounds(75,550,100,20);

getContentPane().add(lblsuhu);
lblsuhu.setBounds(10,570,70,20);
getContentPane().add(txsuhu);
txsuhu.setBounds(75,570,100,20);

//InputKenyamananKelas
getContentPane().add(lbls);
lbls.setBounds(10,590,70,20);
getContentPane().add(s1);
s1.setBounds(75,590,50,20);
getContentPane().add(s2);
sirkulasiudara2.setBounds(125,590,50,20);

getContentPane().add(lbly);
lbly.setBounds(10,610,70,20);
getContentPane().add(y1);
y1.setBounds(75,610,50,20);
getContentPane().add(y2);
y2.setBounds(125,610,50,20);

getContentPane().add(lblz);
lblz.setBounds(10,630,70,20);
getContentPane().add(z1);
z1.setBounds(75,630,50,20);
getContentPane().add(z2);
z2.setBounds(125,630,50,20);

getContentPane().add(lbla);
lblsirkulasiudara.setBounds(10,650,70,20);
getContentPane().add(a1);
a1.setBounds(75,650,50,20);
getContentPane().add(a2);
a2.setBounds(125,650,50,20);

getContentPane().add(lblb);
lblb.setBounds(10,670,70,20);
getContentPane().add(b1);
b1.setBounds(75,670,50,20);
getContentPane().add(b2);
b2.setBounds(125,670,50,20);

//InputKeamananKelas
getContentPane().add(lblc);
lblc.setBounds(10,690,70,20);
getContentPane().add(c1);
c1.setBounds(75,690,50,20);
getContentPane().add(c2);
c2.setBounds(125,690,50,20);

getContentPane().add(lbld);
lbld.setBounds(10,710,70,20);
getContentPane().add(d1);
d1.setBounds(75,710,50,20);
getContentPane().add(d2);
d2.setBounds(125,710,50,20);

getContentPane().add(lble);
lble.setBounds(10,730,70,20);
getContentPane().add(e1);
e1.setBounds(75,730,50,20);
getContentPane().add(e2);
e2.setBounds(125,730,50,20);

getContentPane().add(tblinsert);
tblinsert.setBounds(180,10,95,20);
getContentPane().add(tblupdate);
tblupdate.setBounds(180,30,95,20);
getContentPane().add(tbldelete);
tbldelete.setBounds(180,50,95,20);

setVisible(true);
}

//fungsi tombol
void AksiReaksi()
{
tblinsert.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event)
{
if (event.getSource()==tblinsert)
{
try
{
namaruang=txnamaruang.getText();
lokasiruang=txlokasiruang.getText();
namafakultas=txnamafakultas.getText();

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection connection = DriverManager.getConnection("jdbc:odbc:kelas;uid='aziza';pw='aziza'");
Statement statement = connection.createStatement();
String sql="insert into identitasruangkelas values ('"+namaruang+"','"+lokasiruang+"','"+namafakultas+"');";
statement.executeUpdate(sql);
statement.close();
connection.close();
System.out.println("Data telah masuk");
txnamaruang.setText("");
txnamaruang.setText("");
txnamaruang.requestFocus();
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}
});

//tombol update
tblupdate.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent event)
{
if (event.getSource()==tblupdate)
{
try
{
namaruang=txnamaruang.getText();
lokasiruang=txlokasiruang.getText();
namafakultas=txnamafakultas.getText();
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection connection = DriverManager.getConnection("jdbc:odbc:kelas;uid='aziza';pw='aziza'");
Statement statement = connection.createStatement();
String sql="update identitasruangkelas set lokasiruang='"+lokasiruang+"',namafakultas='"+namafakultas+"' WHERE namaruang='"+namaruang+"'";
statement.executeUpdate(sql);
statement.close();
connection.close();
System.out.println("Data teredit");
txnamaruang.setText("");
txnamaruang.setText("");
txnamaruang.requestFocus();
}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}
});
}
public static void main(String args[])
{
inputbaru ap=new inputbaru();
ap.komponenVisual();
ap.AksiReaksi();
}
}



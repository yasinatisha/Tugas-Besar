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
JLabel lbljumlahLCD=new JLabel("Jumlah LCD");
JTextField txjumlahLCD=new JTextField(20);
JLabel lblkondisiLCD=new JLabel("Kondisi LCD");
JRadioButton kondisiLCD1=new JRadioButton("Berfungsi");
JRadioButton kondisiLCD2=new JRadioButton("Tidak Berfungsi");
JLabel lblposisiLCD=new JLabel("Posisi LCD");
JRadioButton posisiLCD1=new JRadioButton("Dekat Dosen");
JRadioButton posisiLCD2=new JRadioButton("Lain");
JLabel lbljumlahlampu=new JLabel("Jumlah Lampu");
JTextField txjumlahlampu=new JTextField(20);
JLabel lblposisilampu=new JLabel("Posisi Lampu");
JRadioButton posisilampu1=new JRadioButton("Atap Ruangan");
JRadioButton posisilampu2=new JRadioButton("Lain");
JLabel lbljumlahkipas=new JLabel("Jumlah Kipas Angin");
JTextField txjumlahkipas=new JTextField(20);
JLabel lblposisikipas=new JLabel("Posisi Kipas Angin");
JRadioButton posisikipas1=new JRadioButton("Atap Ruangan");
JRadioButton posisikipas2=new JRadioButton("Lain");
JLabel lbljumlahAC=new JLabel("Jumlah AC");
JTextField txjumlahAC=new JTextField(20);
JLabel lblposisiAC=new JLabel("Posisi AC");
JRadioButton posisiAC1=new JRadioButton("Belakang");
JRadioButton posisiAC2=new JRadioButton("Samping");
JRadioButton posisiAC3=new JRadioButton("Lain");
JLabel lblSSID=new JLabel("Pilih SSID");
JRadioButton SSID1=new JRadioButton("UMM Hotspot");
JRadioButton SSID2=new JRadioButton("Lain");
JLabel lblbandhwith=new JLabel("Pilih Bandhwith");
JRadioButton bandhwith1=new JRadioButton("Bisa Login");
JRadioButton bandhwith2=new JRadioButton("Tidak Bisa Login");
JLabel lbljumlahCCTV=new JLabel("Jumlah CCTV");
JTextField txjumlahCCTV=new JTextField(20);
JLabel lblposisiCCTV=new JLabel("Posisi CCTV");
JRadioButton posisiCCTV1=new JRadioButton("Depan");
JRadioButton posisiCCTV2=new JRadioButton("Belakang");
    
// InputLingkunganKelas
JLabel lblx=new JLabel("Kondisi Lantai");
JRadioButton x1=new JRadioButton("Bersih");
JRadioButton x2=new JRadioButton("Kotor");
JLabel lblk=new JLabel("Kondisi pintu");
//JRadioButton k1=new JRadioButton("Bersih");
//JRadioButton k2=new JRadioButton("Kotor");
JLabel lbll=new JLabel("Kondisi jendela");
//JRadioButton l1=new JRadioButton("Bersih");
//JRadioButton l2=new JRadioButton("Kotor");
JLabel lblm=new JLabel("Kondisi pintu");
//JRadioButton m1=new JRadioButton("Bersih");
//JRadioButton m2=new JRadioButton("Kotor");
JLabel lbln=new JLabel("Kondisi atap");
//JRadioButton n1=new JRadioButton("Bersih");
//JRadioButton n2=new JRadioButton("Kotor");
JLabel lblo=new JLabel("Kondisi dinding");
//JRadioButton o1=new JRadioButton("Bersih");
//JRadioButton o2=new JRadioButton("Kotor");

//InputKebersihanKelas
JLabel lblsirkulasiudara=new JLabel("Sirkulasi Udara");
JRadioButton sirkulasiudara1=new JRadioButton("Lancar");
JRadioButton sirkulasiudara2=new JRadioButton("Tidak Lancar");
JLabel lblpencahayaan=new JLabel("Niali pencahayaan");
JTextField txpencahayaan=new JTextField(20);
JLabel lblkelembapan=new JLabel("kelembapan(%)");
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
//(maju,bawah,panjang,bawah/lebar)
lblnamaruang.setBounds(10,10,120,20);
getContentPane().add(txnamaruang);
txnamaruang.setBounds(130,10,100,20);

getContentPane().add(lbllokasiruang);
lbllokasiruang.setBounds(10,30,120,20);
getContentPane().add(txlokasiruang);
txlokasiruang.setBounds(130,30,100,20);

getContentPane().add(lblnamafakultas);
lblnamafakultas.setBounds(10,50,120,20);
getContentPane().add(txnamafakultas);
txnamafakultas.setBounds(130,50,100,20);

//InputKondisiRuangKelas
getContentPane().add(lblpanjang);
lblpanjang.setBounds(10,70,120,20);
getContentPane().add(txpanjang);
txpanjang.setBounds(130,70,100,20);
getContentPane().add(lbllebar);
lbllebar.setBounds(10,90,120,20);
getContentPane().add(txlebar);
txlebar.setBounds(130,90,100,20);
getContentPane().add(lbljumlahpintu);
lbljumlahpintu.setBounds(10,110,120,20);
getContentPane().add(txjumlahpintu);
txjumlahpintu.setBounds(130,110,100,20);
getContentPane().add(lbljumlahkursi);
lbljumlahkursi.setBounds(10,130,120,20);
getContentPane().add(txjumlahkursi);
txjumlahkursi.setBounds(130,130,100,20);
getContentPane().add(lbljumlahjendela);
lbljumlahjendela.setBounds(10,150,120,20);
getContentPane().add(txjumlahjendela);
txjumlahjendela.setBounds(130,150,100,20);

//InputjumlahKondisiPosisiSarana
getContentPane().add(lbljumlahstopkontak);
lbljumlahstopkontak.setBounds(10,170,120,20);
getContentPane().add(txjumlahstopkontak);
txjumlahstopkontak.setBounds(130,170,100,20);

getContentPane().add(lblkondisistopkontak);
lblkondisistopkontak.setBounds(10,190,120,20);
getContentPane().add(txkondisistopkontak);
txkondisistopkontak.setBounds(130,190,100,20);

getContentPane().add(lblposisistopkontak);
lblposisistopkontak.setBounds(10,210,120,20);
getContentPane().add(posisistopkontak1);
posisistopkontak1.setBounds(125,200,120,43);
getContentPane().add(posisistopkontak2);
posisistopkontak2.setBounds(250,210,100,20);

getContentPane().add(lbljumlahLCD);
lbljumlahLCD.setBounds(10,230,90,20);
getContentPane().add(txjumlahLCD);
txjumlahLCD.setBounds(130,230,100,20);

getContentPane().add(lblkondisiLCD);
lblkondisiLCD.setBounds(10,250,120,20);
getContentPane().add(kondisiLCD1);
kondisiLCD1.setBounds(125,250,80,20);
getContentPane().add(kondisiLCD2);
kondisiLCD2.setBounds(250,250,120,20);

getContentPane().add(lblposisiLCD);
lblposisiLCD.setBounds(10,270,120,20);
getContentPane().add(posisiLCD1);
posisiLCD1.setBounds(125,270,110,20);
getContentPane().add(posisiLCD2);
posisiLCD2.setBounds(250,270,50,20);

getContentPane().add(lbljumlahlampu);
lbljumlahlampu.setBounds(10,290,120,20);
getContentPane().add(txjumlahlampu);
txjumlahlampu.setBounds(130,290,100,20);

getContentPane().add(lblposisilampu);
lblposisilampu.setBounds(10,310,120,20);
getContentPane().add(posisilampu1);
posisilampu1.setBounds(125,310,120,20);
getContentPane().add(posisilampu2);
posisilampu2.setBounds(250,310,50,20);

getContentPane().add(lbljumlahkipas);
lbljumlahkipas.setBounds(10,330,120,20);
getContentPane().add(txjumlahkipas);
txjumlahkipas.setBounds(130,330,100,20);

getContentPane().add(lblposisikipas);
lblposisikipas.setBounds(10,350,120,20);
getContentPane().add(posisikipas1);
posisikipas1.setBounds(125,350,120,20);
getContentPane().add(posisikipas2);
posisikipas2.setBounds(250,350,50,20);

getContentPane().add(lbljumlahAC);
lbljumlahAC.setBounds(10,370,120,20);
getContentPane().add(txjumlahAC);
txjumlahAC.setBounds(130,370,100,20);

getContentPane().add(lblposisiAC);
lblposisiAC.setBounds(10,390,120,20);
getContentPane().add(posisiAC1);
posisiAC1.setBounds(125,390,80,20);
getContentPane().add(posisiAC2);
posisiAC2.setBounds(250,390,80,20);
getContentPane().add(posisiAC3);
posisiAC3.setBounds(375,390,50,20);

getContentPane().add(lblSSID);
lblSSID.setBounds(10,410,120,20);
getContentPane().add(SSID1);
SSID1.setBounds(125,410,110,20);
getContentPane().add(SSID2);
SSID2.setBounds(250,410,50,20);

getContentPane().add(lblbandhwith);
lblbandhwith.setBounds(10,430,120,20);
getContentPane().add(bandhwith1);
bandhwith1.setBounds(125,430,100,20);
getContentPane().add(bandhwith2);
bandhwith2.setBounds(250,430,120,20);

getContentPane().add(lbljumlahCCTV);
lbljumlahCCTV.setBounds(10,450,120,20);
getContentPane().add(txjumlahCCTV);
txjumlahCCTV.setBounds(130,450,100,20);

getContentPane().add(lblposisiCCTV);
lblposisiCCTV.setBounds(10,470,120,20);
getContentPane().add(posisiCCTV1);
posisiCCTV1.setBounds(125,470,80,20);
getContentPane().add(posisiCCTV2);
posisiCCTV2.setBounds(250,470,90,20);

getContentPane().add(lblx);
lblx.setBounds(10,490,120,20);


getContentPane().add(lblk);
lblk.setBounds(10,510,120,20);
//getContentPane().add(k1);
//k1.setBounds(125,490,50,20);
//getContentPane().add(k2);
//k2.setBounds(250,490,50,20);
//
getContentPane().add(lbll);
lbll.setBounds(10,520,120,20);
//getContentPane().add(l1);
//l1.setBounds(125,490,50,20);
//getContentPane().add(l2);
//l2.setBounds(250,490,50,20);
//
getContentPane().add(lblm);
lblm.setBounds(10,540,120,20);
//getContentPane().add(m1);
//m1.setBounds(125,490,50,20);
//getContentPane().add(m2);
//m2.setBounds(250,490,50,20);
//
getContentPane().add(lbln);
lbln.setBounds(10,560,120,20);
//getContentPane().add(n1);
//n1.setBounds(125,490,50,20);
//getContentPane().add(n2);
//n2.setBounds(250,490,50,20);
//
getContentPane().add(lblo);
lblo.setBounds(10,580,120,20);
//getContentPane().add(o1);
//o1.setBounds(125,490,50,20);
//getContentPane().add(o2);
//o2.setBounds(250,490,50,20);

getContentPane().add(x1);
x1.setBounds(125,600,80,20);
getContentPane().add(x2);
x2.setBounds(250,600,80,20);

getContentPane().add(lblsirkulasiudara);
lblsirkulasiudara.setBounds(10,500,120,20);
getContentPane().add(sirkulasiudara1);
sirkulasiudara1.setBounds(125,620,80,20);
getContentPane().add(sirkulasiudara2);
sirkulasiudara2.setBounds(250,620,110,40);

getContentPane().add(lblpencahayaan);
lblpencahayaan.setBounds(10,640,120,20);
getContentPane().add(txpencahayaan);
txpencahayaan.setBounds(130,640,100,20);

getContentPane().add(lblkelembapan);
lblkelembapan.setBounds(10,660,120,20);
getContentPane().add(txkelembapan);
txkelembapan.setBounds(130,660,100,20);

getContentPane().add(lblsuhu);
lblsuhu.setBounds(10,680,90,20);
getContentPane().add(txsuhu);
txsuhu.setBounds(130,680,100,20);

//InputKenyamananKelas
getContentPane().add(lbls);
lbls.setBounds(10,700,120,20);
getContentPane().add(s1);
s1.setBounds(125,700,50,20);
getContentPane().add(s2);
sirkulasiudara2.setBounds(250,700,50,20);

getContentPane().add(lbly);
lbly.setBounds(10,720,120,20);
getContentPane().add(y1);
y1.setBounds(125,720,50,20);
getContentPane().add(y2);
y2.setBounds(250,720,50,20);

getContentPane().add(lblz);
lblz.setBounds(10,740,120,20);
getContentPane().add(z1);
z1.setBounds(125,740,50,20);
getContentPane().add(z2);
z2.setBounds(250,740,50,20);

getContentPane().add(lbla);
lblsirkulasiudara.setBounds(10,760,120,20);
getContentPane().add(a1);
a1.setBounds(125,760,50,20);
getContentPane().add(a2);
a2.setBounds(250,760,50,20);

getContentPane().add(lblb);
lblb.setBounds(10,790,120,20);
getContentPane().add(b1);
b1.setBounds(125,790,50,20);
getContentPane().add(b2);
b2.setBounds(250,790,50,20);

//InputKeamananKelas
getContentPane().add(lblc);
lblc.setBounds(10,810,120,20);
getContentPane().add(c1);
c1.setBounds(125,810,50,20);
getContentPane().add(c2);
c2.setBounds(250,810,50,20);

getContentPane().add(lbld);
lbld.setBounds(10,810,120,20);
getContentPane().add(d1);
d1.setBounds(125,810,50,20);
getContentPane().add(d2);
d2.setBounds(250,810,50,20);

getContentPane().add(lble);
lble.setBounds(10,830,120,20);
getContentPane().add(e1);
e1.setBounds(125,830,50,20);
getContentPane().add(e2);
e2.setBounds(250,830,50,20);

getContentPane().add(tblinsert);
tblinsert.setBounds(240,10,95,20);
getContentPane().add(tblupdate);
tblupdate.setBounds(240,30,95,20);
getContentPane().add(tbldelete);
tbldelete.setBounds(240,50,95,20);

setVisible(true);
}
//fungsi tombol
//void AksiReaksi()
//{
//tblinsert.addActionListener(new ActionListener(){
//public void actionPerformed(ActionEvent event)
//{
//if (event.getSource()==tblinsert)
//{
//try
//{
//namaruang=txnamaruang.getText();
//lokasiruang=txlokasiruang.getText();
//namafakultas=txnamafakultas.getText();
//
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//Connection connection = DriverManager.getConnection("jdbc:odbc:kelas;uid='aziza';pw='aziza'");
//Statement statement = connection.createStatement();
//String sql="insert into identitasruangkelas values ('"+namaruang+"','"+lokasiruang+"','"+namafakultas+"');";
//statement.executeUpdate(sql);
//statement.close();
//connection.close();
//System.out.println("Data telah masuk");
//txnamaruang.setText("");
//txnamaruang.setText("");
//txnamaruang.requestFocus();
//}
//catch(Exception e)
//{
//System.out.println("Error :"+e);
//}
//}
//}
//});
//
////tombol update
//tblupdate.addActionListener(new ActionListener()
//{
//    public void actionPerformed(ActionEvent event)
//{
//if (event.getSource()==tblupdate)
//{
//try
//{
//namaruang=txnamaruang.getText();
//lokasiruang=txlokasiruang.getText();
//namafakultas=txnamafakultas.getText();
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//Connection connection = DriverManager.getConnection("jdbc:odbc:kelas;uid='aziza';pw='aziza'");
//Statement statement = connection.createStatement();
//String sql="update identitasruangkelas set lokasiruang='"+lokasiruang+"',namafakultas='"+namafakultas+"' WHERE namaruang='"+namaruang+"'";
//statement.executeUpdate(sql);
//statement.close();
//connection.close();
//System.out.println("Data teredit");
//txnamaruang.setText("");
//txnamaruang.setText("");
//txnamaruang.requestFocus();
//}
//catch(Exception e)
//{
//System.out.println("Error :"+e);
//}
//}
//}
//});
//}

//{
//inputbaru ap=new inputbaru();
//ap.komponenVisual();
//ap.AksiReaksi();
//}
//}
//

/*private void simpanActionPerform(java.awt.event.ActionEvent evt){
    String sql= "INSERT INTO ruangkelas('"+ txnamaruang.getText()+"', '"+ txlokasiruang.getText()+"', '"+ txnamafakultas.getText()+"', '"+ 
            txpanjang.getText()+"', '"+ txlebar.getText()+"','"+ txjumlahkursi.getText()+"','"+ txjumlahjendela.getText()+"','"+
            txjumlahpintu.getText()+"','"+ txjumlahstopkontak.getText()+"','"+ txkondisistopkontak.getText()+"','"+ 
            lblposisistopkontak.getText()+"','"+ txjumlahLCD.getText()+"','"+ lblkondisiLCD.getText()+"','"+ lblposisiLCD.getText()+"','"+
            txjumlahlampu.getText()+"', '"+ lblposisilampu.getText()+"','"+ txjumlahkipas.getText()+"','"+ lblposisikipas.getText()+"','"+
            txjumlahAC.getText()+"','"+ lblposisiAC.getText()+"','"+ lblSSID.getText()+"','"+ lblbandhwith.getText()+"','"+ txjumlahCCTV.getText()+"','"+
            lblposisiCCTV.getText()+"','"+ lblsirkulasiudara.getText()+"','"+ lblpencahayaan.getText()+"','"+ lblkelembapan.getText()+"','"+
            lblsuhu.getText()+"','"+ lblx.getText()+"','"+ lbls.getText()+"','"+ lbly.getText()+"','"+ lblz.getText()+"','"+ 
            lbla.getText()+"','"+ lblb.getText()+"','"+ lblc.getText()+"','"+ lbld.getText()+"','"+ lble.getText()+"')";
    System.out.println(sql);
    KONEKSI a= new KONEKSI();
    Statement st = a.getConnection1();
    
   try{
       st.executeUpdate(sql);
       JOptionPane.showMessageDialog(null, "BERHASIL DITAMBAHKAN");
   }catch(Exception e){
       JOptionPane.showMessageDialog(null, "GAGAL");
   }
   
   txnamaruang.setText("");
   txlokasiruang.setText("");
   txnamafakultas.setText("");
   txpanjang.setText("");
   txlebar.setText("");
   txjumlahkursi.setText("");
   txjumlahjendela.setText("");
   txjumlahpintu.setText("");
   txjumlahstopkontak.setText("");
   txkondisistopkontak.setText("");
   lblposisistopkontak.setText("");
   txjumlahLCD.setText("");
   lblkondisiLCD.setText("");
   lblposisiLCD.setText("");
   txjumlahlampu.setText("");
   lblposisilampu.setText("");
   txjumlahkipas.setText("");
   lblposisikipas.setText("");
   txjumlahAC.setText("");
   lblposisiAC.setText("");
   lblSSID.setText("");
   lblbandhwith.setText("");
   txjumlahCCTV.setText("");
   lblposisiCCTV.setText("");
   lblsirkulasiudara.setText("");
   lblpencahayaan.setText("");
   lblkelembapan.setText("");
   lblsuhu.setText("");
   lblx.setText("");
   lbls.setText("");
   lbly.setText("");
   lblz.setText("");
   lbla.setText("");
   lblb.setText("");
   lblc.setText("");
   lbld.setText("");
   lble.setText("");
}*/
public static void main(String args[]){
    inputbaru ap=new inputbaru();
ap.komponenVisual();
}
 
    private void simpanActionPerform(java.awt.event.ActionEvent evt) {
         String sql= "INSERT INTO ruangkelas('"+ txnamaruang.getText()+"', '"+ txlokasiruang.getText()+"', '"+ txnamafakultas.getText()+"', '"+ 
            txpanjang.getText()+"', '"+ txlebar.getText()+"','"+ txjumlahkursi.getText()+"','"+ txjumlahjendela.getText()+"','"+
            txjumlahpintu.getText()+"','"+ txjumlahstopkontak.getText()+"','"+ txkondisistopkontak.getText()+"','"+ 
            lblposisistopkontak.getText()+"','"+ txjumlahLCD.getText()+"','"+ lblkondisiLCD.getText()+"','"+ lblposisiLCD.getText()+"','"+
            txjumlahlampu.getText()+"', '"+ lblposisilampu.getText()+"','"+ txjumlahkipas.getText()+"','"+ lblposisikipas.getText()+"','"+
            txjumlahAC.getText()+"','"+ lblposisiAC.getText()+"','"+ lblSSID.getText()+"','"+ lblbandhwith.getText()+"','"+ txjumlahCCTV.getText()+"','"+
            lblposisiCCTV.getText()+"','"+ lblsirkulasiudara.getText()+"','"+ lblpencahayaan.getText()+"','"+ lblkelembapan.getText()+"','"+
            lblsuhu.getText()+"','"+ lblx.getText()+"','"+ lbls.getText()+"','"+ lbly.getText()+"','"+ lblz.getText()+"','"+ 
            lbla.getText()+"','"+ lblb.getText()+"','"+ lblc.getText()+"','"+ lbld.getText()+"','"+ lble.getText()+"')";
    System.out.println(sql);
    KONEKSI a= new KONEKSI();
    Statement st = a.getConnection1();
    
   try{
       st.executeUpdate(sql);
       JOptionPane.showMessageDialog(null, "BERHASIL DITAMBAHKAN");
   }catch(Exception e){
       JOptionPane.showMessageDialog(null, "GAGAL");
   }
   
   txnamaruang.setText("");
   txlokasiruang.setText("");
   txnamafakultas.setText("");
   txpanjang.setText("");
   txlebar.setText("");
   txjumlahkursi.setText("");
   txjumlahjendela.setText("");
   txjumlahpintu.setText("");
   txjumlahstopkontak.setText("");
   txkondisistopkontak.setText("");
   lblposisistopkontak.setText("");
   txjumlahLCD.setText("");
   lblkondisiLCD.setText("");
   lblposisiLCD.setText("");
   txjumlahlampu.setText("");
   lblposisilampu.setText("");
   txjumlahkipas.setText("");
   lblposisikipas.setText("");
   txjumlahAC.setText("");
   lblposisiAC.setText("");
   lblSSID.setText("");
   lblbandhwith.setText("");
   txjumlahCCTV.setText("");
   lblposisiCCTV.setText("");
   lblsirkulasiudara.setText("");
   lblpencahayaan.setText("");
   lblkelembapan.setText("");
   lblsuhu.setText("");
   lblx.setText("");
   lbls.setText("");
   lbly.setText("");
   lblz.setText("");
   lbla.setText("");
   lblb.setText("");
   lblc.setText("");
   lbld.setText("");
   lble.setText("");
    }
}

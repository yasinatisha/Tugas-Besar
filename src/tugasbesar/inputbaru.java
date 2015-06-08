package tugasbesar;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

class inputbaru extends JFrame{
    
 JPanel panel=new JPanel();
 
 
  //InputIndentitasRuangKelas 
JLabel lblnamaruang=new JLabel("Nama Ruang");
JTextField txnamaruang=new JTextField("");
JLabel lbllokasiruang=new JLabel("Lokasi Ruang");
JTextField txlokasiruang=new JTextField("");
JLabel lblnamafakultas=new JLabel("Nama Fakultas");
JTextField txnamafakultas=new JTextField("");

//InputKondisiRuangKelas
JLabel lblpanjang=new JLabel("Panjang");
JTextField txpanjang=new JTextField("");
JLabel lbllebar=new JLabel("Lebar");
JTextField txlebar=new JTextField("");
JLabel lbljumlahpintu=new JLabel("Jumlah Pintu");
JTextField txjumlahpintu=new JTextField("");
JLabel lbljumlahkursi=new JLabel("Jumlah Kursi");
JTextField txjumlahkursi=new JTextField("");
JLabel lbljumlahjendela=new JLabel("Jumlah Jendela");
JTextField txjumlahjendela=new JTextField("");

//InputjumlahKondisiPosisiSarana
JLabel lbljumlahstopkontak=new JLabel("Jumlah Stopkontak");
JTextField txjumlahstopkontak=new JTextField("");
JLabel lblkondisistopkontak=new JLabel("Kondisi Stopkontak");
JTextField txkondisistopkontak=new JTextField(""); 
JLabel lblposisistopkontak=new JLabel("Posisi Stopkontak ");
JRadioButton posisistopkontak1=new JRadioButton("Pojok Ruangan");
JRadioButton posisistopkontak2=new JRadioButton("Dekat Dosen");
JLabel lbljumlahLCD=new JLabel("Jumlah LCD");
JTextField txjumlahLCD=new JTextField("");
JLabel lblkondisiLCD=new JLabel("Kondisi LCD");
JRadioButton kondisiLCD1=new JRadioButton("Berfungsi");
JRadioButton kondisiLCD2=new JRadioButton("Tidak Berfungsi");
JLabel lblposisiLCD=new JLabel("Posisi LCD");
JRadioButton posisiLCD1=new JRadioButton("Dekat Dosen");
JRadioButton posisiLCD2=new JRadioButton("Lain");
JLabel lbljumlahlampu=new JLabel("Jumlah Lampu");
JTextField txjumlahlampu=new JTextField("");
JLabel lblposisilampu=new JLabel("Posisi Lampu");
JRadioButton posisilampu1=new JRadioButton("Atap Ruangan");
JRadioButton posisilampu2=new JRadioButton("Lain");
JLabel lbljumlahkipas=new JLabel("Jumlah Kipas Angin");
JTextField txjumlahkipas=new JTextField("");
JLabel lblposisikipas=new JLabel("Posisi Kipas Angin");
JRadioButton posisikipas1=new JRadioButton("Atap Ruangan");
JRadioButton posisikipas2=new JRadioButton("Lain");
JLabel lbljumlahAC=new JLabel("Jumlah AC");
JTextField txjumlahAC=new JTextField("");
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
JTextField txjumlahCCTV=new JTextField("");
JLabel lblposisiCCTV=new JLabel("Posisi CCTV");
JRadioButton posisiCCTV1=new JRadioButton("Depan");
JRadioButton posisiCCTV2=new JRadioButton("Belakang");
    
// InputLingkunganKelas
JLabel lblx=new JLabel("Kondisi Lantai");
JRadioButton x1=new JRadioButton("Bersih");
JRadioButton x2=new JRadioButton("Kotor");
JLabel lblk=new JLabel("Kondisi pintu");
JLabel lbll=new JLabel("Kondisi jendela");
JLabel lblm=new JLabel("Kondisi pintu");
JLabel lbln=new JLabel("Kondisi atap");
JLabel lblo=new JLabel("Kondisi dinding");

//InputKebersihanKelas
JLabel lblsirkulasiudara=new JLabel("Sirkulasi Udara");
JRadioButton sirkulasiudara1=new JRadioButton("Lancar");
JRadioButton sirkulasiudara2=new JRadioButton("Tidak Lancar");
JLabel lblpencahayaan=new JLabel("Niali pencahayaan");
JTextField txpencahayaan=new JTextField("");
JLabel lblkelembapan=new JLabel("kelembapan(%)");
JTextField txkelembapan=new JTextField(20);
JLabel lblsuhu=new JLabel("suhu (celcius)");
JTextField txsuhu=new JTextField("");

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
   String panjang="";
   String lebar="";
   String jumlahkursi="";
   String jumlahjendela="";
   String jumlahpintu="";
   String luas="";
   String rasio="";
   String jumlahstopkontak="";
   String kondisistopkontak="";
   String posisistopkontak="";
   String jumlahLCD="";
   String kondisiLCD="";
   String posisiLCD="";
   String jumlahlampu="";
   String posisilampu="";
   String jumlahkipas="";
   String posisikipas="";
   String jumlahAC="";
   String posisiAC="";
   String SSID="";
   String bandhwith="";
   String jumlahCCTV="";
   String posisiCCTV="";
   String x="";
   String s="";
   String y="";
   String z="";
   String a="";
   String b="";
   String c="";
   String d="";
   String e="";
   String sirkulasiudara="";
   String pencahayaan="";
   String kelembapan="";
   String suhu="";
 
inputbaru(){
setTitle("INVENTARIS KELAS");
setLocation(200,100);
setSize(450,800);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}

void komponenVisual(){
getContentPane().add(panel);
JScrollPane scrollPane = new JScrollPane(panel);
getContentPane().add(scrollPane, BorderLayout.NORTH); 

panel.setBounds(10, 11, 493, 350);
add(panel);
panel.setLayout(null);

//InputIndentitasRuangKelas
panel.add(lblnamaruang);
//(maju,bawah,panjang,bawah/lebar)
lblnamaruang.setBounds(10,10,120,20);
panel.add(txnamaruang);
txnamaruang.setBounds(130,10,100,20);

panel.add(lbllokasiruang);
lbllokasiruang.setBounds(10,30,120,20);
panel.add(txlokasiruang);
txlokasiruang.setBounds(130,30,100,20);

panel.add(lblnamafakultas);
lblnamafakultas.setBounds(10,50,120,20);
panel.add(txnamafakultas);
txnamafakultas.setBounds(130,50,100,20);

//InputKondisiRuangKelas
panel.add(lblpanjang);
lblpanjang.setBounds(10,70,120,20);
panel.add(txpanjang);
txpanjang.setBounds(130,70,100,20);
panel.add(lbllebar);
lbllebar.setBounds(10,90,120,20);
panel.add(txlebar);
txlebar.setBounds(130,90,100,20);
panel.add(lbljumlahpintu);
lbljumlahpintu.setBounds(10,110,120,20);
panel.add(txjumlahpintu);
txjumlahpintu.setBounds(130,110,100,20);
panel.add(lbljumlahkursi);
lbljumlahkursi.setBounds(10,130,120,20);
panel.add(txjumlahkursi);
txjumlahkursi.setBounds(130,130,100,20);
panel.add(lbljumlahjendela);
lbljumlahjendela.setBounds(10,150,120,20);
panel.add(txjumlahjendela);
txjumlahjendela.setBounds(130,150,100,20);

//InputjumlahKondisiPosisiSarana
panel.add(lbljumlahstopkontak);
lbljumlahstopkontak.setBounds(10,170,120,20);
panel.add(txjumlahstopkontak);
txjumlahstopkontak.setBounds(130,170,100,20);

panel.add(lblkondisistopkontak);
lblkondisistopkontak.setBounds(10,190,120,20);
panel.add(txkondisistopkontak);
txkondisistopkontak.setBounds(130,190,100,20);

panel.add(lblposisistopkontak);
lblposisistopkontak.setBounds(10,210,120,20);
panel.add(posisistopkontak1);
posisistopkontak1.setBounds(125,200,120,43);
panel.add(posisistopkontak2);
posisistopkontak2.setBounds(250,210,100,20);

panel.add(lbljumlahLCD);
lbljumlahLCD.setBounds(10,230,90,20);
panel.add(txjumlahLCD);
txjumlahLCD.setBounds(130,230,100,20);

panel.add(lblkondisiLCD);
lblkondisiLCD.setBounds(10,250,120,20);
panel.add(kondisiLCD1);
kondisiLCD1.setBounds(125,250,80,20);
panel.add(kondisiLCD2);
kondisiLCD2.setBounds(250,250,120,20);

panel.add(lblposisiLCD);
lblposisiLCD.setBounds(10,270,120,20);
panel.add(posisiLCD1);
posisiLCD1.setBounds(125,270,110,20);
panel.add(posisiLCD2);
posisiLCD2.setBounds(250,270,50,20);

panel.add(lbljumlahlampu);
lbljumlahlampu.setBounds(10,290,120,20);
panel.add(txjumlahlampu);
txjumlahlampu.setBounds(130,290,100,20);

panel.add(lblposisilampu);
lblposisilampu.setBounds(10,310,120,20);
panel.add(posisilampu1);
posisilampu1.setBounds(125,310,120,20);
panel.add(posisilampu2);
posisilampu2.setBounds(250,310,50,20);

panel.add(lbljumlahkipas);
lbljumlahkipas.setBounds(10,330,120,20);
panel.add(txjumlahkipas);
txjumlahkipas.setBounds(130,330,100,20);

panel.add(lblposisikipas);
lblposisikipas.setBounds(10,350,120,20);
panel.add(posisikipas1);
posisikipas1.setBounds(125,350,120,20);
panel.add(posisikipas2);
posisikipas2.setBounds(250,350,50,20);

panel.add(lbljumlahAC);
lbljumlahAC.setBounds(10,370,120,20);
panel.add(txjumlahAC);
txjumlahAC.setBounds(130,370,100,20);

panel.add(lblposisiAC);
lblposisiAC.setBounds(10,390,120,20);
panel.add(posisiAC1);
posisiAC1.setBounds(125,390,80,20);
panel.add(posisiAC2);
posisiAC2.setBounds(250,390,80,20);
panel.add(posisiAC3);
posisiAC3.setBounds(375,390,50,20);

panel.add(lblSSID);
lblSSID.setBounds(10,410,120,20);
panel.add(SSID1);
SSID1.setBounds(125,410,110,20);
panel.add(SSID2);
SSID2.setBounds(250,410,50,20);

panel.add(lblbandhwith);
lblbandhwith.setBounds(10,430,120,20);
panel.add(bandhwith1);
bandhwith1.setBounds(125,430,100,20);
panel.add(bandhwith2);
bandhwith2.setBounds(250,430,120,20);

panel.add(lbljumlahCCTV);
lbljumlahCCTV.setBounds(10,450,120,20);
panel.add(txjumlahCCTV);
txjumlahCCTV.setBounds(130,450,100,20);

panel.add(lblposisiCCTV);
lblposisiCCTV.setBounds(10,470,120,20);
panel.add(posisiCCTV1);
posisiCCTV1.setBounds(125,470,80,20);
panel.add(posisiCCTV2);
posisiCCTV2.setBounds(250,470,90,20);

panel.add(lblx);
lblx.setBounds(10,490,120,20);


panel.add(lblk);
lblk.setBounds(10,510,120,20);
panel.add(lbll);
lbll.setBounds(10,520,120,20);
panel.add(lblm);
lblm.setBounds(10,540,120,20);
panel.add(lbln);
lbln.setBounds(10,560,120,20);
panel.add(lblo);
lblo.setBounds(10,580,120,20);
panel.add(x1);
x1.setBounds(125,600,80,20);
panel.add(x2);
x2.setBounds(250,600,80,20);

panel.add(lblsirkulasiudara);
lblsirkulasiudara.setBounds(10,500,120,20);
panel.add(sirkulasiudara1);
sirkulasiudara1.setBounds(125,620,80,20);
panel.add(sirkulasiudara2);
sirkulasiudara2.setBounds(250,620,110,40);

panel.add(lblpencahayaan);
lblpencahayaan.setBounds(10,640,120,20);
panel.add(txpencahayaan);
txpencahayaan.setBounds(130,640,100,20);

panel.add(lblkelembapan);
lblkelembapan.setBounds(10,660,120,20);
panel.add(txkelembapan);
txkelembapan.setBounds(130,660,100,20);

panel.add(lblsuhu);
lblsuhu.setBounds(10,680,90,20);
panel.add(txsuhu);
txsuhu.setBounds(130,680,100,20);

//InputKenyamananKelas
panel.add(lbls);
lbls.setBounds(10,700,120,20);
panel.add(s1);
s1.setBounds(125,700,50,20);
panel.add(s2);
sirkulasiudara2.setBounds(250,700,50,20);

panel.add(lbly);
lbly.setBounds(10,720,120,20);
panel.add(y1);
y1.setBounds(125,720,50,20);
panel.add(y2);
y2.setBounds(250,720,50,20);

panel.add(lblz);
lblz.setBounds(10,740,120,20);
panel.add(z1);
z1.setBounds(125,740,50,20);
panel.add(z2);
z2.setBounds(250,740,50,20);

panel.add(lbla);
lblsirkulasiudara.setBounds(10,760,120,20);
panel.add(a1);
a1.setBounds(125,760,50,20);
panel.add(a2);
a2.setBounds(250,760,50,20);

panel.add(lblb);
lblb.setBounds(10,790,120,20);
panel.add(b1);
b1.setBounds(125,790,50,20);
panel.add(b2);
b2.setBounds(250,790,50,20);

//InputKeamananKelas
panel.add(lblc);
lblc.setBounds(10,810,120,20);
panel.add(c1);
c1.setBounds(125,810,50,20);
panel.add(c2);
c2.setBounds(250,810,50,20);

panel.add(lbld);
lbld.setBounds(10,810,120,20);
panel.add(d1);
d1.setBounds(125,810,50,20);
panel.add(d2);
d2.setBounds(250,810,50,20);

panel.add(lble);
lble.setBounds(10,830,120,20);
panel.add(e1);
e1.setBounds(125,830,50,20);
panel.add(e2);
e2.setBounds(250,830,50,20);

panel.add(tblinsert);
tblinsert.setBounds(240,10,95,20);
panel.add(tblupdate);
tblupdate.setBounds(240,30,95,20);
panel.add(tbldelete);
tbldelete.setBounds(240,50,95,20);
setVisible(true);
//getContentPane().add(panel);
//JScrollPane scrollPane = new JScrollPane(panel);
//getContentPane().add(scrollPane, BorderLayout.CENTER); 
//setVisible(true);
}

//fungsi tombol
void AksiReaksi(){
tblinsert.addActionListener(new ActionListener(){
public void simpanActionPerform(java.awt.event.ActionEvent event) {	
}
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource()==tblinsert){
            try{
                 namaruang=txnamaruang.getText();
                 lokasiruang=txlokasiruang.getText();
                 namafakultas=txnamafakultas.getText();
                 panjang= txpanjang.getText();
                 lebar=txlebar.getText();
                 jumlahkursi=txjumlahkursi.getText();
                 jumlahjendela=txjumlahjendela.getText();
                 jumlahpintu=txjumlahpintu.getText();
                 jumlahstopkontak=txjumlahstopkontak.getText();
                 kondisistopkontak=txkondisistopkontak.getText();
                 
                if (posisistopkontak1.isSelected()==true)
                    posisistopkontak=posisistopkontak1.getText();
                if (posisistopkontak2.isSelected()==true)
                    posisistopkontak=posisistopkontak2.getText();
                
                jumlahLCD=txjumlahLCD.getText();
                
                if (kondisiLCD1.isSelected()==true)
                    kondisiLCD=kondisiLCD1.getText();
                 if (kondisiLCD2.isSelected()==true)
                    kondisiLCD=kondisiLCD2.getText();
                 if (posisiLCD1.isSelected()==true)
                    kondisiLCD=posisiLCD1.getText();
                 if (posisiLCD2.isSelected()==true)
                    kondisiLCD=posisiLCD2.getText();
                 
                jumlahlampu=txjumlahlampu.getText();
                 
                 
                 if (posisilampu1.isSelected()==true)
                    posisilampu=posisilampu1.getText();
                 if (posisilampu2.isSelected()==true)
                    posisilampu=posisilampu2.getText();
                 
                 jumlahkipas=txjumlahkipas.getText();
                 
                 if (posisikipas1.isSelected()==true)
                    posisilampu=posisikipas1.getText();
                 if (posisikipas2.isSelected()==true)
                    posisilampu=posisikipas2.getText();
                 
                jumlahAC= txjumlahAC.getText();
                 
                 
                 if (posisiAC1.isSelected()==true)
                    posisiAC=posisiAC1.getText();
                 if (posisiAC2.isSelected()==true)
                    posisiAC=posisiAC2.getText();
                 if (posisiAC3.isSelected()==true)
                    posisiAC=posisiAC3.getText();
                 
                 if (SSID1.isSelected()==true)
                    SSID=SSID1.getText();
                 if (SSID2.isSelected()==true)
                    SSID=SSID2.getText();
                 
                 if (bandhwith1.isSelected()==true)
                    bandhwith=bandhwith1.getText();
                 if (bandhwith2.isSelected()==true)
                    bandhwith=bandhwith2.getText();
                 
                 jumlahCCTV=txjumlahCCTV.getText();
                 
                  if (posisiCCTV1.isSelected()==true)
                    posisiCCTV=posisiCCTV1.getText();
                  if (posisiCCTV2.isSelected()==true)
                    posisiCCTV=posisiCCTV2.getText();
                   
                  if (x1.isSelected()==true)
                    x=x1.getText();
                  if (x2.isSelected()==true)
                    x=x2.getText();
                  
                  if (sirkulasiudara1.isSelected()==true)
                    sirkulasiudara=sirkulasiudara1.getText();
                  if (sirkulasiudara2.isSelected()==true)
                    sirkulasiudara=sirkulasiudara2.getText();
                  
                  if (s1.isSelected()==true)
                    s=s1.getText();
                  if (s2.isSelected()==true)
                    s=s2.getText();
                  
                  if (y1.isSelected()==true)
                    y=y1.getText();
                  if (y2.isSelected()==true)
                    y=y2.getText();
                  
                  if (z1.isSelected()==true)
                    z=z1.getText();
                  if (z2.isSelected()==true)
                    z=z2.getText();
                  
                  if (a1.isSelected()==true)
                    a=a1.getText();
                  if (a2.isSelected()==true)
                    a=a2.getText();
                  
                  if (b1.isSelected()==true)
                    b=b1.getText();
                  if (b2.isSelected()==true)
                    b=b2.getText();
                  
                  if (c1.isSelected()==true)
                    c=c1.getText();
                  if (c2.isSelected()==true)
                    c=c2.getText();
                  
                  if (d1.isSelected()==true)
                    d=d1.getText();
                  if (d2.isSelected()==true)
                    d=d2.getText();
                  
                  if (e1.isSelected()==true)
                    e=e1.getText();
                  if (e2.isSelected()==true)
                    e=e2.getText();
         String sql= "INSERT INTO ruangkelas VALUES ('"+ txnamaruang.getText()+"','"+ txlokasiruang.getText()+"', '"+ txnamafakultas.getText()+"', '"+ 
            txpanjang.getText()+"', '"+ txlebar.getText()+"','"+ txjumlahkursi.getText()+"','"+ txjumlahjendela.getText()+"','"+
            txjumlahpintu.getText()+"','"+ txjumlahstopkontak.getText()+"','"+ txkondisistopkontak.getText()+"','"+ 
            lblposisistopkontak.getText()+"','"+ txjumlahLCD.getText()+"','"+ lblkondisiLCD.getText()+"','"+ lblposisiLCD.getText()+"','"+
            txjumlahlampu.getText()+"', '"+ lblposisilampu.getText()+"','"+ txjumlahkipas.getText()+"','"+ lblposisikipas.getText()+"','"+
            txjumlahAC.getText()+"','"+ lblposisiAC.getText()+"','"+ lblSSID.getText()+"','"+ lblbandhwith.getText()+"','"+ txjumlahCCTV.getText()+"','"+
            lblposisiCCTV.getText()+"','"+ lblsirkulasiudara.getText()+"','"+ txpencahayaan.getText()+"','"+ txkelembapan.getText()+"','"+
            txsuhu.getText()+"','"+ lblx.getText()+"','"+ lbls.getText()+"','"+ lbly.getText()+"','"+ lblz.getText()+"','"+ 
            lbla.getText()+"','"+ lblb.getText()+"','"+ lblc.getText()+"','"+ lbld.getText()+"','"+ lble.getText()+"')";
    
    System.out.println(sql);
    KONEKSI a= new KONEKSI();
    Statement st = a.getConnection1();
    
   try{
       st.executeUpdate(sql);
       JOptionPane.showMessageDialog(null, "BERHASIL DITAMBAHKAN");

   }catch(Exception e){
       System.out.println("cetak");
       JOptionPane.showMessageDialog(null, "GAGAL");
   }
  }catch (Exception a){
    System.out.println("ERROR: "+a);
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
});

tblupdate.addActionListener(new ActionListener(){
public void simpanActionPerform(java.awt.event.ActionEvent event) {	
}
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource()==tblupdate){
         String sql= "update ruangkelas lokasiruang= '"+ txlokasiruang.getText()+"',namafakultas= '"+ txnamafakultas.getText()+"',panjang= '"+ 
            txpanjang.getText()+"',lebar= '"+ txlebar.getText()+"',jumlahkursi='"+ txjumlahkursi.getText()+"',jumlahjendela='"+ txjumlahjendela.getText()+"',jumlahpintu='"+
            txjumlahpintu.getText()+"',jumlahstopkontak='"+ txjumlahstopkontak.getText()+"',kondisistopkontak='"+ txkondisistopkontak.getText()+"',posisistopkontak='"+ 
            lblposisistopkontak.getText()+"',jumlahLCD='"+ txjumlahLCD.getText()+"',kondisiLCD='"+ lblkondisiLCD.getText()+"',posisiLCD='"+ lblposisiLCD.getText()+"',jumlahlampu='"+
            txjumlahlampu.getText()+"', '"+ lblposisilampu.getText()+"',jumlahkipas='"+ txjumlahkipas.getText()+"',posisikipas='"+ lblposisikipas.getText()+"',jumlahAC='"+
            txjumlahAC.getText()+"',posisiAC='"+ lblposisiAC.getText()+"',SSID='"+ lblSSID.getText()+"',bandhwith='"+ lblbandhwith.getText()+"',jumlahCCTV='"+ txjumlahCCTV.getText()+"',posisiCCTV='"+
            lblposisiCCTV.getText()+"',sirkulasiudara='"+ lblsirkulasiudara.getText()+"',pencahayaan='"+ lblpencahayaan.getText()+"',kelembapan='"+ lblkelembapan.getText()+"',suhu='"+
            lblsuhu.getText()+"',x='"+ lblx.getText()+"',s='"+ lbls.getText()+"',y='"+ lbly.getText()+"',z='"+ lblz.getText()+"',a='"+ 
            lbla.getText()+"',b='"+ lblb.getText()+"',c='"+ lblc.getText()+"',d='"+ lbld.getText()+"',e='"+ lble.getText()+"' WHERE ruangkelas LIKE namaruang='"+ txnamaruang.getText()+"'";
    
    System.out.println(sql);
    KONEKSI a= new KONEKSI();
    Statement st = a.getConnection1();
    
   try{
       st.executeUpdate(sql);
       JOptionPane.showMessageDialog(null, "BERHASIL DIEDIT");
   }catch(Exception e){
       System.out.println("cetak");
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
});

tbldelete.addActionListener(new ActionListener(){
public void simpanActionPerform(java.awt.event.ActionEvent event) {
}
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource()==tbldelete){
         String sql= "update ruangkelas lokasiruang= '"+ txlokasiruang.getText()+"',namafakultas= '"+ txnamafakultas.getText()+"',panjang= '"+ 
            txpanjang.getText()+"',lebar= '"+ txlebar.getText()+"',jumlahkursi='"+ txjumlahkursi.getText()+"',jumlahjendela='"+ txjumlahjendela.getText()+"',jumlahpintu='"+
            txjumlahpintu.getText()+"',jumlahstopkontak='"+ txjumlahstopkontak.getText()+"',kondisistopkontak='"+ txkondisistopkontak.getText()+"',posisistopkontak='"+ 
            lblposisistopkontak.getText()+"',jumlahLCD='"+ txjumlahLCD.getText()+"',kondisiLCD='"+ lblkondisiLCD.getText()+"',posisiLCD='"+ lblposisiLCD.getText()+"',jumlahlampu='"+
            txjumlahlampu.getText()+"', '"+ lblposisilampu.getText()+"',jumlahkipas='"+ txjumlahkipas.getText()+"',posisikipas='"+ lblposisikipas.getText()+"',jumlahAC='"+
            txjumlahAC.getText()+"',posisiAC='"+ lblposisiAC.getText()+"',SSID='"+ lblSSID.getText()+"',bandhwith='"+ lblbandhwith.getText()+"',jumlahCCTV='"+ txjumlahCCTV.getText()+"',posisiCCTV='"+
            lblposisiCCTV.getText()+"',sirkulasiudara='"+ lblsirkulasiudara.getText()+"',pencahayaan='"+ lblpencahayaan.getText()+"',kelembapan='"+ lblkelembapan.getText()+"',suhu='"+
            lblsuhu.getText()+"',x='"+ lblx.getText()+"',s='"+ lbls.getText()+"',y='"+ lbly.getText()+"',z='"+ lblz.getText()+"',a='"+ 
            lbla.getText()+"',b='"+ lblb.getText()+"',c='"+ lblc.getText()+"',d='"+ lbld.getText()+"',e='"+ lble.getText()+"' WHERE ruangkelas LIKE namaruang='"+ txnamaruang.getText()+"'";
    
    System.out.println(sql);
    KONEKSI a= new KONEKSI();
    Statement st = a.getConnection1();
    
   try{
       st.executeUpdate(sql);
       JOptionPane.showMessageDialog(null, "BERHASIL DIEDIT");
   }catch(Exception e){
       System.out.println("cetak");
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
});

}
public static void main(String [] args){ 
inputbaru ap=new inputbaru();
ap.komponenVisual();
ap.AksiReaksi();
  }
}

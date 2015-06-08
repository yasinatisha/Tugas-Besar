package tugasbesar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tampil extends JFrame {
JMenuBar menu=new JMenuBar(); 
JMenuItem logout=new JMenu("Logout");

String[] headers= {"namaruang","lokasiruang","namafakultas","panjang","lebar",
        "jumlahkursi","jumlahjendela","jumlahpintu","jumlahstopkontak","kondisistopkontak",
        "posisistopkontak","jumlahLCD","kondisiLCD","posisiLCD","jumlahlampu","posisilampu",
        "jumlahkipas","posisikipas","jumlahAC","posisiAC","SSID","bandwidth","jumlahCCTV",
        "posisiCCTV","sirkulasiudara","pencahayaan","kelembapan","suhu",
        "x","s","y","z","a","b","c","d","e"};

Object[][] data=new Object[0][0];
JTable tableView;
int n;

Tampil(){
super("View Data");
setLocation(200,100);
setSize(300,100);
setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
}
void KomponenVisual(){
setJMenuBar(menu);
menu.add(logout);     
    
tableView=new JTable(data,headers);
JScrollPane scrollpane=new JScrollPane(tableView);
scrollpane.setPreferredSize(new Dimension(500,80));
getContentPane().setLayout(new BorderLayout());
getContentPane().add(BorderLayout.CENTER,scrollpane);
pack();
setVisible(true);
}

void KoneksiDatabase(){
try{
String sql="select * from ruangkelas";
    KONEKSI a= new KONEKSI();
    Statement st = a.getConnection1();

ResultSet rs=st.executeQuery(sql);
rs.last();
n=rs.getRow();
data=new Object[n][37];
int p=0;
rs.beforeFirst();
while(rs.next()){
data[p][0]=rs.getString(1);
data[p][1]=rs.getString(2);
data[p][2]=rs.getString(3);
data[p][3]=rs.getString(4);
data[p][4]=rs.getString(5);
data[p][5]=rs.getString(6);
data[p][6]=rs.getString(7);
data[p][7]=rs.getString(8);
data[p][8]=rs.getString(9);
data[p][9]=rs.getString(10);
data[p][10]=rs.getString(11);
data[p][11]=rs.getString(12);
data[p][12]=rs.getString(13);
data[p][13]=rs.getString(14);
data[p][14]=rs.getString(15);
data[p][15]=rs.getString(16);
data[p][16]=rs.getString(17);
data[p][17]=rs.getString(18);
data[p][18]=rs.getString(19);
data[p][19]=rs.getString(20);
data[p][20]=rs.getString(21);
data[p][21]=rs.getString(22);
data[p][22]=rs.getString(23);
data[p][23]=rs.getString(24);
data[p][24]=rs.getString(25);
data[p][25]=rs.getString(26);
data[p][26]=rs.getString(27);
data[p][27]=rs.getString(28);
data[p][28]=rs.getString(29);
data[p][29]=rs.getString(30);
data[p][30]=rs.getString(31);
data[p][31]=rs.getString(32);
data[p][32]=rs.getString(33);
data[p][33]=rs.getString(34);
data[p][34]=rs.getString(35);
data[p][35]=rs.getString(36);
data[p][36]=rs.getString(37);
p++;
}st.close();
}catch(Exception DBException){
System.err.println("Error : "+DBException);
}
}
public static void main(String args[]){
Tampil td=new Tampil();
td.KoneksiDatabase();
td.KomponenVisual();
}
}



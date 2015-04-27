package tugasbesar;

import java.util.Scanner;
public class ControlKelas {
     public static void main(String[] args){
        int x;
        RuangKelas[]Gedung;
        Gedung = new RuangKelas[3];
     }
public ControlKelas(){
    
}
//void InsertIndentitasRuangKelas(){
//     int x;
//     RuangKelas[]Gedung;
//     Gedung = new RuangKelas[1];
//        for(x=0; x<Gedung.length; x++){
//        Gedung[x]= new RuangKelas();
//        Scanner in= new Scanner (System.in);
//        System.out.println("Nama Ruang: ");
//        Gedung[x].setNamaruang(in.next());
//        System.out.println("Lokasi Ruangan: ");
//        Gedung[x].setLokasiruang(in.next());
//        System.out.println("Nama Fakultas: ");
//        Gedung[x].setNamafakultas(in.next());
//      }
//    }
//void KondisiRuangKelas(){
//    int x;
//     RuangKelas[]Gedung;
//     Gedung = new RuangKelas[1];
//        for(x=0; x<Gedung.length; x++){
//        Gedung[x]= new RuangKelas();
//        Scanner in= new Scanner (System.in);
//        System.out.println("Jumlah Panjanng: ");
//        Gedung[x].setPanjang(in.nextInt());
//        System.out.println("Jumlah Lebar: ");
//        Gedung[x].setLebar(in.nextInt());
//        System.out.println("Jumlah Pintu: ");
//        Gedung[x].setJumlahpintu(in.nextInt());
//        System.out.println("Jumlah Kursi: ");
//        Gedung[x].setJumlahkursi(in.nextInt());
//        System.out.println("Jumalah Jendela: ");
//        Gedung[x].setJumlahjendela(in.nextInt());
//        }
//       }
//void LingkunganKelas(){
//    
//    System.out.println("KOndisi Lantai");
//    System.out.println("Kondisi Pintu");
//    System.out.println("Kondisi Jendela");
//    System.out.println("Kondisi Atap");
//    System.out.println("Kondisi Dinding");
//    int x = 0;
//    if (x==1){
//        System.out.println("Bersih");
//    }
//    if (x==2){
//        System.out.println("Kotor");
//    }
//    
//   }
//}
  
void InsertIndentitasRuangKelas(){
     int x;
     RuangKelas[]Gedung;
     Gedung = new RuangKelas[1];
        for(x=0; x<Gedung.length; x++){
        Gedung[x]= new RuangKelas();
        Scanner in= new Scanner (System.in);
        System.out.println("Nama Ruang: ");
        Gedung[x].setNamaruang(in.next());
        System.out.println("Lokasi Ruangan: ");
        Gedung[x].setLokasiruang(in.next());
        System.out.println("Nama Fakultas: ");
        Gedung[x].setNamafakultas(in.next());
      }
    }
void KondisiRuangKelas(){
    int x;
     RuangKelas[]Gedung;
     Gedung = new RuangKelas[1];
        for(x=0; x<Gedung.length; x++){
        Gedung[x]= new RuangKelas();
        Scanner in= new Scanner (System.in);
        System.out.println("Jumlah Panjanng: ");
        Gedung[x].setPanjang(in.nextInt());
        System.out.println("Jumlah Lebar: ");
        Gedung[x].setLebar(in.nextInt());
        System.out.println("Jumlah Pintu: ");
        Gedung[x].setJumlahpintu(in.nextInt());
        System.out.println("Jumlah Kursi: ");
        Gedung[x].setJumlahkursi(in.nextInt());
        System.out.println("Jumalah Jendela: ");
        Gedung[x].setJumlahjendela(in.nextInt());
        
        Gedung[x].hitungluas();
        Gedung[x].hitungrasio();
                
        }
       }
void LingkunganKelas(){
    
    int v;
  	Scanner in= new Scanner (System.in);
    System.out.println("KOndisi Lantai");
    System.out.println("Kondisi Pintu");
    System.out.println("Kondisi Jendela");
    System.out.println("Kondisi Atap");
    System.out.println("Kondisi Dinding");
    System.out.println("1.  bersih");
    System.out.println("2.  kotor ");
    v = in.nextInt();
    if (v==1){
        System.out.println("sesuai");
    }
    if (v==2){
        System.out.println("tidak sesuai");
    }
    
   }
   
  void kenyamananKelas(){
  	int x,y,z,a,b;
  	Scanner in= new Scanner (System.in);
    System.out.println("Kebisingan");
    System.out.println("1.  bising");
    System.out.println("2.  tidak bising ");
    x = in.nextInt();
    System.out.println("Bau");
    System.out.println("1.  bau");
    System.out.println("2.  tidak bau ");
    y = in.nextInt();
    System.out.println("Kebocoran");
    System.out.println("1.  bocor");
    System.out.println("2.  tidak bocor ");
    z = in.nextInt();
    System.out.println("Kerusakan");
    System.out.println("1.  rusak");
    System.out.println("2.  tidak rusak ");
    a = in.nextInt();
    System.out.println("Keausan");
	System.out.println("1.  aus");
    System.out.println("2.  tidak aus "); 
    b = in.nextInt();
    
    if (x==1 && y==1 && z==1 && a==1 && b==1){
        System.out.println("tidak sesuai");
    }
    if (x==2 && y==2 && z==2 && a==2 && b==2){
        System.out.println("sesuai");
    }
  }
  
  
  void keamananKelas(){
  	int c,d,e;
    Scanner in= new Scanner (System.in);
    System.out.println("Kekokohan");
    System.out.println("1.  kokoh");
    System.out.println("2.  tidak kokoh ");
    c = in.nextInt();
    System.out.println("Kunci Pintu dan jendela");
    System.out.println("1.  ada");
    System.out.println("2.  tidak ada ");
    d = in.nextInt();
    System.out.println("Bahaya");
    System.out.println("1.  aman");
    System.out.println("2.  tidak aman ");
    e = in.nextInt();
    if (c==1 && d==1 && e==1 ){
        System.out.println("sesuai");
    }
    if (c==2 && d==2 && e==2){
        System.out.println("tidak sesuai");
    }
     
  }
   
}

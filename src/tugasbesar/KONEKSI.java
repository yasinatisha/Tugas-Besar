package tugasbesar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KONEKSI {
    //Untuk koneksi ke MySQL
        private String userid ="root";
        private String password ="";

   //silahkan diganti url-nya, tapi tergantung nama databasenya
   //formatnya: “jdbc:tipeDatabase://server:port/namaDatabase”
        String url = "jdbc:mysql://localhost/inventaris_kelas";
        public static Connection con; 

public KONEKSI(){
        getConnection();
    }
    
public Connection getConnection(){
    try {
        Class.forName("com.mysql.jdbc.Driver"); 
    }
    catch (java.lang.ClassNotFoundException e){
    System.err.print("Koneksi dengan Datagase gagal: ");
    System.err.println(e.getException());
    }
    try {
    con = DriverManager.getConnection(url, userid,password);
    System.out.println("Konek");
}catch(SQLException e) {
System.err.println("ID dan Password Anda gagal " + e.getMessage());
}
return con;
}
Statement stm = null;
public Statement getConnection1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KONEKSI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con= DriverManager.getConnection(url, userid,password);
        } catch (SQLException ex) {
            Logger.getLogger(KONEKSI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stm= con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(KONEKSI.class.getName()).log(Level.SEVERE, null, ex);
        }
       return stm;
    }
public static Connection getkoneksi(){
    if(con == null){
        try{
            String url = new String();
            String user = new String();
            String password = new String();
            url= "jdbc:mysql://localhost/inventaris_kelas";
            user = "root";
            password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url,user,password);
        }catch(SQLException t){
            System.out.println(t);
        }
    }
    return con;
}
public static void main(String[] args){
new KONEKSI();
}}


package tugasbesar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class login extends JFrame {
login(){
setTitle("LOGIN");
setLocation(200,100);
setSize(450,120);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}

JPanel panel=new JPanel();   
JLabel lbluser =new JLabel("Username");
JTextField txuser=new JTextField("");
JLabel lblpass=new JLabel("password");
JTextField txpass=new JTextField("");
JButton login=new JButton("Login");

String user = "";
String pass = "";

void komponenVisual(){
add(panel);
panel.setLayout(null);

//InputIndentitasRuangKelas
panel.add(lbluser);
//(maju,bawah,panjang,bawah/lebar)
lbluser.setBounds(10,10,120,20);
panel.add(txuser);
txuser.setBounds(130,10,100,20);

panel.add(lblpass);
lblpass.setBounds(10,30,120,20);
panel.add(txpass);
txpass.setBounds(130,30,100,20);

panel.add(login);
login.setBounds(240,10,95,20);

getContentPane().add(panel);
setVisible(true);
}

void AksiReaksi(){
login.addActionListener(new ActionListener(){
public void simpanActionPerform(java.awt.event.ActionEvent event) {
    if (event.getSource()==login){
    }
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(txuser.getText().trim().equals("admin") && txpass.getText().trim().equals("admin")){
inputbaru a= new inputbaru();
a.setVisible(true);
a.komponenVisual();
   JOptionPane.showMessageDialog(null,"Login berhasil");
    }else{
     JOptionPane.showMessageDialog(null,"Login gagal");
    }
 }
});
}

public static void main(String[] args){
   login a = new login();
   a.komponenVisual();
   a.AksiReaksi();
  }
}


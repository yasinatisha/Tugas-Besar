/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasbesar;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	login panel1 = new login();
	inputbaru panel2 = new inputbaru();
//	Framedua panel3 = new Framedua();
	
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 407);
		setContentPane(panel1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(186, 176, 203, 65);
		panel1.add(btnNewButton);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//fungsi login belum di masukkan dan bisa menggunakan method login 
				getContentPane().remove(panel1);
				setContentPane(panel2);
				revalidate();
				repaint();
			}
			
			
		});
		
//		JButton btnBack = new JButton("BACK");
//		btnBack.setBounds(160, 507, 114, 62);
//		panel2.add(btnBack);
//		btnBack.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// Fungsi tombol back kembali ke panel Framesatu
//				getContentPane().remove(panel2);
//				setContentPane(panel1);
//				revalidate();
//				repaint();
//				
//			}
//		});
//		JButton btnSave = new JButton("SAVE");
//		btnSave.setBounds(300, 507, 114, 62);
//		panel2.add(btnSave);
//		btnSave.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// Fungsi Tombol save belum di masukkan
//				getContentPane().remove(panel2);
//				setContentPane(panel1);
//				revalidate();
//				repaint();
//			}
//		});
	}

}



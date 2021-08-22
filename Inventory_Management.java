package IMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Inventory_Management extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory_Management frame = new Inventory_Management();
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
	public Inventory_Management() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("MENU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Action invoked on the click of Menu button in Home screen
				JFrame jframe = new JFrame();
				jframe.dispose();
				Menu menu=null;
				try {
					menu = new Menu();//Redirecting to Menu tab.
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				menu.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 33));
		btnNewButton.setBounds(448, 457, 228, 60);
		contentPane.add(btnNewButton);
		
		JTextArea txtrCarInventoryManagement = new JTextArea();//Text area to display the Company name
		txtrCarInventoryManagement.setBackground(Color.LIGHT_GRAY);
		txtrCarInventoryManagement.setEditable(false);
		txtrCarInventoryManagement.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 60));
		txtrCarInventoryManagement.setText("Automotive Dealership Inventory System");
		txtrCarInventoryManagement.setBounds(77, 219, 1021, 94);
		contentPane.add(txtrCarInventoryManagement);
		
		JLabel lblNewLabel = new JLabel("");//setting up the background image
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setIcon(new ImageIcon(Inventory_Management.class.getResource("/IMS/1.jpg")));
		lblNewLabel.setBounds(0, -20, 1186, 683);
		contentPane.add(lblNewLabel);
	}
}

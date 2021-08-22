package IMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JPanel aPanel;
	private JPanel sPanel;
	private JTextField txtInternalJframe;
	private JInternalFrame allFrame;
	private JInternalFrame searchFrame;
	private JInternalFrame addFrame;
	private JInternalFrame updateFrame;
	private JInternalFrame deleteFrame;
	
	//All Inventory
	JTextArea tbCarId = new JTextArea();
	JTextArea tbModel = new JTextArea();
	JTextArea tbBrand = new JTextArea();
	JTextArea tbMileage = new JTextArea();
	JTextArea tbCost = new JTextArea();
	
	//Search Inventory
	JTextArea stbCarId = new JTextArea();
	JTextArea stbModel = new JTextArea();
	JTextArea stbBrand = new JTextArea();
	JTextArea stbMileage = new JTextArea();
	JTextArea stbCost = new JTextArea();
	
	//Add Inventory
	JTextArea atbCarId = new JTextArea();
	JTextArea atbModel = new JTextArea();
	JTextArea atbBrand = new JTextArea();
	JTextArea atbMileage = new JTextArea();
	JTextArea atbCost = new JTextArea();
	
	//Updt Inventory
	JTextArea utbCarId = new JTextArea();
	JTextArea utbModel = new JTextArea();
	JTextArea utbBrand = new JTextArea();
	JTextArea utbMileage = new JTextArea();
	JTextArea utbCost = new JTextArea();
	
	//Delete Inventory
	JTextArea dtbCarId = new JTextArea();
	JTextArea dtbModel = new JTextArea();
	JTextArea dtbBrand = new JTextArea();
	JTextArea dtbMileage = new JTextArea();
	JTextArea dtbCost = new JTextArea();
	
	ButtonGroup pdbg = new ButtonGroup();
	private final JLabel lblNewLabel_2 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	@SuppressWarnings("unchecked")
	public Menu() throws PropertyVetoException {
		setAutoRequestFocus(false);
		setResizable(false);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);//setting the area bounds
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));//setting background
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setPreferredSize(new Dimension(1600, 1000));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ArrayList<CarDetail> data = CarDetailList.CarDetail();//loading the input data from the model class for using it across the application
		
		/*
		 * lblNewLabel_2.setEnabled(false);
		 * lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		 * lblNewLabel_2.setBackground(new Color(240, 240, 240));
		 * lblNewLabel_2.setIcon(new
		 * ImageIcon(Inventory_Management.class.getResource("/IMS/2.jpg")));
		 * lblNewLabel_2.setBounds(251, 0, 935, 662); contentPane.add(lblNewLabel_2);
		 */
		
		//All Inventory
		JButton btnNewButton = new JButton("All Inventory");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {//calling All Inventory Internal Jframe
				if(null!=searchFrame && searchFrame.isShowing()){//To close other open internal Jframes
					searchFrame.dispose();
				}
				
				if(null!=addFrame && addFrame.isShowing()){//To close other open internal Jframes
					addFrame.dispose();
				}
				
				if(null!=updateFrame && updateFrame.isShowing()){//To close other open internal Jframes
					updateFrame.dispose();
				}
				
				if(null!=deleteFrame && deleteFrame.isShowing()){//To close other open internal Jframes
					deleteFrame.dispose();
				}
				
				allFrame = new JInternalFrame("All Inventory");//setting up internal jframe
				allFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//((Frame) allFrame).setExtendedState(JFrame.MAXIMIZED_BOTH);
				//allFrame.setBounds(295, 10, 1600, 1000);295, 10, 881, 643
				allFrame.setBounds(295, 10, 881, 643);
				contentPane.add(allFrame);
				allFrame.getContentPane().setLayout(null);
				allFrame.setVisible(true);
				
				JLabel lblNewLabel_1 = new JLabel("CAR ID");//creating Car ID label
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1.setForeground(Color.BLACK);
				lblNewLabel_1.setBounds(10, 72, 103, 41);
				allFrame.getContentPane().add(lblNewLabel_1);
				
				tbCarId.setBounds(10, 128, 103, 476);//setting the text area to display values for that corresponding label
				tbCarId.setFont(new Font("Arial",Font.BOLD,20));
				tbCarId.setEditable(true);
				allFrame.getContentPane().add(tbCarId);
				
				JLabel lblNewLabel_1_1 = new JLabel("MODEL NAME");//creating Model Name label
				lblNewLabel_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1.setBounds(139, 72, 248, 41);
				allFrame.getContentPane().add(lblNewLabel_1_1);
				
				tbModel.setBounds(139, 128, 248, 476);//setting the text area to display values for that corresponding label
				tbModel.setFont(new Font("Arial",Font.BOLD,20));
				tbModel.setEditable(false);
				allFrame.getContentPane().add(tbModel);
				
				JLabel lblNewLabel_1_1_1 = new JLabel("BRAND");//creating Brand label
				lblNewLabel_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1.setBounds(413, 72, 129, 41);
				allFrame.getContentPane().add(lblNewLabel_1_1_1);
				
				tbBrand.setBounds(413, 128, 129, 476);//setting the text area to display values for that corresponding label
				tbBrand.setFont(new Font("Arial",Font.BOLD,20));
				tbBrand.setEditable(false);
				allFrame.getContentPane().add(tbBrand);
				
				JLabel lblNewLabel_1_1_1_1 = new JLabel("MILEAGE");//creating Mileage label
				lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1.setBounds(567, 72, 129, 41);
				allFrame.getContentPane().add(lblNewLabel_1_1_1_1);
				
				tbMileage.setBounds(567, 128, 129, 476);//setting the text area to display values for that corresponding label
				tbMileage.setFont(new Font("Arial",Font.BOLD,20));
				tbMileage.setEditable(false);
				allFrame.getContentPane().add(tbMileage);
				
				JLabel lblNewLabel_1_1_1_1_1 = new JLabel("PRICE");//creating Price labels
				lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1_1.setBounds(730, 72, 129, 41);
				allFrame.getContentPane().add(lblNewLabel_1_1_1_1_1);
				
				tbCost.setBounds(716, 128, 129, 476);//setting the text area to display values for that corresponding label
				tbCost.setFont(new Font("Arial",Font.BOLD,20));
				tbCost.setEditable(false);
				allFrame.getContentPane().add(tbCost);
				
				JComboBox comboBox = new JComboBox();//creating a combo box to have a drop down set of values
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//action performed based on the selected sort by option
						
						String s = (String)comboBox.getSelectedItem();
						
						 if(s.equalsIgnoreCase("CAR ID")){
							  Collections.sort(data,CarDetail.carIdComparator); //using car ID comparator
							  Print(data, tbCarId, tbModel, tbBrand, tbMileage,tbCost); 
						}else if(s.equalsIgnoreCase("MODEL NAME")) {
							  Collections.sort(data,CarDetail.modelComparator); //using model comparator
							  Print(data, tbCarId, tbModel, tbBrand, tbMileage,tbCost);
						}else if(s.equalsIgnoreCase("BRAND")) {//using brand comparator
							  Collections.sort(data,CarDetail.brandComparator); 
							  Print(data, tbCarId, tbModel, tbBrand, tbMileage,tbCost);
						}else if(s.equalsIgnoreCase("MILEAGE")) {//using mileage comparator
							  Collections.sort(data,CarDetail.mileageComparator); 
							  Print(data, tbCarId, tbModel, tbBrand, tbMileage,tbCost);
						}else if(s.equalsIgnoreCase("PRICE")) {//using price comparator
							  Collections.sort(data,CarDetail.costComparator); 
							  Print(data, tbCarId, tbModel, tbBrand, tbMileage,tbCost);
						}
					}
				});
				comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"CAR ID", "MODEL NAME", "BRAND", "MILEAGE", "PRICE"}));//setting values to be displayed in dropdown
				comboBox.setBounds(738, 21, 103, 41);
				comboBox.setSelectedIndex(0);
				allFrame.getContentPane().add(comboBox);
				
				JLabel lblNewLabel = new JLabel("Sort By");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblNewLabel.setBounds(664, 21, 69, 41);
				allFrame.getContentPane().add(lblNewLabel);
				
				aPanel = new JPanel();
				aPanel.setBackground(Color.LIGHT_GRAY);
				aPanel.setBounds(0, 0, 869, 614);
				allFrame.getContentPane().add(aPanel);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(36, 91, 205, 53);
		contentPane.add(btnNewButton);
		
		//Search
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//calling Search Internal Jframe
				
				if(null!=allFrame && allFrame.isShowing()){//To close other open internal Jframes
					allFrame.dispose();
				}
				
				if(null!=addFrame && addFrame.isShowing()){//To close other open internal Jframes
					addFrame.dispose();
				}
				
				if(null!=updateFrame && updateFrame.isShowing()){//To close other open internal Jframes
					updateFrame.dispose();
				}
				
				if(null!=deleteFrame && deleteFrame.isShowing()){//To close other open internal Jframes
					deleteFrame.dispose();
				}
				
				searchFrame = new JInternalFrame("Search");
				searchFrame.setBounds(295, 10, 881, 643);
				contentPane.add(searchFrame);
				
				searchFrame.setVisible(true);
				searchFrame.getContentPane().setLayout(null);
				
				JLabel lblNewLabel_1 = new JLabel("CAR ID");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1.setForeground(Color.BLACK);
				lblNewLabel_1.setBounds(10, 77, 103, 41);
				searchFrame.getContentPane().add(lblNewLabel_1);
				
				stbCarId.setBounds(10, 128, 103, 476);
				stbCarId.setFont(new Font("Arial",Font.BOLD,20));
				stbCarId.setEditable(false);
				searchFrame.getContentPane().add(stbCarId);
				
				JLabel lblNewLabel_1_1 = new JLabel("MODEL NAME");
				lblNewLabel_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1.setBounds(133, 77, 248, 41);
				searchFrame.getContentPane().add(lblNewLabel_1_1);
				
				stbModel.setBounds(133, 128, 248, 476);
				stbModel.setFont(new Font("Arial",Font.BOLD,20));
				stbModel.setEditable(false);
				searchFrame.getContentPane().add(stbModel);
				
				JLabel lblNewLabel_1_1_1 = new JLabel("BRAND");
				lblNewLabel_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1.setBounds(404, 77, 129, 41);
				searchFrame.getContentPane().add(lblNewLabel_1_1_1);
				
				stbBrand.setBounds(404, 128, 129, 476);
				stbBrand.setFont(new Font("Arial",Font.BOLD,20));
				stbBrand.setEditable(false);
				searchFrame.getContentPane().add(stbBrand);
				
				JLabel lblNewLabel_1_1_1_1 = new JLabel("MILEAGE");
				lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1.setBounds(561, 77, 129, 41);
				searchFrame.getContentPane().add(lblNewLabel_1_1_1_1);
				
				stbMileage.setBounds(561, 128, 129, 476);
				stbMileage.setFont(new Font("Arial",Font.BOLD,20));
				stbMileage.setEditable(false);
				searchFrame.getContentPane().add(stbMileage);
				
				JLabel lblNewLabel_1_1_1_1_1 = new JLabel("PRICE");
				lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1_1.setBounds(718, 77, 129, 41);
				searchFrame.getContentPane().add(lblNewLabel_1_1_1_1_1);
				
				stbCost.setBounds(718, 128, 129, 476);
				stbCost.setFont(new Font("Arial",Font.BOLD,20));
				stbCost.setEditable(false);
				searchFrame.getContentPane().add(stbCost);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"CAR ID", "MODEL NAME", "BRAND", "MILEAGE", "PRICE"}));
				comboBox.setBounds(10, 10, 171, 41);
				searchFrame.getContentPane().add(comboBox);
				
				JTextArea stextArea = new JTextArea();
				stextArea.setBounds(196, 10, 484, 41);
				stextArea.setFont(new Font("Arial",Font.PLAIN,25));
				searchFrame.getContentPane().add(stextArea);
				
				JButton btnNewButton_5 = new JButton("Search");
				btnNewButton_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						stbCarId.setText(null); stbModel.setText(null); stbBrand.setText(null); stbMileage.setText(null); stbCost.setText(null);
						int count=0;
						String selected = (String) comboBox.getSelectedItem();
						
						if(selected.equalsIgnoreCase("CAR ID")){
							try {
								count=searchPrint(data, stextArea.getText(), selected, stbCarId, stbModel, stbBrand, stbMileage, stbCost);
								if(count == 0){//No match Result
									throw new exceptionMsg("No matches for "+ selected +" = " + stextArea.getText());
								}
							}catch(Exception exp) {//Exception Handling for wrong Format
								if(exp.getMessage()!=null) {
									JLabel msg= new JLabel("Wrong Format");
									msg.setFont(new Font("Arial",Font.BOLD,15));
									JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
								}
								
							}
						}else if(selected.equalsIgnoreCase("MODEL NAME")) {
							try {
								count=searchPrint(data, stextArea.getText(), selected, stbCarId, stbModel, stbBrand, stbMileage, stbCost);
								if(count == 0){//No match Result
									throw new exceptionMsg("No matches for "+ selected +" = " + stextArea.getText());
								}
							}catch(Exception exp) {//Exception Handling for wrong Format
								if(exp.getMessage()!=null) {
									JLabel msg= new JLabel("Wrong Format");
									msg.setFont(new Font("Arial",Font.BOLD,15));
									JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
								}
								
							}
						}else if(selected.equalsIgnoreCase("BRAND")) {
							try {
								String val = toFindInputVal(stextArea.getText());
								if(val.equalsIgnoreCase("Integer")) {
									throw new exceptionMsg("Wrong Format");
								}else {
									count=searchPrint(data, stextArea.getText(), selected, stbCarId, stbModel, stbBrand, stbMileage, stbCost);
									if(count == 0){//No match Result
										throw new exceptionMsg("No matches for "+ selected +" = " + stextArea.getText());
									}
								}							
								
							}catch(Exception exp) {//Exception Handling for wrong Format
								if(exp.getMessage()!=null) {
									JLabel msg= new JLabel("Wrong Format");
									msg.setFont(new Font("Arial",Font.BOLD,15));
									JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
								}
								
							}
						}else if(selected.equalsIgnoreCase("MILEAGE")) {
							try {
								count=searchPrint(data, stextArea.getText(), selected, stbCarId, stbModel, stbBrand, stbMileage, stbCost);
								if(count == 0){//No match Result
									throw new exceptionMsg("No matches for "+ selected +" = " + stextArea.getText());
								}
							}catch(Exception exp) {//Exception Handling for wrong Format
								if(exp.getMessage()!=null) {
									JLabel msg= new JLabel("Wrong Format");
									msg.setFont(new Font("Arial",Font.BOLD,15));
									JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
								}
								
							}
						}else if(selected.equalsIgnoreCase("PRICE")) {
							try {
								count=searchPrint(data, stextArea.getText(), selected, stbCarId, stbModel, stbBrand, stbMileage, stbCost);
								if(count == 0){//No match Result
									throw new exceptionMsg("No matches for "+ selected +" = " + stextArea.getText());
								}
							}catch(Exception exp) {//Exception Handling for wrong Format
								if(exp.getMessage()!=null) {
									JLabel msg= new JLabel("Wrong Format");
									msg.setFont(new Font("Arial",Font.BOLD,15));
									JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
								}
								
							}
						}
						//stextArea.setText(null);
					}
				});
				btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton_5.setBounds(718, 10, 103, 41);
				searchFrame.getContentPane().add(btnNewButton_5);
				
				sPanel = new JPanel();
				sPanel.setBackground(Color.LIGHT_GRAY);
				sPanel.setBounds(0, 0, 869, 614);
				searchFrame.getContentPane().add(sPanel);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(36, 176, 205, 53);
		contentPane.add(btnNewButton_1);
		
		//Insert
		JButton btnNewButton_2 = new JButton("Insert");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//calling Insert Internal Jframe
				
				if(null!=allFrame && allFrame.isShowing()){//To close other open internal Jframes
					allFrame.dispose();
				}
				
				if(null!=searchFrame && searchFrame.isShowing()){//To close other open internal Jframes
					searchFrame.dispose();
				}
				
				if(null!=updateFrame && updateFrame.isShowing()){//To close other open internal Jframes
					updateFrame.dispose();
				}
				
				if(null!=deleteFrame && deleteFrame.isShowing()){//To close other open internal Jframes
					deleteFrame.dispose();
				}
				
				deleteFrame = new JInternalFrame("Insert");
				deleteFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
				deleteFrame.setBounds(295, 10, 881, 643);
				contentPane.add(deleteFrame);
				
				deleteFrame.setVisible(true);
				deleteFrame.getContentPane().setLayout(null);
				
				JLabel lblNewLabel_1_2 = new JLabel("CAR ID");
				lblNewLabel_1_2.setForeground(Color.BLACK);
				lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_2.setBounds(76, 115, 103, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_2);
				
				JLabel lblNewLabel_1_1 = new JLabel("MODEL NAME");
				lblNewLabel_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1.setBounds(76, 185, 185, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_1);
				
				JLabel lblNewLabel_1_1_1 = new JLabel("BRAND");
				lblNewLabel_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1.setBounds(76, 250, 129, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_1_1);
				
				JLabel lblNewLabel_1_1_1_1 = new JLabel("MILEAGE");
				lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1.setBounds(76, 314, 129, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_1_1_1);
				
				JLabel lblNewLabel_1_1_1_1_1 = new JLabel("PRICE");
				lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1_1.setBounds(76, 373, 129, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_1_1_1_1);
				
				JTextArea atbCarId = new JTextArea();
				atbCarId.setFont(new Font("Arial", Font.PLAIN, 25));
				atbCarId.setBounds(274, 115, 484, 41);
				deleteFrame.getContentPane().add(atbCarId);
				
				JTextArea atbModel = new JTextArea();
				atbModel.setFont(new Font("Arial", Font.PLAIN, 25));
				atbModel.setBounds(274, 185, 484, 41);
				deleteFrame.getContentPane().add(atbModel);
				
				JTextArea atbBrand = new JTextArea();
				atbBrand.setFont(new Font("Arial", Font.PLAIN, 25));
				atbBrand.setBounds(274, 250, 484, 41);
				deleteFrame.getContentPane().add(atbBrand);
				
				JTextArea atbMileage = new JTextArea();
				atbMileage.setFont(new Font("Arial", Font.PLAIN, 25));
				atbMileage.setBounds(274, 314, 484, 41);
				deleteFrame.getContentPane().add(atbMileage);
				
				JTextArea atbCost = new JTextArea();
				atbCost.setFont(new Font("Arial", Font.PLAIN, 25));
				atbCost.setBounds(274, 373, 484, 41);
				deleteFrame.getContentPane().add(atbCost);
				
				
				
				JButton btnNewButton_5_1 = new JButton("Insert");
				btnNewButton_5_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					try {
						int count=0;
						int carId=Integer.parseInt(atbCarId.getText());
						for(CarDetail dtl : data) {
							if(dtl.getCarID()==carId) {
								count++;
							}
						}
						
						if(count==0) {
							CarDetail carDtl = new CarDetail(carId, atbModel.getText(), atbBrand.getText(), Integer.parseInt(atbMileage.getText()), Double.parseDouble(atbCost.getText()));
							data.add(carDtl);
							
							JLabel msg= new JLabel("Successfully inserted");
							msg.setFont(new Font("Arial",Font.BOLD,15));
							JOptionPane.showMessageDialog(null,msg,"SUCCESS",JOptionPane.PLAIN_MESSAGE);
							
						}else {
							try{
							throw new exceptionMsg("Already a record exist for CAR ID = " + carId+". Please provide a different CAR ID");
							}catch(Exception e) {
								e.printStackTrace();
							}
						}
						
						atbCarId.setText(null); atbModel.setText(null); atbBrand.setText(null); atbMileage.setText(null); atbCost.setText(null);
						
					}catch(Exception exp) {//Exception Handling for wrong Format
							if(exp.getMessage()!=null) {
								JLabel msg= new JLabel("Wrong Format");
								msg.setFont(new Font("Arial",Font.BOLD,15));
								JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
							}
							
						}
					}
					
				});
				btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnNewButton_5_1.setBounds(410, 489, 147, 54);
				deleteFrame.getContentPane().add(btnNewButton_5_1);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_2.setBounds(36, 263, 205, 53);
		contentPane.add(btnNewButton_2);
		
		//Update
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//calling Update Internal Jframe
				
				if(null!=allFrame && allFrame.isShowing()){//To close other open internal Jframes
					allFrame.dispose();
				}
				
				if(null!=searchFrame && searchFrame.isShowing()){//To close other open internal Jframes
					searchFrame.dispose();
				}
				
				if(null!=addFrame && addFrame.isShowing()){//To close other open internal Jframes
					addFrame.dispose();
				}
				
				if(null!=deleteFrame && deleteFrame.isShowing()){//To close other open internal Jframes
					deleteFrame.dispose();
				}
				
				updateFrame = new JInternalFrame("Update");
				updateFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
				updateFrame.setBounds(295, 10, 881, 643);
				contentPane.add(updateFrame);
				
				updateFrame.setVisible(true);
				updateFrame.getContentPane().setLayout(null);
				
				JLabel lblNewLabel_1 = new JLabel("CAR ID");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1.setForeground(Color.BLACK);
				lblNewLabel_1.setBounds(83, 10, 103, 41);
				updateFrame.getContentPane().add(lblNewLabel_1);
				
				JLabel lblNewLabel_1_1 = new JLabel("MODEL NAME");
				lblNewLabel_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1.setBounds(76, 185, 185, 41);
				updateFrame.getContentPane().add(lblNewLabel_1_1);
				
				JLabel lblNewLabel_1_1_1 = new JLabel("BRAND");
				lblNewLabel_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1.setBounds(76, 250, 129, 41);
				updateFrame.getContentPane().add(lblNewLabel_1_1_1);
				
				JLabel lblNewLabel_1_1_1_1 = new JLabel("MILEAGE");
				lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1.setBounds(76, 314, 129, 41);
				updateFrame.getContentPane().add(lblNewLabel_1_1_1_1);
				
				JLabel lblNewLabel_1_1_1_1_1 = new JLabel("PRICE");
				lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1_1.setBounds(76, 373, 129, 41);
				updateFrame.getContentPane().add(lblNewLabel_1_1_1_1_1);
				
				JTextArea utbCarId = new JTextArea();
				utbCarId.setFont(new Font("Arial", Font.PLAIN, 25));
				utbCarId.setBounds(274, 115, 484, 41);
				updateFrame.getContentPane().add(utbCarId);
				
				JTextArea utbModel = new JTextArea();
				utbModel.setFont(new Font("Arial", Font.PLAIN, 25));
				utbModel.setBounds(274, 185, 484, 41);
				updateFrame.getContentPane().add(utbModel);
				
				JTextArea utbBrand = new JTextArea();
				utbBrand.setFont(new Font("Arial", Font.PLAIN, 25));
				utbBrand.setBounds(274, 250, 484, 41);
				updateFrame.getContentPane().add(utbBrand);
				
				JTextArea utbMileage = new JTextArea();
				utbMileage.setFont(new Font("Arial", Font.PLAIN, 25));
				utbMileage.setBounds(274, 314, 484, 41);
				updateFrame.getContentPane().add(utbMileage);
				
				JTextArea utbCost = new JTextArea();
				utbCost.setFont(new Font("Arial", Font.PLAIN, 25));
				utbCost.setBounds(274, 373, 484, 41);
				updateFrame.getContentPane().add(utbCost);
				
				JTextArea stextArea = new JTextArea();
				stextArea.setBounds(196, 10, 484, 41);
				stextArea.setFont(new Font("Arial",Font.PLAIN,25));
				updateFrame.getContentPane().add(stextArea);
				
				JLabel lblNewLabel_1_2 = new JLabel("CAR ID");
				lblNewLabel_1_2.setForeground(Color.BLACK);
				lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_2.setBounds(76, 115, 103, 41);
				updateFrame.getContentPane().add(lblNewLabel_1_2);
				
				JButton btnNewButton_5 = new JButton("Search");
				btnNewButton_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						utbCarId.setText(null); utbModel.setText(null); utbBrand.setText(null); utbMileage.setText(null); utbCost.setText(null);
						int count=0;
						int carId = Integer.parseInt(stextArea.getText());
						
						for(CarDetail dtl : data) {
							if(dtl.getCarID()==carId) {
								utbCarId.append(String.valueOf(carId));
								utbModel.append(dtl.getmodelName());
								utbBrand.append(dtl.getBrand());
								utbMileage.append(String.valueOf(dtl.getMileage()));
								utbCost.append(String.valueOf(dtl.getCost()));
								count++;
							}
						}
						
						if(count==0) {
							try {
								throw new exceptionMsg("No matches for CAR ID = " + carId);
							}catch(Exception exp) {//Exception Handling for wrong Format
								if(exp.getMessage()!=null) {
									JLabel msg= new JLabel("Wrong Format");
									msg.setFont(new Font("Arial",Font.BOLD,15));
									JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
								}
								
							}
							
						}
						
						//stextArea.setText(null);
								
					}
				});
				btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton_5.setBounds(718, 10, 103, 41);
				updateFrame.getContentPane().add(btnNewButton_5);
				
				JButton btnNewButton_5_1 = new JButton("Update");
				btnNewButton_5_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					try {
						int carId = Integer.parseInt(stextArea.getText());
						
						for(CarDetail dtl : data) {
							if(dtl.getCarID()==carId) {
								dtl.setCarID(Integer.parseInt(utbCarId.getText()));
								dtl.setmodelName(utbModel.getText());
								dtl.setBrand(utbBrand.getText());
								dtl.setMileage(Integer.parseInt(utbMileage.getText()));
								dtl.setCost(Double.parseDouble(utbCost.getText()));
							}
						}
						
						JLabel msg= new JLabel("Successfully updated");
						msg.setFont(new Font("Arial",Font.BOLD,15));
						JOptionPane.showMessageDialog(null,msg,"SUCCESS",JOptionPane.PLAIN_MESSAGE);
						
						utbCarId.setText(null); utbModel.setText(null); utbBrand.setText(null); utbMileage.setText(null); utbCost.setText(null);
						stextArea.setText(null);
						
					}catch(Exception exp) {//Exception Handling for wrong Format
						if(exp.getMessage()!=null) {
							JLabel msg= new JLabel("Wrong Format");
							msg.setFont(new Font("Arial",Font.BOLD,15));
							JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
						}
						
					}
					}
					
				});
				btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnNewButton_5_1.setBounds(410, 489, 147, 54);
				updateFrame.getContentPane().add(btnNewButton_5_1);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3.setBounds(36, 351, 205, 53);
		contentPane.add(btnNewButton_3);
		
		//Delete
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//calling Delete Internal Jframe
				
				if(null!=allFrame && allFrame.isShowing()){//To close other open internal Jframes
					allFrame.dispose();
				}
				
				if(null!=searchFrame && searchFrame.isShowing()){//To close other open internal Jframes
					searchFrame.dispose();
				}
				 
				if(null!=addFrame && addFrame.isShowing()){//To close other open internal Jframes
					addFrame.dispose();
				}
				
				if(null!=updateFrame && updateFrame.isShowing()){//To close other open internal Jframes
					updateFrame.dispose();
				}
				
				deleteFrame = new JInternalFrame("Delete");
				deleteFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
				deleteFrame.setBounds(295, 10, 881, 643);
				contentPane.add(deleteFrame);
				
				deleteFrame.setVisible(true);
				deleteFrame.getContentPane().setLayout(null);
				
				JLabel lblNewLabel_1 = new JLabel("CAR ID");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1.setForeground(Color.BLACK);
				lblNewLabel_1.setBounds(83, 10, 103, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1);
				
				JLabel lblNewLabel_1_1 = new JLabel("MODEL NAME");
				lblNewLabel_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1.setBounds(76, 185, 185, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_1);
				
				JLabel lblNewLabel_1_1_1 = new JLabel("BRAND");
				lblNewLabel_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1.setBounds(76, 250, 129, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_1_1);
				
				JLabel lblNewLabel_1_1_1_1 = new JLabel("MILEAGE");
				lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1.setBounds(76, 314, 129, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_1_1_1);
				
				JLabel lblNewLabel_1_1_1_1_1 = new JLabel("PRICE");
				lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_1_1_1_1.setBounds(76, 373, 129, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_1_1_1_1);
				
				JTextArea dtbCarId = new JTextArea();
				dtbCarId.setEditable(false);
				dtbCarId.setFont(new Font("Arial", Font.PLAIN, 25));
				dtbCarId.setBounds(274, 115, 484, 41);
				deleteFrame.getContentPane().add(dtbCarId);
				
				JTextArea dtbModel = new JTextArea();
				dtbModel.setEditable(false);
				dtbModel.setFont(new Font("Arial", Font.PLAIN, 25));
				dtbModel.setBounds(274, 185, 484, 41);
				deleteFrame.getContentPane().add(dtbModel);
				
				JTextArea dtbBrand = new JTextArea();
				dtbBrand.setEditable(false);
				dtbBrand.setFont(new Font("Arial", Font.PLAIN, 25));
				dtbBrand.setBounds(274, 250, 484, 41);
				deleteFrame.getContentPane().add(dtbBrand);
				
				JTextArea dtbMileage = new JTextArea();
				dtbMileage.setEditable(false);
				dtbMileage.setFont(new Font("Arial", Font.PLAIN, 25));
				dtbMileage.setBounds(274, 314, 484, 41);
				deleteFrame.getContentPane().add(dtbMileage);
				
				JTextArea dtbCost = new JTextArea();
				dtbCost.setEditable(false);
				dtbCost.setFont(new Font("Arial", Font.PLAIN, 25));
				dtbCost.setBounds(274, 373, 484, 41);
				deleteFrame.getContentPane().add(dtbCost);
				
				JTextArea stextArea = new JTextArea();
				stextArea.setBounds(196, 10, 484, 41);
				stextArea.setFont(new Font("Arial",Font.PLAIN,25));
				deleteFrame.getContentPane().add(stextArea);
				
				JLabel lblNewLabel_1_2 = new JLabel("CAR ID");
				lblNewLabel_1_2.setForeground(Color.BLACK);
				lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblNewLabel_1_2.setBounds(76, 115, 103, 41);
				deleteFrame.getContentPane().add(lblNewLabel_1_2);
				
				JButton btnNewButton_5 = new JButton("Search");
				btnNewButton_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						dtbCarId.setText(null); dtbModel.setText(null); dtbBrand.setText(null); dtbMileage.setText(null); dtbCost.setText(null);
						int count=0;
						int carId = Integer.parseInt(stextArea.getText());
						
						for(CarDetail dtl : data) {
							if(dtl.getCarID()==carId) {
								dtbCarId.append(String.valueOf(carId));
								dtbModel.append(dtl.getmodelName());
								dtbBrand.append(dtl.getBrand());
								dtbMileage.append(String.valueOf(dtl.getMileage()));
								dtbCost.append(String.valueOf(dtl.getCost()));
								count++;
							}
						}
						
						if(count==0) {
							try {
								throw new exceptionMsg("No matches for CAR ID = " + carId);
							}catch(Exception exp) {//Exception Handling for wrong Format
								if(exp.getMessage()!=null) {
									JLabel msg= new JLabel("Wrong Format");
									msg.setFont(new Font("Arial",Font.BOLD,15));
									JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
								}
								
							}
							
						}
						
						//stextArea.setText(null);
					}
				});
				btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton_5.setBounds(718, 10, 103, 41);
				deleteFrame.getContentPane().add(btnNewButton_5);
				
				JButton btnNewButton_5_1 = new JButton("Delete");
				btnNewButton_5_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int carId = Integer.parseInt(stextArea.getText());
						List<CarDetail> deleteList = new ArrayList<>();
						for(CarDetail dtl : data) {
							if(dtl.getCarID()==carId) {
								deleteList.add(dtl);
							}
						}
						data.removeAll(deleteList);
						
						JLabel msg= new JLabel("Successfully deleted");
						msg.setFont(new Font("Arial",Font.BOLD,15));
						JOptionPane.showMessageDialog(null,msg,"SUCCESS",JOptionPane.PLAIN_MESSAGE);
						
						dtbCarId.setText(null); dtbModel.setText(null); dtbBrand.setText(null); dtbMileage.setText(null); dtbCost.setText(null);
						stextArea.setText(null);
					}
					
				});
				btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnNewButton_5_1.setBounds(410, 489, 147, 54);
				deleteFrame.getContentPane().add(btnNewButton_5_1);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4.setBounds(36, 435, 205, 53);
		contentPane.add(btnNewButton_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(23, 60, 237, 461);
		contentPane.add(panel);
		
				
	}
	
	public static void Print (ArrayList<CarDetail> data, JTextArea tbCarId, JTextArea tbModel, JTextArea tbBrand, JTextArea tbMileage, JTextArea tbCost) {//mthd to display the result of All inventory option
		tbCarId.setText(null); tbModel.setText(null); tbBrand.setText(null); tbMileage.setText(null); tbCost.setText(null);
		
		for(int i=0; i< data.size(); i++)
		{
			tbCarId.append(Integer.toString(data.get(i).carID)+"\n");
			tbModel.append(data.get(i).modelName+"\n");
			tbBrand.append(data.get(i).brand+"\n");
			tbMileage.append(Double.toString(data.get(i).mileage)+" mpg"+"\n");
			tbCost.append("$ "+Double.toString(data.get(i).cost)+"0"+"\n");
		}
	}
	
	public static Integer searchPrint (ArrayList<CarDetail> data, String searchTxt, String selected, 
			JTextArea tbCarId, JTextArea tbModel, JTextArea tbBrand, JTextArea tbMileage, JTextArea tbCost) throws Exception {//mthd to display the result of search option
		
		int count=0;
		boolean condition=false;
		boolean flg;
		for(int i=0; i< data.size(); i++)
		{
			if(selected.equalsIgnoreCase("CAR ID")) {
				condition=data.get(i).carID == Integer.parseInt(searchTxt);
			}else if(selected.equalsIgnoreCase("MODEL NAME")) {
				condition=data.get(i).modelName.equalsIgnoreCase(searchTxt);
			}else if(selected.equalsIgnoreCase("BRAND")) {
				condition=data.get(i).brand.equalsIgnoreCase(searchTxt);
			}else if(selected.equalsIgnoreCase("MILEAGE")) {
				condition=data.get(i).mileage == Integer.parseInt(searchTxt);
			}else if(selected.equalsIgnoreCase("PRICE")) {
				condition=data.get(i).cost == Double.parseDouble(searchTxt);
			}
			
			if (condition){
				tbCarId.append(Integer.toString(data.get(i).carID)+"\n");
				tbModel.append(data.get(i).modelName+"\n");
				tbBrand.append(data.get(i).brand+"\n");
				tbMileage.append(data.get(i).mileage+" mpg"+"\n");
				tbCost.append("$ "+ Double.toString(data.get(i).cost)+"0"+"\n");
				count++;
			}
		}
		return count;
	}
	
	class exceptionMsg extends Exception{//to throw a dynamic error message
		exceptionMsg(String msg){
			JLabel msg2= new JLabel(msg);
			msg2.setFont(new Font("Arial",Font.BOLD,15));
			JOptionPane.showMessageDialog(null,msg2,"Error",JOptionPane.ERROR_MESSAGE);
			
		}
	}
	
	public static String toFindInputVal(String s) {//to find whether the provided input value is either String or Integer
		 for (int i = 0; i < s.length(); i++)
	            if (Character.isDigit(s.charAt(i)) == false)
	                return "String";
	 
	        return "Integer";
	}
}

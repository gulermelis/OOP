import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Payment {

	private JFrame paymentFrame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblPurchaseForm;
	private JLabel lblStreet;
	private JLabel lblTown;
	private JLabel lblCity;

	public JFrame getFrame() {
		return paymentFrame;
	}


	public void setFrame(JFrame frame) {
		this.paymentFrame = frame;
	}
	
	public Payment(JFrame superF) {
		
		paymentFrame = new JFrame();
		paymentFrame.setBounds(100, 100, 717, 521);
		
		paymentFrame.addWindowListener(new WindowAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void windowClosing(WindowEvent arg0) {
				superF.setVisible(true);
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	
		paymentFrame.setTitle("BUY PAGES");
		paymentFrame.setBounds(100, 100, 328, 329);
		paymentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paymentFrame.setSize(600,600);
		paymentFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(44, 11, 486, 539);
		paymentFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblPurchaseForm = new JLabel("PURCHASE FORM");
		lblPurchaseForm.setBounds(22, 36, 133, 29);
		panel.add(lblPurchaseForm);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(22, 95, 71, 14);
		panel.add(lblPhone);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 92, 52, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(177, 92, 52, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(257, 92, 110, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(96, 158, 96, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(96, 197, 96, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(96, 238, 96, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address Information");
		lblAddress.setBounds(22, 133, 207, 17);
		panel.add(lblAddress);
		
		
		
		lblStreet = new JLabel("street");
		lblStreet.setBounds(45, 161, 48, 14);
		panel.add(lblStreet);
		
		lblTown = new JLabel("town");
		lblTown.setBounds(45, 200, 48, 14);
		panel.add(lblTown);
		
		lblCity = new JLabel("city");
		lblCity.setBounds(45, 241, 48, 14);
		panel.add(lblCity);
		
		JLabel lblCardInfo = new JLabel("Card Number");
		lblCardInfo.setBounds(10, 294, 71, 14);
		panel.add(lblCardInfo);
		
		textField_7 = new JTextField();
		textField_7.setBounds(91, 291, 158, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(91, 322, 101, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(91, 360, 96, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblValidateDate = new JLabel("Validate Date");
		lblValidateDate.setBounds(10, 325, 83, 14);
		panel.add(lblValidateDate);
		
		JLabel lblCvs = new JLabel("CVS");
		lblCvs.setBounds(22, 363, 48, 14);
		panel.add(lblCvs);
		
		JButton btnConfrm = new JButton("CONFIRM");
		btnConfrm.setBounds(177, 454, 110, 23);
		btnConfrm.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	  
        	   
         if(textField_1.getText().length() == 0 || textField_2.getText().length() == 0 ||textField_3.getText().length() == 0 ||
        		 textField_4.getText().length() == 0||textField_5.getText().length() == 0 ||textField_6.getText().length() == 0 
        		 ||textField_7.getText().length() == 0|| textField_8.getText().length() == 0 ||textField_9.getText().length() == 0) {
					//txtUserName.requestFocus();
					//passwordField.requestFocus();
					JOptionPane.showMessageDialog(paymentFrame, "missing information");
        	   
         }
           else {
        	   JOptionPane.showMessageDialog(paymentFrame,"SÝPARÝÞ ALINDI");
           }
				
			}
		});
		
		
		
		
		panel.add(btnConfrm);
		paymentFrame.getContentPane().add(panel);
		
		
		
		
	
	
	
	
	
	
	
	
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Button;

public class ViewProduct {
	
	private JFrame vpFrame;
	private JRadioButton rdbttn1;
	private JRadioButton rdbttn2;
	private JRadioButton rdbttn3;
	private JButton button;
	private JButton bttnvcard;
	
	public ViewProduct()
	{
		vpFrame = new JFrame();
		vpFrame.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent arg0) {
					vpFrame.setVisible(true);
					try {
						this.finalize();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
	

		
		
		vpFrame.setTitle("allproducts");
		vpFrame.setBounds(100, 100, 462, 300);
		vpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vpFrame.getContentPane().setLayout(null);
		
		JLabel lblAllProducts = new JLabel("ALL PRODUCTS");
		lblAllProducts.setBounds(42, 20, 113, 31);
		vpFrame.getContentPane().add(lblAllProducts);
		
		rdbttn1 = new JRadioButton(MainMenu.op.product_list.get(0).getpName());
		rdbttn1.setBounds(42, 58, 128, 23);
		vpFrame.getContentPane().add(rdbttn1);
		
		rdbttn2 = new JRadioButton(MainMenu.op.product_list.get(1).getpName());
		rdbttn2.setBounds(42, 96, 159, 23);
		vpFrame.getContentPane().add(rdbttn2);
		
		rdbttn3 = new JRadioButton(MainMenu.op.product_list.get(2).getpName());
		rdbttn3.setBounds(42, 135, 147, 23);
		vpFrame.getContentPane().add(rdbttn3);
		
		

		JButton btnAddToCard = new JButton("Add to Card");
		btnAddToCard.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				
				if(rdbttn1.isSelected()) {
					Product p=MainMenu.op.product_list.get(0);
					MainMenu.op.addToCard(p);
					JOptionPane.showMessageDialog(vpFrame, "added");
					
				}
				 if(rdbttn2.isSelected()) {
					Product p1=MainMenu.op.product_list.get(1);
					MainMenu.op.addToCard(p1);
					JOptionPane.showMessageDialog(vpFrame, "added");
				}
				
				 if(rdbttn3.isSelected()) {
					Product p2=MainMenu.op.product_list.get(2);
				    MainMenu.op.addToCard(p2);
				    
				    JOptionPane.showMessageDialog(vpFrame, "added");
				}
			
				 else {
					 
					 JOptionPane.showMessageDialog(vpFrame, "empty");
			       }
				
			}
			
			
			
		});
		
		btnAddToCard.setBounds(42, 175, 128, 31);
		vpFrame.getContentPane().add(btnAddToCard);
		
	
		
		bttnvcard = new JButton("View Your Card");
		bttnvcard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCard frame=new ViewCard();
				frame.getFrame().setVisible(true);
			}
		});
		bttnvcard.setBounds(205, 175, 159, 31);
		vpFrame.getContentPane().add(bttnvcard);
	

		
	}
	
	
	public JFrame getFrame() {
		return vpFrame;
	}

	 public void setFrame(JFrame frame) {
		 vpFrame = frame;
		}
	
}

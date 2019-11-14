import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCard {

	private JFrame vcFrame;
	private TextArea textArea;
	private JButton btnBuy;
	private JButton bttnCancel;

	public JFrame getFrame() {
		return vcFrame;
	}

	 public void setFrame(JFrame frame) {
		 vcFrame = frame;
		}
	 
	 
	   public ViewCard() {
		  vcFrame = new JFrame();
		   vcFrame.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent arg0) {
					vcFrame.setVisible(true);
					try {
						this.finalize();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
	
	    vcFrame.setTitle("YOURCARD");
		vcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vcFrame.setBounds(100, 100, 622, 300);
		vcFrame.getContentPane().setLayout(null);
		
		textArea = new TextArea();
		textArea.setBounds(13, 47, 453, 190);
		vcFrame.getContentPane().add(textArea);
		String retV= MainMenu.op.buyPage();
		textArea.setText(retV );
		 textArea.setVisible(true);
		
		
		JLabel lblYourCard = new JLabel("YOUR CARD");
		lblYourCard.setBounds(32, 27, 91, 14);
		vcFrame.getContentPane().add(lblYourCard);
		
		 btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			   Payment pymnt=new Payment(vcFrame);
			   pymnt.getFrame().setVisible(true);
			   vcFrame.setVisible(false);
			
			}
		});
		
		btnBuy.setBounds(472, 69, 117, 23);
		vcFrame.getContentPane().add(btnBuy);
		
		 bttnCancel = new JButton("Cancel");
		bttnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bttnCancel.setBounds(472, 108, 117, 23);
		vcFrame.getContentPane().add(bttnCancel);
	

	}

}

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class MainMenu {

	private JFrame mainFrame;
    private JRadioButton rbtnRegister;
	private JRadioButton rbtnLogin;
	private JRadioButton rbtnViewProducts;
	private JRadioButton rbtnExit;
   
	 private RegisterPage rgstr;
	 private Login lgn;
	 private ViewProduct prdct;

 
	  public static Operations op = new Operations();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainMenu() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Menu");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(100, 100, 450, 286);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setVisible(true);
		
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(123, 30, 46, 14);
		mainFrame.getContentPane().add(lblMenu);
		
		
		rbtnRegister = new JRadioButton("Sign Up");
		rbtnRegister.setBounds(60, 51, 109, 23);
		mainFrame.getContentPane().add(rbtnRegister);
		
		rbtnLogin = new JRadioButton("Login");
		rbtnLogin.setBounds(60, 77, 121, 23);
		mainFrame.getContentPane().add(rbtnLogin);;
		
		rbtnViewProducts = new JRadioButton("View All Products ");
		rbtnViewProducts.setBounds(60, 103, 150, 23);
		mainFrame.getContentPane().add(rbtnViewProducts);
		
		
		rbtnExit = new JRadioButton("Exit");
		rbtnExit.setBounds(60, 127, 300, 23);
		mainFrame.getContentPane().add(rbtnExit);
		
		ButtonGroup btnG = new ButtonGroup();
		btnG.add(rbtnRegister);
		btnG.add(rbtnLogin);
		btnG.add(rbtnViewProducts);
		btnG.add(rbtnExit);
	
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			
				if(rbtnLogin.isSelected())
				{
					lgn=new Login(mainFrame);
					lgn.getFrame().setVisible(true);
					
									
				}
				
				else if(rbtnRegister.isSelected())
				{
					rgstr = new RegisterPage();
					rgstr.getFrame().setVisible(true);
					

				}
				else if(rbtnViewProducts.isSelected())
				{
					prdct=new ViewProduct();
					prdct.getFrame().setVisible(true);
				
				}
				 
				else
				{
				  System.exit(0);
				}
			
				
				
			}
		});
		
	
		btnOk.setBounds(218, 193, 89, 23);
	    mainFrame.getContentPane().add(btnOk);
	    mainFrame.setVisible(true);
	 
	}
	
	public JFrame getFrame() {
		return mainFrame;
	}


	public void setFrame(JFrame frame) {
	  mainFrame = frame;
	}
	
	}



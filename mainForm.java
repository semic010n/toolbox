package visualApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.border.MatteBorder;
import java.awt.Image;
import visualApp.RadioButtonFrame.RadioButtonHandler;

import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.JMenuBar;
import java.awt.Button;

public class mainForm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField txtChangeTheFont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainForm window = new mainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 573, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(0, 0, 255));
		panel_5.setBackground(new Color(255, 192, 203));
		panel_5.setBounds(10, 13, 170, 157);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 102, 102));
		textField.setBackground(new Color(255, 240, 245));
		textField.setBounds(26, 22, 116, 22);
		panel_5.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 102, 102));
		textField_1.setBackground(new Color(255, 240, 245));
		textField_1.setBounds(26, 84, 116, 22);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setForeground(new Color(255, 102, 102));
		btnNewButton.setBackground(new Color(255, 240, 245));
		JCheckBox chckbxNewCheckBox = new JCheckBox("+");
		chckbxNewCheckBox.setForeground(new Color(255, 102, 102));
		chckbxNewCheckBox.setBackground(new Color(255, 240, 245));
		chckbxNewCheckBox.setBounds(0, 53, 37, 25);
		panel_5.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("-");
		chckbxNewCheckBox_1.setForeground(new Color(255, 102, 102));
		chckbxNewCheckBox_1.setBackground(new Color(255, 240, 245));
		chckbxNewCheckBox_1.setBounds(41, 53, 33, 25);
		panel_5.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("*");
		chckbxNewCheckBox_2.setForeground(new Color(255, 102, 102));
		chckbxNewCheckBox_2.setBackground(new Color(255, 240, 245));
		chckbxNewCheckBox_2.setBounds(84, 53, 37, 25);
		panel_5.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("/");
		chckbxNewCheckBox_3.setForeground(new Color(255, 102, 102));
		chckbxNewCheckBox_3.setBackground(new Color(255, 240, 245));
		chckbxNewCheckBox_3.setBounds(129, 53, 33, 25);
		panel_5.add(chckbxNewCheckBox_3);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Addition a=new Addition();
				String text = textField.getText();
				int a = Integer.parseInt(text);
				String text1 = textField_1.getText();
				int b = Integer.parseInt(text1);
				float r=0;
				if(chckbxNewCheckBox.isSelected())
				{
					r=a+b;
					JOptionPane.showMessageDialog(null, "The sum is " + r, 
					         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
					
				}
				if(chckbxNewCheckBox_1.isSelected())
				{
					r=a-b;
					JOptionPane.showMessageDialog(null, "The subtraction is " + r, 
					         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
				}
				if(chckbxNewCheckBox_3.isSelected())
				{
					r=(float)a/b;
					JOptionPane.showMessageDialog(null, "The division is " + r, 
					         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
				}
				if(chckbxNewCheckBox_2.isSelected())
				{
					r=a*b;
					JOptionPane.showMessageDialog(null, "The multiplication is " + r, 
					         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
				}
				
				//JOptionPane.showMessageDialog(null, "The sum is " + r, 
				         //"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
				
				        
				
				
				
			}
		});
		btnNewButton.setBounds(36, 119, 97, 25);
		panel_5.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Calculator");
		lblNewLabel_4.setForeground(new Color(255, 102, 102));
		lblNewLabel_4.setBounds(57, 0, 69, 16);
		panel_5.add(lblNewLabel_4);
		
		
		
		PaintPanel panel_6 = new PaintPanel();
		panel_6.setForeground(new Color(255, 102, 102));
		panel_6.setBackground(new Color(255, 240, 245));
		panel_6.setBounds(374, 13, 166, 157);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Paint");
		lblNewLabel_5.setForeground(new Color(255, 102, 102));
		lblNewLabel_5.setBounds(65, 0, 39, 16);
		panel_6.add(lblNewLabel_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 192, 203));
		panel_7.setBounds(10, 182, 170, 150);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 240, 245));
		textField_2.setBounds(25, 32, 116, 22);
		panel_7.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 240, 245));
		passwordField.setBounds(25, 86, 116, 22);
		panel_7.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setBounds(56, 0, 82, 40);
		panel_7.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 102, 102));
		lblNewLabel_1.setBounds(56, 67, 76, 16);
		panel_7.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.setForeground(new Color(255, 102, 102));
		btnNewButton_1.setBackground(new Color(255, 240, 245));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str;
				
				
				
				JOptionPane.showMessageDialog(panel_7, "Hello! Your username is " + textField_2.getText() + 
						" And your passsword is " + passwordField.getText()  );
			}
		});
		btnNewButton_1.setBounds(35, 121, 97, 25);
		panel_7.add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 240, 245));
		panel_9.setBounds(192, 183, 347, 150);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(null);
		
		int q=18;
				
		
		JFormattedTextField frmtdtxtfldCjangeTheFont = new JFormattedTextField();
		frmtdtxtfldCjangeTheFont.setBackground(new Color(255, 240, 245));
		frmtdtxtfldCjangeTheFont.setForeground(new Color(255, 102, 102));
		frmtdtxtfldCjangeTheFont.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmtdtxtfldCjangeTheFont.setText("Change the font and size :)");
		frmtdtxtfldCjangeTheFont.setBounds(8, 0, 331, 56);
		panel_9.add(frmtdtxtfldCjangeTheFont);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bold" );
		rdbtnNewRadioButton.setForeground(new Color(255, 102, 102));
		rdbtnNewRadioButton.setBackground(new Color(255, 192, 203));
		rdbtnNewRadioButton.setBounds(71, 54, 63, 25);
		panel_9.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.setBackground(new Color(255, 240, 245));
		btnNewButton_2.setForeground(new Color(255, 102, 102));
		
		btnNewButton_2.setBounds(123, 117, 97, 25);
		panel_9.add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Italic");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 102, 102));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 192, 203));
		rdbtnNewRadioButton_1.setBounds(215, 54, 55, 25);
		panel_9.add(rdbtnNewRadioButton_1);
		
		JSlider slider = new JSlider();
		slider.setBackground(new Color(255, 192, 203));
		slider.setForeground(new Color(255, 240, 245));
		slider.setValue(18);
		slider.setMaximum(27);
		slider.setMinimum(9);
		slider.setBounds(70, 88, 200, 26);
		panel_9.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Small");
		lblNewLabel_2.setForeground(new Color(255, 102, 102));
		lblNewLabel_2.setBounds(16, 88, 42, 16);
		panel_9.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Big");
		lblNewLabel_3.setForeground(new Color(255, 102, 102));
		lblNewLabel_3.setBounds(304, 88, 31, 16);
		panel_9.add(lblNewLabel_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 182, 193));
		panel_8.setBounds(192, 13, 170, 157);
		frame.getContentPane().add(panel_8);
		
		JMenu mnNewMenu = new JMenu("Choose the theme");
		mnNewMenu.setForeground(new Color(255, 102, 102));
		mnNewMenu.setBackground(new Color(255, 240, 245));
		panel_8.add(mnNewMenu);
		
		
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		Image img = new ImageIcon(this.getClass().getResource("/pink.png")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(img));
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_5.setBackground(new Color(255, 192, 203));
				lblNewLabel_4.setForeground(new Color(255, 102, 102));
				textField.setBackground(new Color(255, 240, 245));
				textField_1.setBackground(new Color(255, 240, 245));
				btnNewButton.setForeground(new Color(255, 102, 102));
				btnNewButton.setBackground(new Color(255, 240, 245));
				lblNewLabel_5.setForeground(new Color(255, 102, 102));
				chckbxNewCheckBox.setForeground(new Color(255, 102, 102));
				chckbxNewCheckBox.setBackground(new Color(255, 240, 245));
				chckbxNewCheckBox_1.setForeground(new Color(255, 102, 102));
						chckbxNewCheckBox_1.setBackground(new Color(255, 240, 245));
				chckbxNewCheckBox_2.setForeground(new Color(255, 102, 102));
						chckbxNewCheckBox_2.setBackground(new Color(255, 240, 245));
				chckbxNewCheckBox_3.setForeground(new Color(255, 102, 102));
						chckbxNewCheckBox_3.setBackground(new Color(255, 240, 245));
				panel_6.setForeground(new Color(255, 102, 102));
						panel_6.setBackground(new Color(255, 240, 245));
				panel_7.setBackground(new Color(255, 192, 203));
				textField_2.setBackground(new Color(255, 240, 245));
				passwordField.setBackground(new Color(255, 240, 245));
				lblNewLabel.setForeground(new Color(255, 102, 102));
				lblNewLabel_1.setForeground(new Color(255, 102, 102));
				btnNewButton_1.setForeground(new Color(255, 102, 102));
						btnNewButton_1.setBackground(new Color(255, 240, 245));
				panel_9.setBackground(new Color(255, 240, 245));
				frmtdtxtfldCjangeTheFont.setBackground(new Color(255, 240, 245));
						frmtdtxtfldCjangeTheFont.setForeground(new Color(255, 102, 102));
				rdbtnNewRadioButton.setForeground(new Color(255, 102, 102));
						rdbtnNewRadioButton.setBackground(new Color(255, 192, 203));
				btnNewButton_2.setBackground(new Color(255, 240, 245));
						btnNewButton_2.setForeground(new Color(255, 102, 102));
				rdbtnNewRadioButton_1.setForeground(new Color(255, 102, 102));
						rdbtnNewRadioButton_1.setBackground(new Color(255, 192, 203));
				slider.setBackground(new Color(255, 192, 203));
						slider.setForeground(new Color(255, 240, 245));
				lblNewLabel_2.setForeground(new Color(255, 102, 102));
				lblNewLabel_3.setForeground(new Color(255, 102, 102));
				panel_8.setBackground(new Color(255, 182, 193));
				mnNewMenu.setForeground(new Color(255, 102, 102));
						mnNewMenu.setBackground(new Color(255, 240, 245));
						textField.setForeground(new Color(255, 102, 102));
						textField_1.setForeground(new Color(255, 102, 102));
			}
		});
		panel_8.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		Image imge = new ImageIcon(this.getClass().getResource("/purple.png")).getImage();
		btnNewButton_4.setIcon(new ImageIcon(imge));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_5.setBackground(new Color(147, 112, 219));
				textField.setBackground(new Color(230, 230, 250));
				textField_1.setBackground(new Color(230, 230, 250));
				btnNewButton.setForeground(new Color(72, 61, 139));
				btnNewButton.setBackground(new Color(230, 230, 250));
				chckbxNewCheckBox.setForeground(new Color(72, 61, 139));
				chckbxNewCheckBox.setBackground(new Color(230, 230, 250));
				chckbxNewCheckBox_1.setForeground(new Color(72, 61, 139));
						chckbxNewCheckBox_1.setBackground(new Color(230, 230, 250));
				chckbxNewCheckBox_2.setForeground(new Color(72, 61, 139));
						chckbxNewCheckBox_2.setBackground(new Color(230, 230, 250));
				chckbxNewCheckBox_3.setForeground(new Color(72, 61, 139));
						chckbxNewCheckBox_3.setBackground(new Color(230, 230, 250));
				panel_6.setForeground(new Color(72, 61, 139));
						panel_6.setBackground(new Color(230, 230, 250));
				panel_7.setBackground(new Color(147, 112, 219));
				textField_2.setBackground(new Color(230, 230, 250));
				passwordField.setBackground(new Color(230, 230, 250));
				lblNewLabel.setForeground(new Color(72, 61, 139));
				lblNewLabel_1.setForeground(new Color(72, 61, 139));
				btnNewButton_1.setForeground(new Color(72, 61, 139));
						btnNewButton_1.setBackground(new Color(230, 230, 250));
				panel_9.setBackground(new Color(230, 230, 250));
				frmtdtxtfldCjangeTheFont.setBackground(new Color(230, 230, 250));
						frmtdtxtfldCjangeTheFont.setForeground(new Color(72, 61, 139));
				rdbtnNewRadioButton.setForeground(new Color(72, 61, 139));
						rdbtnNewRadioButton.setBackground(new Color(147, 112, 219));
				btnNewButton_2.setBackground(new Color(230, 230, 250));
						btnNewButton_2.setForeground(new Color(72, 61, 139));
				rdbtnNewRadioButton_1.setForeground(new Color(72, 61, 139));
						rdbtnNewRadioButton_1.setBackground(new Color(147, 112, 219));
				slider.setBackground(new Color(147, 112, 219));
						slider.setForeground(new Color(230, 230, 250));
				lblNewLabel_2.setForeground(new Color(72, 61, 139));
				lblNewLabel_3.setForeground(new Color(72, 61, 139));
				panel_8.setBackground(new Color(147, 112, 219));
				mnNewMenu.setForeground(new Color(72, 61, 139));
						mnNewMenu.setBackground(new Color(230, 230, 250));
						panel_8.setBackground(new Color(147, 112, 219));
						lblNewLabel_4.setForeground(new Color(72, 61, 139));
						lblNewLabel_5.setForeground(new Color(72, 61, 139));
						textField.setForeground(new Color(72, 61, 139));
						textField_1.setForeground(new Color(72, 61, 139));
			}
		});
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		Image imgee = new ImageIcon(this.getClass().getResource("/blue.png")).getImage();
		btnNewButton_5.setIcon(new ImageIcon(imgee));
		btnNewButton_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				panel_5.setBackground(new Color(0, 191, 255));
				textField.setBackground(new Color(224, 255, 255));
				textField_1.setBackground(new Color(224, 255, 255));
				btnNewButton.setForeground(new Color(70, 130, 180));
				btnNewButton.setBackground(new Color(224, 255, 255));
				chckbxNewCheckBox.setForeground(new Color(70, 130, 180));
				chckbxNewCheckBox.setBackground(new Color(224, 255, 255));
				chckbxNewCheckBox_1.setForeground(new Color(70, 130, 180));
						chckbxNewCheckBox_1.setBackground(new Color(224, 255, 255));
				chckbxNewCheckBox_2.setForeground(new Color(70, 130, 180));
						chckbxNewCheckBox_2.setBackground(new Color(224, 255, 255));
				chckbxNewCheckBox_3.setForeground(new Color(70, 130, 180));
						chckbxNewCheckBox_3.setBackground(new Color(224, 255, 255));
				panel_6.setForeground(new Color(70, 130, 180));
						panel_6.setBackground(new Color(224, 255, 255));
				panel_7.setBackground(new Color(0, 191, 255));
				textField_2.setBackground(new Color(224, 255, 255));
				passwordField.setBackground(new Color(224, 255, 255));
				lblNewLabel.setForeground(new Color(70, 130, 180));
				lblNewLabel_1.setForeground(new Color(70, 130, 180));
				btnNewButton_1.setForeground(new Color(70, 130, 180));
						btnNewButton_1.setBackground(new Color(224, 255, 255));
				panel_9.setBackground(new Color(224, 255, 255));
				
				frmtdtxtfldCjangeTheFont.setBackground(new Color(224, 255, 255));
						frmtdtxtfldCjangeTheFont.setForeground(new Color(70, 130, 180));
				rdbtnNewRadioButton.setForeground(new Color(70, 130, 180));
						rdbtnNewRadioButton.setBackground(new Color(0, 191, 255));
				btnNewButton_2.setBackground(new Color(224, 255, 255));
						btnNewButton_2.setForeground(new Color(70, 130, 180));
				rdbtnNewRadioButton_1.setForeground(new Color(70, 130, 180));
						rdbtnNewRadioButton_1.setBackground(new Color(0, 191, 255));
				slider.setBackground(new Color(0, 191, 255));
						slider.setForeground(new Color(224, 255, 255));
				lblNewLabel_2.setForeground(new Color(70, 130, 180));
				lblNewLabel_3.setForeground(new Color(70, 130, 180));
				panel_8.setBackground(new Color(0, 191, 255));
				mnNewMenu.setForeground(new Color(70, 130, 180));
						mnNewMenu.setBackground(new Color(224, 255, 255));
						panel_8.setBackground(new Color(0, 191, 255));
						lblNewLabel_4.setForeground(new Color(70, 130, 180));
						lblNewLabel_5.setForeground(new Color(70, 130, 180));
						textField.setForeground(new Color(70, 130, 180));
						textField_1.setForeground(new Color(70, 130, 180));
						
						
				
				
			}
		});
		panel_8.add(btnNewButton_5);
		panel_8.add(btnNewButton_4);
		
		
		
		/*
		 panel_8.setBackground(new Color(255, 255, 255));
		 panel_8.setBackground(new Color(255, 240, 245));
		 panel_8.setBackground(new Color(255, 192, 203));
		 panel_8.setBackground(new Color(219, 112, 147));
		 
		 */
		
		
			
		
		Font  a,b,c,d;
		a = new Font("Serif", Font.PLAIN, q);
		b = new Font("Serif", Font.BOLD, q);
	      c = new Font("Serif", Font.ITALIC, q);
	      d = new Font("Serif", Font.BOLD + Font.ITALIC, q); 
	      
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=slider.getValue();
				
				boolean j=rdbtnNewRadioButton_1.isSelected();
				boolean g=rdbtnNewRadioButton.isSelected();
				
				
				if(j && g)
				{
					
					frmtdtxtfldCjangeTheFont.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, i));
				}
				
				if(rdbtnNewRadioButton.isSelected())
				{
					
					
					
					frmtdtxtfldCjangeTheFont.setFont(new Font("Tahoma", Font.BOLD, i));
					
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					
					frmtdtxtfldCjangeTheFont.setFont(new Font("Tahoma", Font.ITALIC, i));
				}
				
				if(!j && !g )
				{
					frmtdtxtfldCjangeTheFont.setFont(new Font("Tahoma", Font.PLAIN, i));
				}
				
				
				
				
			}
		});
	}
}

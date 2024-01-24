package final_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log_in extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnLogin;
	private JButton btnLogin_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log_in frame = new Log_in();
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
	public Log_in() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 524);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Gmail");
		lblNewLabel_1.setBounds(42, 77, 60, 17);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(174, 73, 228, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.setBounds(0, 0, 1, 1);
		contentPane.add(list);
		
		btnLogin = new JButton("sign up");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sign_up sign = new Sign_up();
				sign.setVisible(true);
			}
		});
		btnLogin.setBounds(272, 310, 92, 26);
		contentPane.add(btnLogin);
		
		btnLogin_1 = new JButton("login");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnLogin_1.setBounds(174, 177, 114, 34);
		contentPane.add(btnLogin_1);
		
		JLabel lblDontHaveA = new JLabel("Already have an account ?");
		lblDontHaveA.setFont(new Font("Cantarell Extra Bold", Font.BOLD | Font.ITALIC, 15));
		lblDontHaveA.setBounds(33, 309, 231, 26);
		contentPane.add(lblDontHaveA);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 111, 218, 21);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Password");
		lblNewLabel_1_2_1.setBounds(42, 119, 60, 17);
		contentPane.add(lblNewLabel_1_2_1);
	}
}

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

public class Sign_up extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField pwdPassword;
	private JLabel lblNewLabel_2;
	private JButton btnLogin;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1_2;
	private JButton btnLogin_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_up frame = new Sign_up();
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
	public Sign_up() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 524);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setBackground(SystemColor.text);
		lblNewLabel.setBounds(42, 39, 92, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gmail");
		lblNewLabel_1.setBounds(42, 77, 60, 17);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(162, 73, 228, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 35, 206, 26);
		contentPane.add(textField_1);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(162, 177, 218, 21);
		contentPane.add(pwdPassword);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setBounds(42, 116, 60, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JSlider slider = new JSlider();
		slider.setToolTipText("");
		slider.setPaintLabels(true);
		slider.setBounds(166, 148, 200, 17);
		contentPane.add(slider);
		
		JList list = new JList();
		list.setBounds(0, 0, 1, 1);
		contentPane.add(list);
		
		lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(42, 148, 60, 17);
		contentPane.add(lblNewLabel_2);
		
		btnLogin = new JButton("sign up");
		btnLogin.setBounds(141, 262, 114, 34);
		contentPane.add(btnLogin);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rather not say", "Male", "Female"}));
		comboBox.setSelectedIndex(0);
		comboBox.setFont(new Font("Dialog", Font.BOLD, 12));
		comboBox.setBounds(162, 111, 114, 26);
		contentPane.add(comboBox);
		
		lblNewLabel_1_2 = new JLabel("Conform Password");
		lblNewLabel_1_2.setBounds(33, 215, 128, 17);
		contentPane.add(lblNewLabel_1_2);
		
		btnLogin_1 = new JButton("login");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Log_in log = new Log_in();
				log.setVisible(true);
			}
		});
		btnLogin_1.setBounds(291, 367, 114, 34);
		contentPane.add(btnLogin_1);
		
		JLabel lblDontHaveA = new JLabel("Already have an account ?");
		lblDontHaveA.setFont(new Font("Cantarell Extra Bold", Font.BOLD | Font.ITALIC, 15));
		lblDontHaveA.setBounds(42, 370, 231, 26);
		contentPane.add(lblDontHaveA);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(162, 213, 218, 21);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Password");
		lblNewLabel_1_2_1.setBounds(42, 177, 92, 26);
		contentPane.add(lblNewLabel_1_2_1);
	}
}

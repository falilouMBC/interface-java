package projet.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class connexions extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					connexions frame = new connexions();
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
	public connexions() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel topanel = new JPanel();
		topanel.setBorder(null);
		topanel.setBackground(new Color(46, 139, 87));
		contentPane.add(topanel);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setBackground(new Color(46, 139, 87));
		txtpnLogin.setForeground(Color.WHITE);
		txtpnLogin.setFont(new Font("Segoe UI Symbol", Font.BOLD, 26));
		txtpnLogin.setText("Se Connecter");
		
		txtUsername = new JTextField();
		txtUsername.setBackground(Color.WHITE);
		txtUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Connecter");
		btnNewButton.setForeground(new Color(46, 139, 87));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setText("Username");
		txtpnUsername.setForeground(Color.WHITE);
		txtpnUsername.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		txtpnUsername.setBackground(new Color(46, 139, 87));
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setForeground(Color.WHITE);
		txtpnPassword.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		txtpnPassword.setBackground(new Color(46, 139, 87));
		
		passwordField = new JPasswordField();
		GroupLayout gl_topanel = new GroupLayout(topanel);
		gl_topanel.setHorizontalGroup(
			gl_topanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_topanel.createSequentialGroup()
					.addGap(117)
					.addGroup(gl_topanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_topanel.createSequentialGroup()
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_topanel.createSequentialGroup()
							.addGroup(gl_topanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_topanel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(txtpnLogin, Alignment.TRAILING)
									.addComponent(txtpnUsername, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtUsername, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
									.addComponent(txtpnPassword, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(133, Short.MAX_VALUE))))
		);
		gl_topanel.setVerticalGroup(
			gl_topanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_topanel.createSequentialGroup()
					.addComponent(txtpnLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(txtpnUsername, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnPassword, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		topanel.setLayout(gl_topanel);
	}
}

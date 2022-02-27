package projet.ui;

import javax.swing.JFrame;


import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextPane;

import java.awt.Component;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.Color;


public class Admin extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField txtRechercherUnUtilisateur;
	private JTextField idField;
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField loginField;
	private JTextField passwordField;
	private JTextField emailField;
	private JTable table;
	private JTextField numTelField;
	private JTextField fonctionField;
	private JButton modifier;
	private JButton creer;
	private JButton supprimer;
	private JButton exit;
	

	public Admin() {
		getContentPane().setBackground(new Color(46, 139, 87));
		setBackground(new Color(46, 139, 87));
		setTitle("Administrateur");
		createInstanceComponents();
		initComponents();
		addListeners();
	}
		
		private void createInstanceComponents() {
			idField = new JTextField();
			nomField = new JTextField();
			prenomField = new JTextField();
			loginField = new JTextField();
			passwordField = new JTextField();
			emailField = new JTextField();
			numTelField = new JTextField();
			fonctionField = new JTextField();
			
			
		}
		
		private void addListeners() {
			/*modifier.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
						try {
							administrateur.update(utilisateur);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				}
			
			});
			
			creer.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						administrateur.create(utilisateur);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			
			supprimer.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int id = 0;
					try {
						administrateur.delete(id);
					} catch (UMSException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			
			
			exit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					onExit();
					
				}
			});


			table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {			
				@Override
				public void valueChanged(ListSelectionEvent e) {
					onValueChanged();
				}
			});*/
			
			
			
		}
		
		
		private void initComponents() {
			JPanel Northpanel = 
					new JPanel();
			Northpanel.setBackground(new Color(46, 139, 87));
			getContentPane().add(Northpanel, BorderLayout.NORTH);
			Northpanel.setLayout(new BorderLayout(0, 0));
			
			JPanel Textpanel = new JPanel();
			Textpanel.setBackground(new Color(46, 139, 87));
			Northpanel.add(Textpanel, BorderLayout.WEST);
			FlowLayout fl_Textpanel = new FlowLayout(FlowLayout.LEFT, 5, 5);
			Textpanel.setLayout(fl_Textpanel);
			
			JTextPane txtpnGestionDesComptes = new JTextPane();
			txtpnGestionDesComptes.setBackground(new Color(46, 139, 87));
			txtpnGestionDesComptes.setText("GESTION DES COMPTES");
			Textpanel.add(txtpnGestionDesComptes);
			
		
			
			JPanel Searchpanel = new JPanel();
			Searchpanel.setBackground(new Color(46, 139, 87));
			Northpanel.add(Searchpanel, BorderLayout.EAST);
			
			txtRechercherUnUtilisateur = new JTextField();
			txtRechercherUnUtilisateur.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			txtRechercherUnUtilisateur.setAlignmentX(Component.RIGHT_ALIGNMENT);
			txtRechercherUnUtilisateur.setText("Rechercher un utilisateur");
			Searchpanel.add(txtRechercherUnUtilisateur);
			txtRechercherUnUtilisateur.setColumns(15);
			
			JButton SearchButton = new JButton("Search");
			Searchpanel.add(SearchButton);
			
			JPanel southpanel = new JPanel();
			southpanel.setBackground(new Color(46, 139, 87));
			southpanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			FlowLayout flowLayout = (FlowLayout) southpanel.getLayout();
			getContentPane().add(southpanel, BorderLayout.SOUTH);
			
			JButton modifier = new JButton("Modifier");
			modifier.setBackground(new Color(46, 139, 87));
			southpanel.add(modifier);
			
			JButton supprimer = new JButton("Supprimer");
			supprimer.setBackground(new Color(46, 139, 87));
			southpanel.add(supprimer);
			
			JButton creer = new JButton("Creer");
			creer.setBackground(new Color(46, 139, 87));
			southpanel.add(creer);
			
			JButton exit = new JButton("Exit");
			exit.setBackground(new Color(46, 139, 87));
			southpanel.add(exit);
			
			JPanel CenterPanel = new JPanel();
			CenterPanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			CenterPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
			getContentPane().add(CenterPanel, BorderLayout.CENTER);
			CenterPanel.setLayout(new BorderLayout(0, 0));
			
			JPanel northCenterpanel = new JPanel();
			northCenterpanel.setBackground(new Color(46, 139, 87));
			northCenterpanel.setBorder(new TitledBorder(null, "User Form", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			CenterPanel.add(northCenterpanel, BorderLayout.NORTH);
			northCenterpanel.setLayout(new GridLayout(8, 1, 0, 0));
			
			JPanel nomPanel = new JPanel();
			nomPanel.setBackground(new Color(46, 139, 87));
			northCenterpanel.add(nomPanel);
			nomPanel.setLayout(new FlowLayout(FlowLayout.TRAILING, 5, 5));
			
			JLabel NomLabel = new JLabel("Nom");
			nomPanel.add(NomLabel);
			
			nomField = new JTextField();
			nomField.setBackground(new Color(248, 248, 255));
			nomPanel.add(nomField);
			nomField.setColumns(10);
			
			JPanel prenomPanel = new JPanel();
			prenomPanel.setBackground(new Color(46, 139, 87));
			FlowLayout flowLayout_3 = (FlowLayout) prenomPanel.getLayout();
			flowLayout_3.setAlignment(FlowLayout.TRAILING);
			northCenterpanel.add(prenomPanel);
			
			JLabel prenomLable = new JLabel("Prenom");
			prenomPanel.add(prenomLable);
			
			prenomField = new JTextField();
			prenomPanel.add(prenomField);
			prenomField.setColumns(10);
			
			JPanel loginPanel = new JPanel();
			loginPanel.setBackground(new Color(46, 139, 87));
			FlowLayout flowLayout_4 = (FlowLayout) loginPanel.getLayout();
			flowLayout_4.setAlignment(FlowLayout.TRAILING);
			northCenterpanel.add(loginPanel);
			
			JLabel loginLabel = new JLabel("Login");
			loginPanel.add(loginLabel);
			
			loginField = new JTextField();
			loginPanel.add(loginField);
			loginField.setColumns(10);
			
			JPanel passwordPanel = new JPanel();
			passwordPanel.setBackground(new Color(46, 139, 87));
			FlowLayout flowLayout_5 = (FlowLayout) passwordPanel.getLayout();
			flowLayout_5.setAlignment(FlowLayout.RIGHT);
			northCenterpanel.add(passwordPanel);
			
			JLabel passwordLabel = new JLabel("Password");
			passwordPanel.add(passwordLabel);
			
			passwordField = new JTextField();
			passwordPanel.add(passwordField);
			passwordField.setColumns(10);
			
			JPanel numTelPanel = new JPanel();
			numTelPanel.setBackground(new Color(46, 139, 87));
			FlowLayout fl_numTelPanel = (FlowLayout) numTelPanel.getLayout();
			fl_numTelPanel.setAlignment(FlowLayout.RIGHT);
			northCenterpanel.add(numTelPanel);
			
			JLabel numTelLabel = new JLabel("Numero de Telephone");
			numTelLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
			numTelPanel.add(numTelLabel);
			
			numTelField = new JTextField();
			numTelPanel.add(numTelField);
			numTelField.setColumns(10);
			
			JPanel emailPanel = new JPanel();
			emailPanel.setBackground(new Color(46, 139, 87));
			FlowLayout fl_emailPanel = (FlowLayout) emailPanel.getLayout();
			fl_emailPanel.setAlignment(FlowLayout.RIGHT);
			northCenterpanel.add(emailPanel);
			
			JLabel emailLabel = new JLabel("Email");
			emailPanel.add(emailLabel);
			
			emailField = new JTextField();
			emailPanel.add(emailField);
			emailField.setColumns(10);
			
			JPanel fonctionPanel = new JPanel();
			fonctionPanel.setBackground(new Color(46, 139, 87));
			FlowLayout flowLayout_2 = (FlowLayout) fonctionPanel.getLayout();
			flowLayout_2.setAlignment(FlowLayout.RIGHT);
			northCenterpanel.add(fonctionPanel);
			
			JLabel fonctionLabel = new JLabel("Fonction");
			fonctionPanel.add(fonctionLabel);
			
			fonctionField = new JTextField();
			fonctionField.setColumns(10);
			fonctionPanel.add(fonctionField);
			
			JPanel eastPanel = new JPanel();
			getContentPane().add(eastPanel, BorderLayout.EAST);
			eastPanel.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			eastPanel.add(scrollPane, BorderLayout.CENTER);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Nom", "Prenom", "Login", "Password", "Numero de Telephone", "Email", "Fonction"
				}
			));
			scrollPane.setViewportView(table);
		}
		
		
		protected void onExit() {
			if (JOptionPane.YES_OPTION == 
					JOptionPane.showConfirmDialog
					(null, "Voulez-vous vraiment quitter l'application ?",
							"Confirmation", 
					JOptionPane.YES_NO_OPTION)) {

				dispose();
			}
		}
		
		

	
	public void montreToi() {
		this.setVisible(true);
	   }
}


	

	package projet.ui;

	



	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

	import javax.swing.GroupLayout;
	import javax.swing.GroupLayout.Alignment;
	
	import javax.swing.JButton;
	import java.awt.Color;
	
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	
	import javax.swing.JTextPane;
	import java.awt.Font;
	import javax.swing.LayoutStyle.ComponentPlacement;
	
	import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

	public class Enseignant extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;


		private JPanel contentPane;

		
		private JTable table_1;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Enseignant frame2 = new Enseignant();
						frame2.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public Enseignant() {
			setBackground(Color.WHITE);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 970, 498);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(46, 139, 87));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);

			JTextPane txtpnEnseignant = new JTextPane();
			txtpnEnseignant.setFont(new Font("Tahoma", Font.BOLD, 20));
			txtpnEnseignant.setText("ENSEIGNANT");
			txtpnEnseignant.setToolTipText("");
			txtpnEnseignant.setForeground(new Color(255, 255, 255));
			txtpnEnseignant.setBackground(new Color(46, 139, 87));

			
			
			JScrollPane scrollPane = new JScrollPane();
			
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Cours", "S\u00E9ances r\u00E9alis\u00E9es", "Nombre d'heures restantes"
				}
			));
			scrollPane.setViewportView(table_1);
			
			JTextPane txtpnCours = new JTextPane();
			txtpnCours.setForeground(new Color(248, 248, 255));
			txtpnCours.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtpnCours.setBackground(new Color(46, 139, 87));
			txtpnCours.setText("Cours");
			
			textField = new JTextField();
			textField.setColumns(10);
			
			JTextPane txtpnSeancesRealises = new JTextPane();
			txtpnSeancesRealises.setForeground(new Color(245, 255, 250));
			txtpnSeancesRealises.setBackground(new Color(46, 139, 87));
			txtpnSeancesRealises.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtpnSeancesRealises.setText("S\u00E9ances r\u00E9alis\u00E9es");
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			
			JTextPane txtpnNbreDheuresRestante = new JTextPane();
			txtpnNbreDheuresRestante.setBackground(new Color(46, 139, 87));
			txtpnNbreDheuresRestante.setText("Nombre D'Heures restantes");
			txtpnNbreDheuresRestante.setForeground(new Color(248, 248, 255));
			txtpnNbreDheuresRestante.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			
			JButton validerSession = new JButton("Valider Session");
			validerSession.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			JButton voirEDT = new JButton("Voir Emploi du Temps");
			voirEDT.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			JButton demanderAnnulationCours = new JButton("Demander annulation Cours");
			demanderAnnulationCours.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(txtpnEnseignant, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(126)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtpnCours, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
											.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
													.addComponent(textField_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
													.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
													.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
													.addComponent(txtpnSeancesRealises, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtpnNbreDheuresRestante, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(73))))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(18)
										.addComponent(validerSession)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(voirEDT)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(demanderAnnulationCours)
										.addContainerGap())))))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(txtpnEnseignant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(txtpnCours, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnSeancesRealises, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnNbreDheuresRestante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addGap(94)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(validerSession)
									.addComponent(voirEDT)
									.addComponent(demanderAnnulationCours)))
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
						.addGap(34))
			);
			contentPane.setLayout(gl_contentPane);
		}
	}



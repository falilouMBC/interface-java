package projet.ui;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class ChefDeClasse extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChefDeClasse frame1 = new ChefDeClasse();
					frame1.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public ChefDeClasse() {
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(46, 139, 87));
		getContentPane().add(contentPane, BorderLayout.NORTH);
		
		JTextPane txtpnChefDeClasse = new JTextPane();
		txtpnChefDeClasse.setText("COURS");
		txtpnChefDeClasse.setToolTipText("");
		txtpnChefDeClasse.setForeground(Color.WHITE);
		txtpnChefDeClasse.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnChefDeClasse.setBackground(new Color(46, 139, 87));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JTextPane txtpnCours = new JTextPane();
		txtpnCours.setText("Cours");
		txtpnCours.setForeground(new Color(248, 248, 255));
		txtpnCours.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnCours.setBackground(new Color(46, 139, 87));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JTextPane txtpnHeureDeDebut = new JTextPane();
		txtpnHeureDeDebut.setText("Heure De Debut");
		txtpnHeureDeDebut.setForeground(new Color(245, 255, 250));
		txtpnHeureDeDebut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHeureDeDebut.setBackground(new Color(46, 139, 87));
		
		JTextPane txtpnHeureDeFin = new JTextPane();
		txtpnHeureDeFin.setText("Heure De Fin");
		txtpnHeureDeFin.setForeground(new Color(248, 248, 255));
		txtpnHeureDeFin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnHeureDeFin.setBackground(new Color(46, 139, 87));
		
		JTextPane txtpnContenu = new JTextPane();
		txtpnContenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnContenu.setForeground(new Color(245, 255, 250));
		txtpnContenu.setBackground(new Color(46, 139, 87));
		txtpnContenu.setText("Contenu\r\n");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton valider = new JButton("VALIDER");
		
		JButton modifier = new JButton("MODIFIER");
		
		JButton exit = new JButton("EXIT");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtpnChefDeClasse, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(126)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(txtpnHeureDeDebut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtpnHeureDeFin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtpnCours, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
									.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
									.addComponent(txtpnContenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
							.addGap(101))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(167)
					.addComponent(valider, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addGap(130)
					.addComponent(modifier, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
					.addComponent(exit, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addGap(189))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnChefDeClasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtpnCours, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnHeureDeDebut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnHeureDeFin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addComponent(txtpnContenu, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
					.addGap(59)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(valider)
						.addComponent(exit)
						.addComponent(modifier))
					.addGap(37))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cours", "Heure de Debut", "Heure de Fin", "Contenu"
			}
		));
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
	

}

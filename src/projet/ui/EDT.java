package projet.ui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EDT extends JFrame{
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public EDT() {
		setTitle("EMPLOI DU TEMPS\r\n");
		getContentPane().setBackground(new Color(46, 139, 87));
		
		JTextPane txtpnCreerEmploiDu = new JTextPane();
		txtpnCreerEmploiDu.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnCreerEmploiDu.setForeground(new Color(255, 255, 255));
		txtpnCreerEmploiDu.setText("CREER EMPLOI DU TEMPS");
		txtpnCreerEmploiDu.setBackground(new Color(46, 139, 87));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JTextPane Cours = new JTextPane();
		Cours.setFont(new Font("Tahoma", Font.BOLD, 20));
		Cours.setForeground(new Color(255, 255, 255));
		Cours.setCaretColor(new Color(255, 255, 255));
		Cours.setBackground(new Color(46, 139, 87));
		Cours.setText("Cours\r\n");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JTextPane txtpnDuree = new JTextPane();
		txtpnDuree.setBackground(new Color(46, 139, 87));
		txtpnDuree.setText("Duree");
		txtpnDuree.setForeground(new Color(255, 255, 255));
		txtpnDuree.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JTextPane nomEnseignant = new JTextPane();
		nomEnseignant.setText("Nom de l'Enseignant");
		nomEnseignant.setFont(new Font("Tahoma", Font.BOLD, 20));
		nomEnseignant.setForeground(new Color(255, 255, 255));
		nomEnseignant.setBackground(new Color(46, 139, 87));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton valider = new JButton("Valider Emploi du Temps");
		valider.setBackground(new Color(46, 139, 87));
		valider.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton modifier = new JButton("Modifier Emploi du Temps");
		modifier.setFont(new Font("Tahoma", Font.BOLD, 15));
		modifier.setBackground(new Color(46, 139, 87));
		
		JButton exit = new JButton("EXIT");
		exit.setBackground(new Color(46, 139, 87));
		exit.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(71)
							.addComponent(valider)
							.addPreferredGap(ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
							.addComponent(exit, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 576, GroupLayout.PREFERRED_SIZE)
									.addGap(93)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_2)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(nomEnseignant)
											.addComponent(textField, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
											.addComponent(Cours, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtpnDuree, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_1))))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(modifier)
									.addComponent(txtpnCreerEmploiDu, GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(8)
					.addComponent(txtpnCreerEmploiDu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Cours, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(txtpnDuree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addComponent(nomEnseignant, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, 0, 0, Short.MAX_VALUE))
					.addGap(125)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(exit)
						.addComponent(valider, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(modifier, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(152))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Lundi", null, null},
				{"Mardi", null, null},
				{"Mercredi", null, null},
				{"Jeudi", null, null},
				{"Vendredi", null, null},
				{"Samedi", null, null},
			},
			new String[] {
				"", "8H00-10H00      10H30-12H30", "14H30-16H00    16H00-18H00"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(156);
		table.getColumnModel().getColumn(1).setMinWidth(50);
		table.getColumnModel().getColumn(2).setPreferredWidth(152);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
	}
	

}

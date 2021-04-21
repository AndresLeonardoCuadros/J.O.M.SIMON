package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;


public class PanelSalir extends JPanel{

	private JLabel labVacio1;
	private JButton btnTerminar;
	private JLabel labVacio2;

	public PanelSalir () {
		setLayout(new GridLayout(3,1));
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		setBackground(Color.BLACK);

		btnTerminar = new JButton("Terminar");
		btnTerminar.setActionCommand("BTNTERMINAR");
		btnTerminar.setOpaque(true);
		btnTerminar.setBackground(Color.BLACK);
		btnTerminar.setBorder(null);
		btnTerminar.setFocusPainted(false);
		btnTerminar.setFont(new Font("Forte", Font.ITALIC, 27));
		btnTerminar.setForeground(Color.white);
		
		labVacio1 = new JLabel();
		labVacio2 = new JLabel();
		
		add(labVacio1);
		add(btnTerminar);	
		add(labVacio2);
	}

	public JButton getBtnTerminar() {
		return btnTerminar;
	}

	public void setBtnTerminar(JButton btnTerminar) {
		this.btnTerminar = btnTerminar;
	}

}


package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class PanelReglas extends JPanel{


	public JLabel labelFondo;
	public Icon iconFondo;
	public JLabel labelTitulo;
	public 	JTextArea txtAreglas;
	private JButton btnVolver;

	public PanelReglas () {
		SpringLayout layout = new SpringLayout();
		setLayout(layout);
        iconFondo = new ImageIcon("imagenes/reglas1.png");
		labelFondo = new JLabel(iconFondo);
    	labelFondo.setBounds(0, 0, 350, 600);
		
		labelTitulo= new JLabel("Reglas de juego");
		labelTitulo.setFont(new Font("Forte", Font.ITALIC, 40));
		labelTitulo.setForeground(Color.WHITE);
		
		txtAreglas= new JTextArea();
		
		txtAreglas.setFont(new Font("Forte", Font.ITALIC, 15));
		txtAreglas.setBackground(new Color (0,0,0,0));
		txtAreglas.setForeground(Color.WHITE);
		btnVolver = new JButton("VOLVER");
		btnVolver.setActionCommand("BTNVOLVER");
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setBorder(null);
		btnVolver.setFocusPainted(false);
		btnVolver.setFont(new Font("Forte", Font.ITALIC, 30));
		btnVolver.setForeground(Color.BLACK);

		layout.putConstraint(SpringLayout.NORTH, labelTitulo, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, labelTitulo, 70, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, labelTitulo, 100, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, labelTitulo, 480, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.NORTH, txtAreglas, 90, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, txtAreglas, 450, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, txtAreglas, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, txtAreglas, 480, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.NORTH, btnVolver, 470, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, btnVolver, 530, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, btnVolver, 190, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, btnVolver, 310, SpringLayout.WEST, this);
	
		
		add(labelTitulo);
		add(txtAreglas);
		add(btnVolver);
		add(labelFondo);
		
	}

	public JTextArea getTxtAinstrucciones() {
		return txtAreglas;
	}

	public void setTxtAinstrucciones(JTextArea txtAinstrucciones) {
		this.txtAreglas = txtAinstrucciones;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
}
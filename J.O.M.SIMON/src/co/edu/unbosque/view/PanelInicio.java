package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class PanelInicio extends JPanel{
	
	private JButton btnJugar;
	private JButton btnReglas;
	public JLabel labelFondo;
	public Icon iconFondo;
	public JLabel labelTitulo;
	public JLabel labelSubitulo;
	
	public PanelInicio(){
		SpringLayout layout = new SpringLayout();
		setLayout(layout);
        iconFondo = new ImageIcon("imagenes/simon.jpg");
		labelFondo = new JLabel(iconFondo);
//    	labelFondo.setBounds(0, 0, 350, 600);
		
		labelTitulo= new JLabel("Simon");
		labelTitulo.setFont(new Font("Forte", Font.ITALIC, 100));
		labelTitulo.setForeground(Color.WHITE);
		
		labelSubitulo= new JLabel("says");
		labelSubitulo.setFont(new Font("Forte", Font.ITALIC, 70));
		labelSubitulo.setForeground(Color.WHITE);
		
		btnJugar = new JButton("JUGAR");
		btnJugar.setActionCommand("BTNJUGAR");
		btnJugar.setBackground(Color.white);
		btnJugar.setBorder(null);
		btnJugar.setFocusPainted(false);
		btnJugar.setFont(new Font("Forte", Font.ITALIC, 30));
		btnJugar.setForeground(Color.BLACK);

		btnReglas = new JButton("REGLAS");
		btnReglas.setActionCommand("BTNREGLAS");
		btnReglas.setBackground(Color.white);
		btnReglas.setBorder(null);
		btnReglas.setFocusPainted(false);
		btnReglas.setFont(new Font("Forte", Font.ITALIC, 30));
		btnReglas.setForeground(Color.BLACK);
		
		layout.putConstraint(SpringLayout.NORTH, labelTitulo, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, labelTitulo, 120, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, labelTitulo, 120, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, labelTitulo, 480, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.NORTH, labelSubitulo, 5, SpringLayout.SOUTH, labelTitulo);
		layout.putConstraint(SpringLayout.SOUTH, labelSubitulo, 50, SpringLayout.SOUTH, labelTitulo);
		layout.putConstraint(SpringLayout.WEST, labelSubitulo, 180, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, labelSubitulo, 450, SpringLayout.WEST, this);
		
		
		layout.putConstraint(SpringLayout.NORTH, btnReglas, 470, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, btnReglas, 530, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, btnReglas, 30, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, btnReglas, 230, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.NORTH, btnJugar, 470, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, btnJugar, 530, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, btnJugar, 30, SpringLayout.EAST, btnReglas);
		layout.putConstraint(SpringLayout.EAST, btnJugar, 230, SpringLayout.EAST, btnReglas);
	
		add(labelTitulo);
		add(labelSubitulo);
		add(	btnJugar);
		add(btnReglas);
		add(labelFondo);
	
	}

	public JLabel getLabelFondo() {
		return labelFondo;
	}

	public void setLabelFondo(JLabel labelFondo) {
		this.labelFondo = labelFondo;
	}

	public Icon getIconFondo() {
		return iconFondo;
	}

	public void setIconFondo(Icon iconFondo) {
		this.iconFondo = iconFondo;
	}

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JLabel getLabelSubitulo() {
		return labelSubitulo;
	}

	public void setLabelSubitulo(JLabel labelSubitulo) {
		this.labelSubitulo = labelSubitulo;
	}

	public JButton getBtnJugar() {
		return btnJugar;
	}

	public void setBtnJugar(JButton btnJugar) {
		this.btnJugar = btnJugar;
	}

	public JButton getBtnReglas() {
		return btnReglas;
	}

	public void setBtnReglas(JButton btnReglas) {
		this.btnReglas = btnReglas;
	}

}

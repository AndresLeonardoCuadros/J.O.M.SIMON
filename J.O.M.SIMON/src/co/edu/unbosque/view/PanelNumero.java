package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class  PanelNumero extends JPanel
{
	private JLabel labVacio;
	private JLabel labNumero;
	private JLabel labNumero1;
	private JLabel labNumero2;
	private JLabel labNumero3;
	private JLabel labNumero4;

	public PanelNumero() {
		setLayout(new GridLayout(1,5));
		setBackground(Color.BLACK);
		
		labVacio = new JLabel(" ");
		labNumero = new JLabel("Numero:");
		labNumero.setFont( new Font("Forte", Font.ITALIC, 20));
		labNumero.setForeground(Color.WHITE);
		labNumero1 = new JLabel ("#");
		labNumero1.setForeground(Color.WHITE);
		labNumero2 = new JLabel ("#");
		labNumero2.setForeground(Color.WHITE);
		labNumero3 = new JLabel ("#");
		labNumero3.setForeground(Color.WHITE);
		labNumero4 = new JLabel ("#");
		labNumero4.setForeground(Color.WHITE);

		add(labNumero);
		add(labVacio);
		add(labNumero1);
		add(labNumero2);
		add(labNumero3);
		add(labNumero4);
	}

	public JLabel getLabNumero() {
		return labNumero;
	}

	public void setLabNumero(JLabel labNumero) {
		this.labNumero = labNumero;
	}

	public JLabel getLabNumero1() {
		return labNumero1;
	}

	public void setLabNumero1(JLabel labNumero1) {
		this.labNumero1 = labNumero1;
	}

	public JLabel getLabNumero2() {
		return labNumero2;
	}

	public void setLabNumero2(JLabel labNumero2) {
		this.labNumero2 = labNumero2;
	}

	public JLabel getLabNumero3() {
		return labNumero3;
	}

	public void setLabNumero3(JLabel labNumero3) {
		this.labNumero3 = labNumero3;
	}

	public JLabel getLabNumero4() {
		return labNumero4;
	}

	public void setLabNumero4(JLabel labNumero4) {
		this.labNumero4 = labNumero4;
	}

}

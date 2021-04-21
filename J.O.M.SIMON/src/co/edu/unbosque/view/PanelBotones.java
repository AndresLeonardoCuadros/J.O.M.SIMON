package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel 
{

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	
	public PanelBotones() {

		setLayout(new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder("Botones");
		border.setTitleColor(Color.BLACK);
		setBackground(Color.BLACK);
		
		btn1 = new JButton("1");
		btn1.setActionCommand("BTN1");
		btn1.setBackground(Color.YELLOW);
		btn1.setContentAreaFilled(true);
		btn1.setOpaque(true);
		btn1.setFont(new Font("Forte", Font.ITALIC, 90));
		btn1.setForeground(Color.BLACK);
		btn1.setFocusPainted(false);
		btn1.setBorder(null);
		
		
		btn2 = new JButton("2");
		btn2.setActionCommand("BTN2");
		btn2.setBackground(Color.GREEN);
		btn2.setContentAreaFilled(true);
		btn2.setOpaque(true);
		btn2.setFont(new Font("Forte", Font.ITALIC, 90));
		btn2.setForeground(Color.BLACK);
		btn2.setFocusPainted(false);
		btn2.setBorder(null);
		
		btn3= new JButton("3");
		btn3.setActionCommand("BTN3");
		btn3.setBackground(Color.red );
		btn3.setContentAreaFilled(true);
		btn3.setOpaque(true);
		btn3.setFont(new Font("Forte", Font.ITALIC, 90));
		btn3.setForeground(Color.BLACK);
		btn3.setFocusPainted(false);
		btn3.setBorder(null);
		

		btn4 = new JButton("4");
		btn4.setActionCommand("BTN4");
		btn4.setBackground(Color.blue);
		btn4.setContentAreaFilled(true);
		btn4.setOpaque(true);
		btn4.setFont(new Font("Forte", Font.ITALIC, 90));
		btn4.setForeground(Color.BLACK);
		btn4.setFocusPainted(false);
		btn4.setBorder(null);
		

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}
}
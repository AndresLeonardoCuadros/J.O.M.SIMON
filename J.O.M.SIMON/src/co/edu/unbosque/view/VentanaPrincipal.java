package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import co.edu.unbosque.controller.Controller;

public class VentanaPrincipal extends JFrame {

	private PanelNumero pN;
	private PanelBotones pB;
	private PanelSalir pS;

	public VentanaPrincipal(Controller c) {

		setSize(500,600);
		setTitle("SIMON");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());

		pN = new PanelNumero();
		pB = new PanelBotones();
		pS = new PanelSalir();	

		add(pN,BorderLayout.NORTH);
		add(pB,BorderLayout.CENTER);
		add(pS,BorderLayout.SOUTH);
		
		
	}

	public PanelNumero getpN() {
		return pN;
	}

	public void setpN(PanelNumero pN) {
		this.pN = pN;
	}

	public PanelBotones getpB() {
		return pB;
	}

	public void setpB(PanelBotones pB) {
		this.pB = pB;
	}

	public PanelSalir getpS() {
		return pS;
	}

	public void setpS(PanelSalir pS) {
		this.pS = pS;
	}




}
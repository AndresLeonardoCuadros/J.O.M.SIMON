package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VentanaBienvenida extends JFrame {

	public PanelInicio pIninio;
	public PanelReglas pReglas;
	
	public VentanaBienvenida() {
		setSize(500,600);
		setTitle("SIMON");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new CardLayout());
		setLocationRelativeTo(null);
		setResizable(false);
		
		pIninio = new PanelInicio();
		pReglas = new  PanelReglas();
		add(pIninio);
		add(pReglas);
		pIninio.setVisible(true);
		pReglas.setVisible(false);
}

	public PanelReglas getpReglas() {
		return pReglas;
	}

	public void setpReglas(PanelReglas pReglas) {
		this.pReglas = pReglas;
	}

	public PanelInicio getpIninio() {
		return pIninio;
	}

	public void setpIninio(PanelInicio pIninio) {
		this.pIninio = pIninio;
	}
	
	}
package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;


import co.edu.unbosque.view.VentanaBienvenida;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.model.Numeros;

public class Controller implements ActionListener{
	


	private VentanaPrincipal gui;
	private VentanaBienvenida vB;
	private Mundo m;
	private Numeros n;
	int contador;
	int aux[] =  new int [4];



	public Controller() {

	contador = 0;
	

		gui = new VentanaPrincipal(this);
		n = new Numeros(false);
		m = new Mundo();
		
		

		gui.setVisible(false);
		gui.getpB().getBtn1().addActionListener(this);
		gui.getpB().getBtn2().addActionListener(this);
		gui.getpB().getBtn3().addActionListener(this);
		gui.getpB().getBtn4().addActionListener(this);
		gui.getpS().getBtnTerminar().addActionListener(this);

		vB= new VentanaBienvenida();
		vB.setVisible(true);
		vB.getpIninio().getBtnReglas().addActionListener(this);
		vB.getpIninio().getBtnJugar().addActionListener(this);
		vB.getpReglas().getBtnVolver().addActionListener(this);
		escribirPropiedades();
		agregarReglas(m.gestionarArchivoCadena());
		desaparcer();
	
	}
	public void escribirPropiedades() {
		m.gestionarPropiedades();
	}
	public void agregarReglas(String [] a) {
		String d = "";
		for(int i = 0; i<a.length;i++) {
			d += a[i]+"\n";
		}
		vB.getpReglas().getTxtAinstrucciones().setText(d);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
   
		// TODO Auto-generated method stub	
		String comando = e.getActionCommand();
		if(comando.equals("BTNREGLAS")){
			vB.getpIninio().setVisible(false);
			vB.getpReglas().setVisible(true);
		
		} 
		else if (comando.equals("BTNVOLVER"))
		{
			vB.getpIninio().setVisible(true);
			vB.getpReglas().setVisible(false);
		}
		else if (comando.equals("BTNJUGAR"))
		{
			vB.setVisible(false);
			gui.setVisible(true);
	    n.numeroRandom();
		gui.getpN().getLabNumero1().setText(String.valueOf(n.devolverValor(0)));
		gui.getpN().getLabNumero2().setText(String.valueOf(n.devolverValor(1)));
		gui.getpN().getLabNumero3().setText(String.valueOf(n.devolverValor(2)));
		gui.getpN().getLabNumero4().setText(String.valueOf(n.devolverValor(3)));
			
			

		}
		else if (comando.equals("BTN1")) {
			if (contador < 4) {
				aux[contador] = 1;
				contador++;
			}
		
	
   
        } else if (comando.equals("BTN2")) {
        	if (contador < 4) {
				aux[contador] = 2;
				contador++;
        	}
        } else if (comando.equals("BTN3")) {
        	if (contador < 4) {
				aux[contador] = 3;
				contador++;
        	}
        } else if (comando.equals("BTN4")) {
        	if (contador < 4) {
				aux[contador] = 4;
				contador++;
        	}
            
        } else if (comando.equals("BTNTERMINAR")) {
          n.setAux(aux);
          if (contador < 4) {
        	 JOptionPane.showMessageDialog(null, m.generarExepciones()); 
          }
          else if(n.comparar()) {
        	  JOptionPane.showMessageDialog(null, "Ganaste");
        	  contador =0;
        	  vB.setVisible(true);
              gui.setVisible(false);
          }else {
        	  JOptionPane.showMessageDialog(null, "Perdiste",null, JOptionPane.ERROR_MESSAGE);
        	  contador =0;
        	  vB.setVisible(true);
              gui.setVisible(false);
          }
            vB.setVisible(true);
            gui.setVisible(false);
           
        }
		
		
	}
	public void desaparcer() {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Runnable r1 = () -> gui.getpN().getLabNumero1().setText(" ");
		Runnable r2 = () -> gui.getpN().getLabNumero2().setText(String.valueOf(n.devolverValor(1)));
		service.scheduleAtFixedRate(r1, 7, 1, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(r2, 7, 1, TimeUnit.SECONDS);
		Runnable r3 = () -> gui.getpN().getLabNumero2().setText(" ");
		Runnable r4 = () -> gui.getpN().getLabNumero3().setText(String.valueOf(n.devolverValor(2)));
		service.scheduleAtFixedRate(r3, 7, 1, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(r4, 7, 1, TimeUnit.SECONDS);
		Runnable r5 = () -> gui.getpN().getLabNumero3().setText(" ");
		Runnable r6 = () -> gui.getpN().getLabNumero4().setText(String.valueOf(n.devolverValor(3)));
		service.scheduleAtFixedRate(r5, 7, 1, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(r6, 7, 1, TimeUnit.SECONDS);
		Runnable r7 = () -> gui.getpN().getLabNumero4().setText( " ");
		service.scheduleAtFixedRate(r7, 7, 1, TimeUnit.SECONDS);
		
	}
}

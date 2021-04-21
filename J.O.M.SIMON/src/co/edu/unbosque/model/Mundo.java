package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ManejoDeArchivos;
import co.edu.unbosque.model.persistence.Propiedades;

public class Mundo {
 Numeros n = new Numeros(false);
	ManejoDeArchivos arc = new ManejoDeArchivos();
	Propiedades prop = new Propiedades();
	
	
	
	public int [] rellenar() {
		return n.numeroRandom();
	}
	public Boolean igualar () {
		return n.comparar();
	}
	public void gestionarPropiedades() {
		prop.escribirPropiedades();
		prop.leerPropiedades();
		
	}
	public String[] gestionarArchivoCadena() {
		arc.escribirArchivo();
		String a =  arc.leerArchivo();
		String arregloArchivo[]= a.split(";");
		return arregloArchivo;
	}
	
	public String generarExepciones() {
		
		try {
			
				throw new NumeroDePosiscionesErradasException();
				
			
		}
		catch ( NumeroDePosiscionesErradasException e) {
			return "No ha terminado su intento";
		}

		
	}
	

}

package co.edu.unbosque.model.persistence;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import co.edu.unbosque.model.Numeros;

public class ManejoDeArchivos {
	private Propiedades p = new Propiedades();
	
	private String archivodata = "Data/Reglas.txt";
	public int escribirArchivo () {
		File f = new File(this.archivodata);
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(p.leerPropiedades());
			fw.close();
		}catch (IOException e) {
			return -1;
			
		}
		return 0;
	}
	public String leerArchivo() {
		String linea = "";
		String cadena = "";
		File f = new File (this.archivodata);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			cadena += linea ;
			linea = br.readLine();
			fr.close();
		}catch (IOException e) {
			return null;
		}
		return cadena;
	}
}
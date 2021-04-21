package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	Properties prop = new Properties();
	File f = new File("Data/Propiedades.properties");

	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreDelProyecto", "SIMON");
			prop.setProperty("codigoFuente", "Propiedades.java");
			prop.setProperty("nombreArchivo", "Propiedades.properties");
			prop.setProperty("Reglas",
					"1. los numeros se te diran al azar;2.los numeros desapareceran despues de una momento;3.Los numeros pueden repetirse;4.Solo tendras una oportunidad si fallas el programa te lo dira si; aciertas tambien te avisara;TKM sobrino");
			prop.store(new FileOutputStream(f), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}

	public String leerPropiedades() {
		String linea = "";
		try {

			prop.load(new FileInputStream(f));
			prop.list(System.out);

			linea += prop.getProperty("Reglas") ;

		} catch (IOException ex) {
			return null;
		}
		return linea;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

}

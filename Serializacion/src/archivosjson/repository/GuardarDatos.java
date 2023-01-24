package archivosjson.repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarDatos {
	public void guardar(String fichero, String contenido)
	{
		
		File file= new File(fichero);
		FileWriter fileWriter;
		BufferedWriter bufferedWriter;
		
		try {
			fileWriter= new FileWriter(file);
			bufferedWriter= new BufferedWriter(fileWriter);
			bufferedWriter.write(contenido);
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

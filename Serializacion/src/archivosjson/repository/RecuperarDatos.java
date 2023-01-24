package archivosjson.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RecuperarDatos {
	
	public String leer(String fichero)
	
	{
		
		String contenido=null;
		
		
		
		File file= new File(fichero);
		FileReader fileReader;
		BufferedReader bufferedReader;
		try {
			 fileReader= new FileReader(file);
		     bufferedReader= new BufferedReader(fileReader);
			StringBuilder stringBuilder= new StringBuilder();
			
			String linea= bufferedReader.readLine();
			
			while(linea!=null)
			{
				
				stringBuilder.append(linea);
				linea= bufferedReader.readLine();
			}
			
			
			contenido= stringBuilder.toString();
			if(bufferedReader!=null)
			{
				bufferedReader.close();
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			
			
			
		}
		
		
		
		
		
		
		
		return contenido;
	}

}

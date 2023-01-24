package archivos.json.service;

import com.google.gson.Gson;

import archivos.json.model.domain.EstadoJuego;
import archivosjson.repository.GuardarDatos;

public class Serializar {
	
	public void SerializaEstadoJuego(EstadoJuego estadoJuego, String nombreFichero)
	{
		
		String contenido= getJsonFromObject(estadoJuego);
		GuardarDatos guardardatos= new GuardarDatos();
		guardardatos.guardar(nombreFichero, contenido);
		
	}
	
	private String getJsonFromObject(EstadoJuego estadoJuego)
	{
		
		Gson gson= new Gson();
		
		String json= gson.toJson(estadoJuego);
		
		return json;
	}

}

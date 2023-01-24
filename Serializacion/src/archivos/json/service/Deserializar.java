package archivos.json.service;

import com.google.gson.Gson;

import archivos.json.model.domain.EstadoJuego;
import archivosjson.repository.GuardarDatos;
import archivosjson.repository.RecuperarDatos;

public class Deserializar {
	public EstadoJuego deserealizaEstadoJuego(String nombreFichero)
	{
		EstadoJuego estadoJuego=null;
		RecuperarDatos recuperarDatos= new RecuperarDatos();
		
		String contenido =recuperarDatos.leer(nombreFichero);
		estadoJuego= getObjectFromJson( contenido);
		return estadoJuego;
		
	}
	
	private EstadoJuego getObjectFromJson(String contenido)
	{
		EstadoJuego estadoJuego= null;
		Gson gson= new Gson();
		
		estadoJuego= gson.fromJson(contenido, EstadoJuego.class);
		
		return estadoJuego;
		
	}

}

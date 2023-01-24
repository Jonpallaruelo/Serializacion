package archivosjson.controller;

import archivos.json.model.domain.EstadoJuego;
import archivos.json.service.Deserializar;
import archivos.json.service.Serializar;

public class GestionController {
	
	public void SerializaEstadoJuego(EstadoJuego estadoJuego, String nombreFichero)
	{
		
		Serializar serializar= new Serializar();
		serializar.SerializaEstadoJuego(estadoJuego, nombreFichero);
	}
	
	public EstadoJuego deserealizaEstadoJuego(String nombreFichero)
	{
		
		
		Deserializar deserializar= new Deserializar();
		
		return deserializar.deserealizaEstadoJuego(nombreFichero);
	}

}

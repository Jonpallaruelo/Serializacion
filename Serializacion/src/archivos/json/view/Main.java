package archivos.json.view;

import archivos.json.model.domain.EstadoJuego;
import archivosjson.controller.GestionController;

public class Main {
	
	private static final String NOMBRE_FICHERO="C:/pruebas/EstadoJuego.json";

	public static void main(String[] args) {
		
		
		//serializar();
		deserializar();
      
	}
	
	private static void serializar()
	{
		
		EstadoJuego estadoJuego= new EstadoJuego();
		estadoJuego.setAliasJugador("Jonathan");
		estadoJuego.setNumeroPantalla(2);
		estadoJuego.setCoordenadaX(2);
		estadoJuego.setCoordenadaY(4);
		estadoJuego.setCoordenadaZ(3);
		
		GestionController gestionController= new GestionController(); //llamamos al controlador
		gestionController.SerializaEstadoJuego(estadoJuego, NOMBRE_FICHERO);
		
		System.out.println("Fichero generado");
		
		
	}
	
	private static void deserializar()
	{
		GestionController gestionController= new GestionController();
		
		EstadoJuego estadoJuego=gestionController.deserealizaEstadoJuego(NOMBRE_FICHERO);
		System.out.println(estadoJuego);
		
		
		
	}

}

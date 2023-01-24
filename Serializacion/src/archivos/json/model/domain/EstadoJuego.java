package archivos.json.model.domain;

public class EstadoJuego {

	private String aliasJugador;
	private int numeroPantalla;
	private int coordenadaX;
	private int coordenadaY;
	private int coordenadaZ;

	public String getAliasJugador() {
		return aliasJugador;
	}

	public void setAliasJugador(String aliasJugador) {
		this.aliasJugador = aliasJugador;
	}

	public int getNumeroPantalla() {
		return numeroPantalla;
	}

	public void setNumeroPantalla(int numeroPantalla) {
		this.numeroPantalla = numeroPantalla;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public int getCoordenadaZ() {
		return coordenadaZ;
	}

	public void setCoordenadaZ(int coordenadaZ) {
		this.coordenadaZ = coordenadaZ;
	}

	@Override
	public String toString() {
		return "EstadoJuego [aliasJugador=" + aliasJugador + ", numeroPantalla=" + numeroPantalla + ", coordenadaX="
				+ coordenadaX + ", coordenadaY=" + coordenadaY + ", coordenadaZ=" + coordenadaZ + "]";
	}

}

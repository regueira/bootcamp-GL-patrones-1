package gl.bootcamp.example2.builder;

public class RogelBuilder extends TortaBuilder {

	public void buildNombre() {
		torta.setNombre("Rogel");
	}

	public void buildRelleno() {
		torta.setRelleno("Mucho dulce de leche");
	}

	public void buildCubierta() {
		torta.setCubierta("Merengue");
	}

}

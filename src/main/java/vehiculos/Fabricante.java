package vehiculos;

import java.util.HashMap;

public class Fabricante {
	String nombre;
	Pais pais;
	static public HashMap<Fabricante,Integer> ventasFabricante = new HashMap<Fabricante,Integer>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		ventasFabricante.put(this, 0);
	}
	Fabricante(){}
	
	public String getNombre() {
		return nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int max = 0;
		Fabricante maxFabricante = new Fabricante();
		
		for (Fabricante i : ventasFabricante.keySet()) {
			if (ventasFabricante.get(i)>max) {
				max = ventasFabricante.get(i);
				maxFabricante = i;
			}
		}
		return maxFabricante;
	}
}

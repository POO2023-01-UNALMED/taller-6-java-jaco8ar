package vehiculos;

import java.util.HashMap;

public class Pais {
	String nombre;
	static public HashMap<Pais, Integer> ventasPaises = new HashMap<Pais, Integer>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		ventasPaises.put(this, 0);
	}
	Pais() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		int max = 0;
		Pais maxPais = new Pais();
		
		for (Pais i: ventasPaises.keySet()) {
			if (ventasPaises.get(i) > max) {
				max = ventasPaises.get(i);
				maxPais = i;
			}
		}
		return maxPais;
		
	}

}

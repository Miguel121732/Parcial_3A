package NavesEspaciales;

// Clase abstracta
public abstract class Vehiculos implements Naves {
	
	
	//Atributos de una nave espacial
	private String tipo_de_nave;
	private int peso;
	private int altura;
	private int empuje;
	private int potencia;

	//Constructor
	public Vehiculos () {
		
	}

//Metodo Getter
public String dime_datos_generales () {
	
	return tipo_de_nave;
}

//Metodo setter
public void establece_peso_nave(int peso) {
	
	return;
}

//Metodo Getter
public int dime_peso() {
	
	return peso;
}
//Metodo Setter
public void establece_altura_nave(int altura) {
	
	return;
	
}
//Metodo Getter
public int dime_altura() {
	
	return altura;
}
//Metodo setter
public void establece_empuje(int empuje) {
	
	return;
	
}
//Metodo Getter
public int dime_empuje() {
	
	return empuje;
}
//Metodo Setter
public void establece_potencia(int potencia) {
	
	return;
}
//Metodo Getter
public int dime_potencia() {
	
	return potencia;
}

}
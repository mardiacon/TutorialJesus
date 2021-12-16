package poo;

public class Tutor {
	
	String nombre;
	Integer edad;
	String DNI;
	String sexo;
	Vivienda vivienda;

	public Tutor(String nombre, Integer edad, String DNI, String sexo, Vivienda vivienda) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.DNI=DNI;
		this.sexo=sexo;
		this.vivienda=vivienda;
	}
	
	public void mudarse(Vivienda vivienda) {
	
		this.vivienda = vivienda; 
	}
	
}

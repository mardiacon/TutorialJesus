package poo;

public class Gato {
	
	//Propiedades del gato
	//Las propiedades hay que encapsularlas, para manejar con seguridad su uso
    private String nombre;
    private Integer edad;
    private Tutor tutor;
    
    // Una clase puede tener m�s de un m�todo (trozo de c�digo que podemos usar y que va a realizar una acci�n). Todo m�todo va a empezar con public (de momento).
    //M�todo constructor
    public Gato(String nombre, Integer edad, Tutor tutor) {
        this.nombre = nombre;
        this.edad = edad;
        this.tutor = tutor; 
    }
    
    //Para acceder a las propiedades se usan los getters. Los getters son m�todos que devuelven el valor de las propiedades
    public String getNombre() {
    	return this.nombre;
    }
    
    public Integer getEdad() {
    	return this.edad;
    }
    
    public Tutor getTutor() {
		return tutor;
	}
    
    //Para modificar los valores controlando como queremos que se modifiquen se usan los setters.
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public void setEdad(Integer edad) {
    	if(edad < 0) {
    		System.out.println("No puedes meter una edad negativa");
    	}else {
    		this.edad = edad;
    	}
    }
    
    public void setTutor(Tutor tutor) {
    	this.tutor = tutor;
    }
    
    //M�todo para cumplir a�os
    public void cumpleAnyos() {
    	this.edad ++;
    }
    
    //M�todo para maullar
    public void maullar() {
    	System.out.println("Miau, me llamo " + this.nombre);
    }
    
    //M�todo para jugar
    
    public void jugar(Gato gato) {
    	System.out.println(this.nombre + " est� jugando con " + gato.nombre);
    }

    //Un m�todo puede ser est�tico o no. Si es est�tico pertenece a la clase. Si no es est�tico pertenece a los objetos. 
    
    public static void descripcion() {
    	System.out.println("Los gatos son felinos dom�sticos.");
    }
    
    //La funci�n del toString es la representaci�n textual del objeto. El m�todo devuelve el string que queramos que represente el gato creado. 
    public String toString() {
    	return "El gato se llama " + this.nombre + " tiene " + this.edad + " a�os y vive con " + this.tutor.nombre;
    }
}

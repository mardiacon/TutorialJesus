package poo;

public class Gato {
	
	//Propiedades del gato
	//Las propiedades hay que encapsularlas, para manejar con seguridad su uso
    private String nombre;
    private Integer edad;
    private Tutor tutor;
    
    // Una clase puede tener más de un método (trozo de código que podemos usar y que va a realizar una acción). Todo método va a empezar con public (de momento).
    //Método constructor
    public Gato(String nombre, Integer edad, Tutor tutor) {
        this.nombre = nombre;
        this.edad = edad;
        this.tutor = tutor; 
    }
    
    //Para acceder a las propiedades se usan los getters. Los getters son métodos que devuelven el valor de las propiedades
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
    
    //Método para cumplir años
    public void cumpleAnyos() {
    	this.edad ++;
    }
    
    //Método para maullar
    public void maullar() {
    	System.out.println("Miau, me llamo " + this.nombre);
    }
    
    //Método para jugar
    
    public void jugar(Gato gato) {
    	System.out.println(this.nombre + " está jugando con " + gato.nombre);
    }

    //Un método puede ser estático o no. Si es estático pertenece a la clase. Si no es estático pertenece a los objetos. 
    
    public static void descripcion() {
    	System.out.println("Los gatos son felinos domésticos.");
    }
    
    //La función del toString es la representación textual del objeto. El método devuelve el string que queramos que represente el gato creado. 
    public String toString() {
    	return "El gato se llama " + this.nombre + " tiene " + this.edad + " años y vive con " + this.tutor.nombre;
    }
}

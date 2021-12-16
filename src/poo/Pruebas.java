package poo;

public class Pruebas {

	public static void main(String[] args) {
		        
        
        Vivienda casa = new Vivienda("Avenida Hytasa, nº97, 4D", "piso", 97.0, 3);
        
        Vivienda piso = new Vivienda("Calle Chicuelo II, nº 1, 3D", "piso", 70.5, 2);
        
       
        Tutor marta = new Tutor("Marta", 24, "30237044W", "Mujer",casa);
        
        Tutor lucia = new Tutor("Lucía", 27, "30235972P", "Mujer", casa);
        
       
        System.out.println(marta.nombre + " es una " + marta.sexo + " de " + marta.edad + " años.");
       
        System.out.println(lucia.nombre + " es una " + lucia.sexo + " de " + lucia.edad + " años.");
        
    	
        Gato rosalie = new Gato("Rosalie", 9, marta);

        Gato whisky = new Gato("Whisky", 3, lucia);
        
        Gato paco = new Gato("Paco", 1, marta);

        System.out.println(whisky.getNombre() + " tiene "+ whisky.getEdad()+" años");
        
        System.out.println(rosalie.getTutor().nombre + " es la tutora de " + rosalie.getNombre());
        
        System.out.println(marta.nombre + " vive con " + rosalie.getNombre() + " en " + casa.direccion);
        
        
        rosalie.cumpleAnyos();
        
        System.out.println(rosalie.getEdad());
        
        
       rosalie.maullar();
       whisky.maullar();
       rosalie.jugar(whisky);
       whisky.jugar(paco);
       paco.jugar(rosalie);
       rosalie.jugar(paco);
       
       
       lucia.mudarse(piso); 
       
       System.out.println(lucia.vivienda.direccion);
       
       lucia.mudarse(casa);
       
       System.out.println(lucia.vivienda.direccion);
       
      
       Gato.descripcion();
       
       System.out.println(rosalie);
       System.out.println(whisky);
       System.out.println(paco);
       
       rosalie.setNombre("Rosy");
       
       
       System.out.println(rosalie.getEdad());
       rosalie.setEdad(5);
       System.out.println(rosalie.getEdad());
       
       whisky.setTutor(marta);
       
       
	}
}

package clases;

public class ApuntesGenerales {

	/* 
	 * ---IMPORTANTE TENER PRESENTE---
	 * 1. El código va de arriba a abajo
	 * 2. Todo lo que se muestra en pantalla va en un print
	 * 3. El código va saliendo poco a poco, no del tirón
	 * 4. Cada ciertas líneas de código imprimes por pantalla para ver si vas bien
	 */
	
	
	/*
	 * ---VARIABLES---
	 * Las variables son espacios de la memoria donde se van a guardar datos durante
	 * la ejecución del programa. Como su propio nombre indica, su valor puede variar 
	 * durante la ejecución.Cuando el programa acaba, se libera es espacio de memoria.
	 * 
	 * Una variable debe primero declararse. Con eso le estamos diciendo al programa
	 * que en ella vamos a meter un dato del tipo que sea. Para declarar una variable
	 * hay que poner el tipo seguido del nombre que le queremos dar a la variable.
	 * NOTA: no puede haber dos variables con el mismo nombre en el mismo ámbito.
	 * 
	 * Una vez hemos declarado una variable, ya le podemos asignar un valor en el 
	 * momento que queremos. Para asignar un valor, debemos poner el nombre de la
	 * variable = valor. Esto lo haremos para darle el valor inicial (inicializar), 
	 * o cualquier otro valor durante la ejecución del programa.
	 * NOTA: una variable se puede declarar e inicializar en una misma línea.
	 * 
	 * Una variable puede ser de tipo primitiva o de tipo objeto. 
	 * Primitivas -> int, double, boolean, char, long...
	 * Objetos -> Integer, Double, Boolean, String, Scanner, LocalDate, LocalTime, 
	 * Gato...
	 * 
	 * Hay un tipo de "variables" que son las constantes, las cuales van a mantener 
	 * el valor que se les de al principio para siempre. Para declarar una constante
	 * hay que poner la palabra final antes del tipo de la variable.
	 */
	
	
	/*
	 * ---OPERACIONES---
	 * Existe dos tipos de operaciones: aritméticas y lógicas:
	 * Aritméticas +, -, *, /, %
	 * Lógicas >, <, >=, <=, ==, !=. Devuelven resultados booleanos (true o false).
	 * Lógicas entre booleans && (y) , || (o).
	 */
	
	
	/*
	 * ---IF ELSE---
	 * Todo programa se ejecuta de arriba a abajo, ejecutando cada línea que se encuentra,
	 * pero a veces, querremos que alguna línea se ejecute o no, dependiendo de alguna 
	 * condición. Para eso se usa la estructura if else y if else-if else.
	 * 
		 * if(condición que queremos que se cumpla){
		 * Código que queremos que se ejecute si se cumple la condición.
		 * }else{
		 * Código que queremos qe se ejecute si no se cumple la condición.
		 * }
	 * 
	 * El else no necesita condición, ya que va a entrar si no se cumple la del if. 
	 * NOTA: la condición del if debe ser siempre un dato boolean, ya que
	 * queremos decir si sí (true) o si no (false).
	 */
	
	
	/*
	 * ---SWITCH---
	 * El switch es otro tipo de condicional. Se usa para evaluar datos concretos no booleans.
	 * Ponemos dentro de los paréntesis del switch el dato que queremos evaluar, y dentro de 
	 * sus llaves veremos en cada caso (case) qué queremos ejecutar siempre acabando cada caso
	 * con un break. En caso de que no se cumpla ningún caso, se ejecutará el caso default, el
	 * cual siempre deberá ir al final.
	 * 
		 * switch(dato a evaluar no boolean){
		 * case primero: 
		 * código a ejecutar
		 * break;
		 * case segundo:
		 * código a ejecutar
		 * break;
		 * case tercero:
		 * código a ejecutar
		 * break;
		 * default:
		 * código a ejecutar en caso de que no se haya cumplido ningún case.
		 * }
	 * Cada break se pone para evitar que si hemos entrado en un caso, luego ejecute el resto
	 * de casos que vienen debajo.
	 */
	
	
	/*
	 * ---BUCLES---
	 * Los bucles se usan para ejecutar repeditamente cierto trozo de código que es posible que 
	 * tengamos que ejecutar más de una vez.Por regla general, todo bucle va a necesitar un 
	 * contador, una condición y un modificador. Hay tres tipos de bucles:
	 * 
		 * 	while(condición que se debe cumplir para entrar en el bucle){
		 * 	código a ejecutar
		 * 	} 
	 * 
	 * NOTA: el código del interior del while se ejecutará MIENTRAS se cumpla la condición. 
	 * Normalmente, el contador es parte de la condición y dentro del while se hará la 
	 * modificación.
	 * 
	 * TRUCO para identificar el while. Como su propio nombre indica, su nombre es MIENTRAS, 
	 * es decir, no sabemos a priori cuánto va a durar el bucle. 
	 * 
	 * 
		 * do{
		 * código a ejecutar
		 * }while(condición que se debe cumplir para seguir en el bucle);
	 * 
	 * El bucle do while tiene el mismo funcionamiento que el while, pero nos aseguramos que 
	 * al menos una vez se ejecuta lo que queremos.
	 * 
	 * 
		 * for(inicialización del contador; condición; modificador){
		 * código a ejecutar}
	 * 
	 * Todas las propiedades del for se deben establecer dentro de los paréntesis.
	 * 
	 * TRUCO para identificar el for. For significa DURANTE, por lo cual lo usaremos cuando
	 * sepamos cuánto va a durar el bucle.
	 * 
	 */
	
	
	/*
	 * ---INTRODUCIR DATOS POR TECLADO---
	 * Para introducir datos por teclado, debemos crear un objeto de tipo Scanner y usar sus métodos
	 * de instancia. Para crear un objeto de tipo de Scanner:
	 * 
		 * Scanner nombreDeLaVariableObjeto = new Scanner(System.in);
		 
	 * Para introducir un número entero usaremos el método nextInt(), el cual devolverá el número 
	 * introducido. 
	 * 
	 * Para introducir un número decimal usaremos el método nextDouble(), el cual devolverá el número 
	 * introducido. 
	 * 
	 * Para introducir un texto usaremos el método nextLine(), el cual devolverá el texto introducido.
	 * 
	 * NOTA: lo que nos devuelva los métodos deberemos guardarla en la variable adecuada.
	 * RECORDATORIO: son métodos de instancia, por lo cual debemos acceder a ellos a través del objeto
	 * Scanner creado mediante el punto. Ejemplo:
	 * 
	 	* int nombreVariable = nombreDeLaVariableObjeto.nextInt();
	 */
	
	
	/*
	 * ---MANEJO DE EXCEPCIONES---
	 * A veces, durante la ejecución de un programa, pueden ocurrir erorres que a priori no hemos previsto
	 * durante la escritura del código debido normalmente a datos erróneos introducidos por el usuario.
	 * Estos errores se llaman excepciones y hay muchos tipos. Para controlar estas excepciones se utiliza
	 * la estructura try catch.
	 * 
		 * try{
		 * código a intentar ejecutar 
		 * }catch(TipoDeExcepción nombreDeLaVaribleExcepción){
		 * código a ejecutar en caso de que ocurra la excepción indicada durante la ejecución del try
		 * }
	 * 
	 * Casos para los que nos puede valer el try:
	 * Si al usar el método nextInt() de Scanner intentamos meter algo que no sea un número entero.
	 * Intentar dividir entre 0.
	 * Al usar objetos creados por terceros que tengan previstas estas excepciones.
	 */
	
	
	/*
	 * ---CLASES Y OBJETOS---
	 * Java es un lenguaje de Programación Orientado a Objetos. El lenguaje está formado por elementos
	 * que se llaman clases. Una clase sirve para muchas cosas, pero si hablamos de POO, nos referimos
	 * a ellas como moldes que sirven para crear variables (objetos/instancias) con características
	 * similares.
	 * 
		 * public class NombreDeLaClase{
		 * atributos de la clase
		 * 
		 * métodos de la clase
		 * }
	 * 
	 * Si por ejemplo, suponemos que existe la clase Gato, podremos crear instancias de esa clase. Por lo 
	 * que si queremos crear dos instancias de la clase Gato hariamos lo siguiente:
	 * 
		 * Gato rosalie = new Gato();
		 * Gato whisky = new Gato();
	 * 
	 * Estas dos variables compartirán características al ser ambas instancias de la clase Gato.
	 * 
	 * NOTA: 
	 * Al crear un objeto estamos implicitamente llamado a un método característico de la clase
	 * llamado método constructor. Este método como todo método puede recibir o no parámetros y su 
	 * función es crear el objeto y darle un valor inicial a sus atributos. 
	 * 
	 * Una clase puede tener varios constructores (sobrecarga de constructores) que reciban 
	 * diferentes parámetros e inicialicen el objeto de un forma u otra. 
	 * 
	 * Además del método constructor, hay otro método característico de cada clase denominado toString,
	 * el cual devuelve la representación textual del objeto (devuelve un dato de tipo String).
	 * 
	 * 
	 * Además de estos dos métodos característicos, podemos crear tantos métodos como se nos ocurra que
	 * hagan lo que nosotros queremos que hagan. Estos métodos pueden ser estáticos o no estáticos.
	 * 
	 * 1. Metódos estáticos -> son los métodos de las clases (moldes) y deben llevar la palabra static, y
	 * solo pueden acceder a atributos estáticos.A los elementos static, algunas veces se les suele llamar
	 * globales.Para acceder a ellos debemos usar el punto con el nombre de la clase.
	 * 
	 	* Gato.nombreDelMétodoEstático();
	 * 
	 * 2. Métodos no estáticos -> son los métodos de las instancias (objetos/copias).No deben llevar la palabra
	 * static y pueden acceder a los atributos no estáticos. Para acceder a ellos se debe usar el punto con el
	 * nombre de la variable objeto.
	 * 
	 	* rosalie.nombreDelMétodoDeInstancia();
	 * 
	 * IMPORTANTE:
	 * Los atributos de la clase deben ir encapsulados, es decir, deben llevar la palabra private delante. Para
	 * obtener o cambiar su valor, debemos usar los métodos de instancia getters y setters respectivamente.
	 * 
		 * rosalie.getNombreDelAtributo();
		 * rosalie.setNombreDelAtributo(TipoDeDato nombreDelDato);
	 */
	 
	
	/*
	 * ---FECHAS Y HORAS---
	 * Para usar fechas y horas se usan las clases LocalDate y LocalTime respectivamente. Al ser clases podemos crear
	 * instancias de ellas y usar sus métodos. Normalmente, si queremos crear una fecha usamos su método estático of
	 * al que le pasaremos por parámetro el año, el mes y el día en ese orden.
	 * 
	 	* LocalDate fechaNacimiento = LocalDate.of(1997,4,30);
	 * 
	 * Si por ejemplo, queremos obtener la fecha de hoy usaremos el método estático now.
	 * 
	 	* LocalDate fechaHoy = LocalDate.now();
	 * 
	 * Estos métodos también se pueden usar para las horas. Solo que el método of recibiría parámetros como la hora, 
	 * los minutos, los segundos, etc.
	 * 
		 * LocalTime horaAlmuerzo = LocalTime.of(13,0);
		 * LocalTime otraHora = LocalTime.of(13,0,5);
		 * LocalTime horaActual = LocalTime.now();
	 * 
	 * Estas clases también comparten métodos como isBefore(), isAfter(), until() etc.
	 */
	
}

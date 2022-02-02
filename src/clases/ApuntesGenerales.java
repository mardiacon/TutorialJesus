package clases;

public class ApuntesGenerales {

	/* 
	 * ---IMPORTANTE TENER PRESENTE---
	 * 1. El c�digo va de arriba a abajo
	 * 2. Todo lo que se muestra en pantalla va en un print
	 * 3. El c�digo va saliendo poco a poco, no del tir�n
	 * 4. Cada ciertas l�neas de c�digo imprimes por pantalla para ver si vas bien
	 */
	
	
	/*
	 * ---VARIABLES---
	 * Las variables son espacios de la memoria donde se van a guardar datos durante
	 * la ejecuci�n del programa. Como su propio nombre indica, su valor puede variar 
	 * durante la ejecuci�n.Cuando el programa acaba, se libera es espacio de memoria.
	 * 
	 * Una variable debe primero declararse. Con eso le estamos diciendo al programa
	 * que en ella vamos a meter un dato del tipo que sea. Para declarar una variable
	 * hay que poner el tipo seguido del nombre que le queremos dar a la variable.
	 * NOTA: no puede haber dos variables con el mismo nombre en el mismo �mbito.
	 * 
	 * Una vez hemos declarado una variable, ya le podemos asignar un valor en el 
	 * momento que queremos. Para asignar un valor, debemos poner el nombre de la
	 * variable = valor. Esto lo haremos para darle el valor inicial (inicializar), 
	 * o cualquier otro valor durante la ejecuci�n del programa.
	 * NOTA: una variable se puede declarar e inicializar en una misma l�nea.
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
	 * Existe dos tipos de operaciones: aritm�ticas y l�gicas:
	 * Aritm�ticas +, -, *, /, %
	 * L�gicas >, <, >=, <=, ==, !=. Devuelven resultados booleanos (true o false).
	 * L�gicas entre booleans && (y) , || (o).
	 */
	
	
	/*
	 * ---IF ELSE---
	 * Todo programa se ejecuta de arriba a abajo, ejecutando cada l�nea que se encuentra,
	 * pero a veces, querremos que alguna l�nea se ejecute o no, dependiendo de alguna 
	 * condici�n. Para eso se usa la estructura if else y if else-if else.
	 * 
		 * if(condici�n que queremos que se cumpla){
		 * C�digo que queremos que se ejecute si se cumple la condici�n.
		 * }else{
		 * C�digo que queremos qe se ejecute si no se cumple la condici�n.
		 * }
	 * 
	 * El else no necesita condici�n, ya que va a entrar si no se cumple la del if. 
	 * NOTA: la condici�n del if debe ser siempre un dato boolean, ya que
	 * queremos decir si s� (true) o si no (false).
	 */
	
	
	/*
	 * ---SWITCH---
	 * El switch es otro tipo de condicional. Se usa para evaluar datos concretos no booleans.
	 * Ponemos dentro de los par�ntesis del switch el dato que queremos evaluar, y dentro de 
	 * sus llaves veremos en cada caso (case) qu� queremos ejecutar siempre acabando cada caso
	 * con un break. En caso de que no se cumpla ning�n caso, se ejecutar� el caso default, el
	 * cual siempre deber� ir al final.
	 * 
		 * switch(dato a evaluar no boolean){
		 * case primero: 
		 * c�digo a ejecutar
		 * break;
		 * case segundo:
		 * c�digo a ejecutar
		 * break;
		 * case tercero:
		 * c�digo a ejecutar
		 * break;
		 * default:
		 * c�digo a ejecutar en caso de que no se haya cumplido ning�n case.
		 * }
	 * Cada break se pone para evitar que si hemos entrado en un caso, luego ejecute el resto
	 * de casos que vienen debajo.
	 */
	
	
	/*
	 * ---BUCLES---
	 * Los bucles se usan para ejecutar repeditamente cierto trozo de c�digo que es posible que 
	 * tengamos que ejecutar m�s de una vez.Por regla general, todo bucle va a necesitar un 
	 * contador, una condici�n y un modificador. Hay tres tipos de bucles:
	 * 
		 * 	while(condici�n que se debe cumplir para entrar en el bucle){
		 * 	c�digo a ejecutar
		 * 	} 
	 * 
	 * NOTA: el c�digo del interior del while se ejecutar� MIENTRAS se cumpla la condici�n. 
	 * Normalmente, el contador es parte de la condici�n y dentro del while se har� la 
	 * modificaci�n.
	 * 
	 * TRUCO para identificar el while. Como su propio nombre indica, su nombre es MIENTRAS, 
	 * es decir, no sabemos a priori cu�nto va a durar el bucle. 
	 * 
	 * 
		 * do{
		 * c�digo a ejecutar
		 * }while(condici�n que se debe cumplir para seguir en el bucle);
	 * 
	 * El bucle do while tiene el mismo funcionamiento que el while, pero nos aseguramos que 
	 * al menos una vez se ejecuta lo que queremos.
	 * 
	 * 
		 * for(inicializaci�n del contador; condici�n; modificador){
		 * c�digo a ejecutar}
	 * 
	 * Todas las propiedades del for se deben establecer dentro de los par�ntesis.
	 * 
	 * TRUCO para identificar el for. For significa DURANTE, por lo cual lo usaremos cuando
	 * sepamos cu�nto va a durar el bucle.
	 * 
	 */
	
	
	/*
	 * ---INTRODUCIR DATOS POR TECLADO---
	 * Para introducir datos por teclado, debemos crear un objeto de tipo Scanner y usar sus m�todos
	 * de instancia. Para crear un objeto de tipo de Scanner:
	 * 
		 * Scanner nombreDeLaVariableObjeto = new Scanner(System.in);
		 
	 * Para introducir un n�mero entero usaremos el m�todo nextInt(), el cual devolver� el n�mero 
	 * introducido. 
	 * 
	 * Para introducir un n�mero decimal usaremos el m�todo nextDouble(), el cual devolver� el n�mero 
	 * introducido. 
	 * 
	 * Para introducir un texto usaremos el m�todo nextLine(), el cual devolver� el texto introducido.
	 * 
	 * NOTA: lo que nos devuelva los m�todos deberemos guardarla en la variable adecuada.
	 * RECORDATORIO: son m�todos de instancia, por lo cual debemos acceder a ellos a trav�s del objeto
	 * Scanner creado mediante el punto. Ejemplo:
	 * 
	 	* int nombreVariable = nombreDeLaVariableObjeto.nextInt();
	 */
	
	
	/*
	 * ---MANEJO DE EXCEPCIONES---
	 * A veces, durante la ejecuci�n de un programa, pueden ocurrir erorres que a priori no hemos previsto
	 * durante la escritura del c�digo debido normalmente a datos err�neos introducidos por el usuario.
	 * Estos errores se llaman excepciones y hay muchos tipos. Para controlar estas excepciones se utiliza
	 * la estructura try catch.
	 * 
		 * try{
		 * c�digo a intentar ejecutar 
		 * }catch(TipoDeExcepci�n nombreDeLaVaribleExcepci�n){
		 * c�digo a ejecutar en caso de que ocurra la excepci�n indicada durante la ejecuci�n del try
		 * }
	 * 
	 * Casos para los que nos puede valer el try:
	 * Si al usar el m�todo nextInt() de Scanner intentamos meter algo que no sea un n�mero entero.
	 * Intentar dividir entre 0.
	 * Al usar objetos creados por terceros que tengan previstas estas excepciones.
	 */
	
	
	/*
	 * ---CLASES Y OBJETOS---
	 * Java es un lenguaje de Programaci�n Orientado a Objetos. El lenguaje est� formado por elementos
	 * que se llaman clases. Una clase sirve para muchas cosas, pero si hablamos de POO, nos referimos
	 * a ellas como moldes que sirven para crear variables (objetos/instancias) con caracter�sticas
	 * similares.
	 * 
		 * public class NombreDeLaClase{
		 * atributos de la clase
		 * 
		 * m�todos de la clase
		 * }
	 * 
	 * Si por ejemplo, suponemos que existe la clase Gato, podremos crear instancias de esa clase. Por lo 
	 * que si queremos crear dos instancias de la clase Gato hariamos lo siguiente:
	 * 
		 * Gato rosalie = new Gato();
		 * Gato whisky = new Gato();
	 * 
	 * Estas dos variables compartir�n caracter�sticas al ser ambas instancias de la clase Gato.
	 * 
	 * NOTA: 
	 * Al crear un objeto estamos implicitamente llamado a un m�todo caracter�stico de la clase
	 * llamado m�todo constructor. Este m�todo como todo m�todo puede recibir o no par�metros y su 
	 * funci�n es crear el objeto y darle un valor inicial a sus atributos. 
	 * 
	 * Una clase puede tener varios constructores (sobrecarga de constructores) que reciban 
	 * diferentes par�metros e inicialicen el objeto de un forma u otra. 
	 * 
	 * Adem�s del m�todo constructor, hay otro m�todo caracter�stico de cada clase denominado toString,
	 * el cual devuelve la representaci�n textual del objeto (devuelve un dato de tipo String).
	 * 
	 * 
	 * Adem�s de estos dos m�todos caracter�sticos, podemos crear tantos m�todos como se nos ocurra que
	 * hagan lo que nosotros queremos que hagan. Estos m�todos pueden ser est�ticos o no est�ticos.
	 * 
	 * 1. Met�dos est�ticos -> son los m�todos de las clases (moldes) y deben llevar la palabra static, y
	 * solo pueden acceder a atributos est�ticos.A los elementos static, algunas veces se les suele llamar
	 * globales.Para acceder a ellos debemos usar el punto con el nombre de la clase.
	 * 
	 	* Gato.nombreDelM�todoEst�tico();
	 * 
	 * 2. M�todos no est�ticos -> son los m�todos de las instancias (objetos/copias).No deben llevar la palabra
	 * static y pueden acceder a los atributos no est�ticos. Para acceder a ellos se debe usar el punto con el
	 * nombre de la variable objeto.
	 * 
	 	* rosalie.nombreDelM�todoDeInstancia();
	 * 
	 * IMPORTANTE:
	 * Los atributos de la clase deben ir encapsulados, es decir, deben llevar la palabra private delante. Para
	 * obtener o cambiar su valor, debemos usar los m�todos de instancia getters y setters respectivamente.
	 * 
		 * rosalie.getNombreDelAtributo();
		 * rosalie.setNombreDelAtributo(TipoDeDato nombreDelDato);
	 */
	 
	
	/*
	 * ---FECHAS Y HORAS---
	 * Para usar fechas y horas se usan las clases LocalDate y LocalTime respectivamente. Al ser clases podemos crear
	 * instancias de ellas y usar sus m�todos. Normalmente, si queremos crear una fecha usamos su m�todo est�tico of
	 * al que le pasaremos por par�metro el a�o, el mes y el d�a en ese orden.
	 * 
	 	* LocalDate fechaNacimiento = LocalDate.of(1997,4,30);
	 * 
	 * Si por ejemplo, queremos obtener la fecha de hoy usaremos el m�todo est�tico now.
	 * 
	 	* LocalDate fechaHoy = LocalDate.now();
	 * 
	 * Estos m�todos tambi�n se pueden usar para las horas. Solo que el m�todo of recibir�a par�metros como la hora, 
	 * los minutos, los segundos, etc.
	 * 
		 * LocalTime horaAlmuerzo = LocalTime.of(13,0);
		 * LocalTime otraHora = LocalTime.of(13,0,5);
		 * LocalTime horaActual = LocalTime.now();
	 * 
	 * Estas clases tambi�n comparten m�todos como isBefore(), isAfter(), until() etc.
	 */
	
}

package tarea5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa el <strong>chip de una bici</strong>.
 * <p>
 * Los objetos de esta clase contienen atributos que permiten almacenar
 * informaci�n sobre:</p>
 * <ul>
 * <li><strong>N�mero de serie</strong> del chip de la bici. Este valor se establecer�
 * al crear el chip y ya no podr� cambiar. Es un valor constante.</li>
 * <li><strong>Fecha de adquisici�n</strong> de la bici. Es tambi�n un valor
 * constante. Se establecer� al crear la bici y ya no podr� cambiar su valor.</li>
 * <li><strong>Versi�n</strong> del chip.</li>
 * <li><strong>Revisi�n</strong> del chip.</li>
 * <li><strong>Si est� alquilada</strong> en este momento.</li>
 * <li><strong>Los kil�metros totales recorridos</strong> por la bici <strong>desde su adquisici�n.</strong></li>
 * <li><strong>La fecha y hora de inicio</strong> del <strong>alquiler actual.</strong></li>
 * <li><strong>Los kil�metros</strong> recorridos en el </strong>alquiler actua,.</strong></li>
 * <li><strong>La fecha y hora de inicio</strong> del <strong>�ltimo alquiler-</strong>.</li>
 * <li><strong>La fecha y hora de fin</strong> del <strong>�ltimo alquiler.</strong>.</li>
 * <li><strong>Los kil�metros</strong> recorridos durante el <strong>�ltimo alquiler</strong>.</li>
 * </ul>
 * <p>
 * La clase tambi�n dispone de informaci�n general independiente de los objetos
 * concretos que se hayan creado. Es el caso de:</p>
 * <ul>
 * <li><strong>Cantidad de bicis adquiridas.</strong></li>
 * <li><strong>Cantidad de bicis alquiladas.</strong></li>
 * <li><strong>Total de kil�metros recorridos</strong> entre <strong>todas las bicis.</strong></li>
 * </ul>
 */
public class ChipBici {

	//Atributos
	
	
	private final int numSerie;
	private final LocalDate fechaAdquisicion;
	
	private int version;
	private int revision;
	private boolean alquilada;
	private double kmTotalesRecorridos;
	private LocalDateTime fechaInicioAlquilerActual;
	private double kmRecorridosAlquilerActual;
	private LocalDateTime fechaInicioUltimoAlquiler;
	private LocalDateTime fechaFinUltimoAlquiler;
	private double kmRecorridosUltimoAlquiler;
	
	private static int NUMERO_SERIE_ACTUAL = 1;
	private static int CANTIDAD_BICIS_ADQUIRIDAS;
	private static int CANTIDAD_BICIS_ALQUILADAS;
	private static double TOTAL_KM_RECORRIDOS;
	
	/**
	 * M�xima distancia a recorrer en un trayecto :
	 * {@value MAX_DISTANCIA_TRAYECTO} kil�metros.
	 */
	public static final double MAX_DISTANCIA_TRAYECTO = 140.0;
	/**
	 * Versi�n m�nima de un chip :
	 * {@value MIN_VERSION}.
	 */
	public static final int MIN_VERSION = 1;
	/**
	 * Versi�n m�xima de un chip :
	 * {@value MAX_VERSION}.
	 */
	public static final int MAX_VERSION = 10;
	/**
	 * Revisi�n m�nima de un chip :
	 * {@value MIN_REVISION}.
	 */
	public static final int MIN_REVISION = 0;
	/**
	 * Revisi�n m�xima de un chip :
	 * {@value MAX_REVISION}.
	 */
	public static final int MAX_REVISION = 9;
	/**
	 * Versi�n por defecto de un chip :
	 * {@value DEFAULT_VERSION}.
	 */
	public static final int DEFAULT_VERSION = 1;
	/**
	 * Revisi�n por defecto de un chip :
	 * {@value DEFAULT_REVISION}.
	 */
	public static final int DEFAULT_REVISION = 0;
	/**
	 * Fecha de adquisici�n m�nima de una bici :
	 * {@value MIN_FECHA_ADQUISICION}.
	 */
	public static final LocalDate MIN_FECHA_ADQUISICION = LocalDate.of(2020, 6, 15);
	
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	//Constructores
	
	/**
	 * Constructor con tres par�metros
	 *
	 * @param fechaAdquisicion Fecha de adquisici�n de la bici
	 * @param version Versi�n del chip
	 * @param revisi�n Revisi�n del chip
	 * @throws IllegalArgumentException Si alguno de los par�metros no es v�lido
	 */
	public ChipBici(LocalDate fechaAdquisicion, int version, int revision) throws IllegalArgumentException{
		if(fechaAdquisicion == null) {
			throw new IllegalArgumentException("Fecha incorrecta: " + fechaAdquisicion);
		}
		if(fechaAdquisicion.isBefore(MIN_FECHA_ADQUISICION) || 
				fechaAdquisicion.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Fecha incorrecta: " + fechaAdquisicion.format(FORMATO_FECHA));
		}
		if(version < MIN_VERSION || version > MAX_VERSION) {
			throw new IllegalArgumentException("Versi�n incorrecta: " + version);
		}
		if(revision < MIN_REVISION || revision > MAX_REVISION) {
			throw new IllegalArgumentException("Revisi�n incorrecta: " + revision);
		}
		this.numSerie = NUMERO_SERIE_ACTUAL;
		NUMERO_SERIE_ACTUAL++;
		this.fechaAdquisicion = fechaAdquisicion;
		this.version = version;
		this.revision = revision;
		this.alquilada = false;
		this.kmRecorridosAlquilerActual = 0;
		this.kmRecorridosAlquilerActual = 0;
		CANTIDAD_BICIS_ADQUIRIDAS++;
	}
	
	/**
	 * Constructor con dos par�metros
	 *
	 * @param version Versi�n del chip
	 * @param revisi�n Revisi�n del chip
	 * @throws IllegalArgumentException Si alguno de los par�metros no es v�lido
	 */
	public ChipBici(int version, int revision) throws IllegalArgumentException{
		this(LocalDate.now(), version, revision);
	}
	
	/**
	 * Constructor sin par�metros
	 *
	 * @throws IllegalArgumentException Si alguno de los par�metros no es v�lido
	 */
	public ChipBici() {
		this(LocalDate.now(), DEFAULT_VERSION, DEFAULT_REVISION);
	}
	
	//F�brica
	
	/**
	 * M�todo que funciona a modo de f�brica. Devuelve un array de bicis con valores por defecto.
	 *
	 * @param cantidad Cantidad de bicis a crear. Debe ser m�nimo 1.
	 * @throws IllegalArgumentException Si la cantidad de bicis es negativa.
	 * @return Array de bicis
	 */
	public static ChipBici[] crearArrayChipBici(int cantidad) throws IllegalArgumentException{
		if(cantidad < 1) {
			throw new IllegalArgumentException("Cantidad no v�lida: " + cantidad);
		}
		ChipBici[] array = new ChipBici[cantidad];
		for(int i = 0; i < array.length; i++) {
			ChipBici chip = new ChipBici();
			array[i] = chip;
		}
		return array;
	}
	
	//M�todos de consulta
	
	/**
	 * Devuelve el n�mero de serie.
	 *
	 * @return N�mero de serie
	 */
	public String getNumSerie() {
		return String.valueOf(numSerie);
	}
	/**
	 * Devuelve la fecha de adquisici�n.
	 *
	 * @return Fecha de adquisici�n
	 */
	public LocalDate getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	
	/**
	 * Devuelve la versi�n.
	 *
	 * @return Versi�n
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * Devuelve la revisi�n.
	 *
	 * @return Revisi�n
	 */
	public int getRevision() {
		return revision;
	}
	/**
	 * Devuelve la versi�n completa, formada por la versi�n y revisi�n separadas por un punto.
	 *
	 * @return Versi�n completa
	 */
	public String getVersionRevision() {
		return String.format("%d.%d", version, revision);
	}
	/**
	 * Indica si la bici est� alquilada en estos momentos.
	 *
	 * @return Si est� alquilada
	 */
	public boolean isAlquilada() {
		return alquilada;
	}
	/**
	 * Devuelve los kil�metros totales recorridos por la bici.
	 *
	 * @return Kil�metros totales recorridos.
	 */
	public double getKilometrosTotales() {
		return kmTotalesRecorridos;
	}
	/**
	 * Devuelve la fecha y hora de inicio del alquiler actual.
	 *
	 * @return Fecha y hora de inicio del alquiler actual
	 */
	public LocalDateTime getRegistroInicioAlquilerActual() {
		return fechaInicioAlquilerActual;
	}
	/**
	 * Devuelve los kil�metros recorridos del alquiler actual
	 *
	 * @return Kil�metros recorridos del alquiler actual
	 */
	public double getKilometrosRecorridosAlquilerActual() {
		return kmRecorridosAlquilerActual;
	}
	/**
	 * Devuelve la fecha y hora de inicio del �ltimo alquiler-
	 *
	 * @return Fecha y hora de inicio del �ltimo alquiler.
	 */
	public LocalDateTime getRegistroInicioUltimoAlquiler() {
		return fechaInicioUltimoAlquiler;
	}
	/**
	 * Devuelve la fecha y hora de fin del �ltimo alquiler.
	 *
	 * @return Fecha y hora del �ltimo alquiler.
	 */
	public LocalDateTime getRegistroFinUltimoAlquiler() {
		return fechaFinUltimoAlquiler;
	}
	/**
	 * Devuelve los kil�metros recorridos durante el �ltimo alquiler.
	 *
	 * @return Kil�metros recorridos durante el �ltimo alquiler.
	 */
	public double getKilometrosRecorridosUltimoAlquiler() {
		return kmRecorridosUltimoAlquiler;
	}
	/**
	 * Devuelve el n�mero de bicis adquiridas.
	 *
	 * @return N�mero de bicis adquiridas
	 */
	public static int getNumBicis() {
		return CANTIDAD_BICIS_ADQUIRIDAS;
	}
	/**
	 * Devuelve el n�mero de bicis alquiladas.
	 *
	 * @return N�mero de bicis alquiladas.
	 */
	public static int getNumBicisAlquiladas() {
		return CANTIDAD_BICIS_ALQUILADAS;
	}
	/**
	 * Devuelve los kil�metros totales recorridos entre todas las bicis.
	 *
	 * @return Kil�metros totales recorridos entre todas las bicis.
	 */
	public static double getKilometrosTodasLasBicis() {
		return TOTAL_KM_RECORRIDOS;
	}
	
	//Alquiler y devolucion
	
	/**
	 * Alquila la bici.
	 * Cambia su estado de alquiler a "true", establece la fecha de inicio del alquiler, pone a 0 el contador de
	 * kil�metros recorridos y aunmenta el n�mero global de bicis alquiladas.
	 *
	 * @throws IllegalStateException Si la bici ya est� alquilada.
	 */
	public void alquilar() throws IllegalStateException {
		if(alquilada) {
			throw new IllegalStateException("Bici ya alquilada");
		}
		alquilada = true;
		fechaInicioAlquilerActual = LocalDateTime.now();
		kmRecorridosAlquilerActual = 0;
		CANTIDAD_BICIS_ALQUILADAS++;
	}
	
	/**
	 * Devuelve la bici.
	 * Cambia su estado de alquiler a "false", establece los datos del �ltimo alquiler con los actuales y luego
	 * resetear los actuales. Decrementa el n�mero de bicis alquiladas.
	 *
	 * @throws IllegalArgumentException Si la bici no est� alquilada.
	 */
	public void devolver() throws IllegalStateException {
		if(!alquilada) {
			throw new IllegalStateException("Bici no alquilada");
		}
		alquilada = false;
		fechaInicioUltimoAlquiler = fechaInicioAlquilerActual;
		fechaFinUltimoAlquiler = LocalDateTime.now();
		kmRecorridosUltimoAlquiler = kmRecorridosAlquilerActual;
		kmRecorridosAlquilerActual = 0;
		fechaInicioAlquilerActual = null;
		CANTIDAD_BICIS_ALQUILADAS--;
	}
	
	//Recorrido de trayecto
	
	/**
	 * Recorre un trayecto medido en kil�metros.
	 * Suma la cantidad indicada a los kil�metros del alquiler actual y al total de la bici y todas las bicis.
	 *
	 * @param km Kil�metros a recorrer.
	 * @throws IllegalStateException Si la bici no est� alquilada.
	 * @throws IllegalArgumentException Si los kil�metros indicados son negativos o superiores a lo permitido.
	 * @return Los kil�metros recorridos.
	 */
	public double recorrerTrayecto(double km) throws IllegalStateException, IllegalArgumentException{
		if(!alquilada) {
			throw new IllegalStateException("Bici no alquilada");
		}
		if(km < 0 || km > MAX_DISTANCIA_TRAYECTO) {
			String mensajeDeError = String.format("Distancia incorrecta: %.2f km", km);
			throw new IllegalArgumentException(mensajeDeError);
		}
		kmRecorridosAlquilerActual+=km;
		TOTAL_KM_RECORRIDOS+=km;
		kmTotalesRecorridos+=km;
		return kmRecorridosAlquilerActual;
	}
	
	/**
	 * Recorre un trayecto medido en kil�metros.
	 * Llama al m�todo del mismo nombre con un par�metro, pas�ndole la m�xima distancia posible a recorrer.
	 * 
	 * @throws IllegalArgumentException Si los kil�metros indicados son negativos o superiores a lo permitido.
	 * @return Los kil�metros recorridos.
	 */
	public double recorrerTrayecto() {
		return recorrerTrayecto(MAX_DISTANCIA_TRAYECTO);
	}
	
	//Actualizaci�n y reseteo del firmware
	
	/**
	 * Actualiza el firmware del chip (versi�n y revisi�n).
	 * Actualiza la versi�n y revisi�n del chip con la versi�n y revisi�n indicadas.
	 *
	 * @param version Nueva versi�n.
	 * @param revision Nueva revisi�n
	 * @throws IllegalStateException Si la bici est� alquilada.
	 * @throws IllegalArgumentException Si la versi�n o revisi�n indicada son inv�lidas, ya sea porque son menores
	 * o superiores a los rangos establecidos o porque su conjunto no es superior a la versi�n completa actual.
	 */
	public void actualizarFirmware(int version, int revision) 
			throws IllegalStateException, IllegalArgumentException {
		if(alquilada) {
			throw new IllegalStateException("No se puede actualizar el firmware a una bici alquilada");
		}
		if(version < MIN_VERSION || version > MAX_VERSION) {
			throw new IllegalArgumentException("Versi�n incorrecta: " + version);
		}
		if(revision < MIN_REVISION || revision > MAX_REVISION) {
			throw new IllegalArgumentException("Revisi�n incorrecta: " + revision);
		}
		Double posibleVersionRevision = Double.valueOf(String.format("%d.%d", version, revision));
		Double actualVersionRevision = Double.valueOf(getVersionRevision());
		if(posibleVersionRevision <= actualVersionRevision) {
			String mensajeError = String.format("Es necesario actualizar a una versi�n superior a la actual: "
					+ "%.1f <= %.1f", posibleVersionRevision, actualVersionRevision);
			throw new IllegalArgumentException(mensajeError);
		}
		this.version = version;
		this.revision = revision;
	}
	
	/**
	 * Actualiza el firmware del chip (versi�n y revisi�n).
	 * Llama al m�todo del mismo nombre con dos par�metros pas�ndola la versi�n indicada y la revisi�n por defecto.
	 *
	 * @param version Versi�n nueva.
	 */
	public void actualizarFirmware(int version) {
		actualizarFirmware(version, DEFAULT_REVISION);
	}
	
	/**
	 * 
	 * Resetea el chip a valores por defecto.
	 * Los valores a resetear son: versi�n, revisi�n, si est� alquilada, kil�metros totales recorridos,
	 * fecha y hora de inicio del alquiler actual, kil�metros recorridos en el alquiler actual,
	 * fecha y hora de inicio del �ltimo alquiler, fecha y hora de fin del �ltimo alquiler y
	 * kil�metros recorridos durante del �ltimo alquiler.
	 *
	 * @throws IllegalStateException Si la bici est� alquilada.
	 */
	public void reset() throws IllegalStateException{
		if(alquilada) {
			throw new IllegalStateException("No se puede actualizar el firmware a una bici alquilada");
		}
		version = DEFAULT_VERSION;
		revision = DEFAULT_REVISION;
		alquilada = false;
		kmTotalesRecorridos = 0;
		fechaInicioAlquilerActual = null;
		kmRecorridosAlquilerActual = 0;
		fechaInicioUltimoAlquiler = null;
		fechaFinUltimoAlquiler = null;
		kmRecorridosUltimoAlquiler = 0;
	}
	
	//toString
	public String toString() {
		return String.format("{ NS: %d; %s; fw: %s; %s; %.2f km totales; Alquiler actual: %s, %.2f km; "
				+ "�ltimo alquiler: %s, %s, %.2f km }", 
				numSerie, 
				fechaAdquisicion.format(FORMATO_FECHA), 
				getVersionRevision(), 
				alquilada ? "alquilada" : "no alquilada",
				kmTotalesRecorridos,
				alquilada && fechaInicioAlquilerActual != null ? fechaInicioAlquilerActual.format(FORMATO_FECHA_HORA) : "---",
				kmRecorridosAlquilerActual,
				alquilada && fechaInicioUltimoAlquiler != null ? fechaInicioUltimoAlquiler.format(FORMATO_FECHA_HORA) : "---",
				alquilada && fechaFinUltimoAlquiler != null ? fechaFinUltimoAlquiler.format(FORMATO_FECHA_HORA) : "---",
				kmRecorridosUltimoAlquiler);
	}
	
	
}

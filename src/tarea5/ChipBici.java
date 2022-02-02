package tarea5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa el <strong>chip de una bici</strong>.
 * <p>
 * Los objetos de esta clase contienen atributos que permiten almacenar
 * información sobre:</p>
 * <ul>
 * <li><strong>Número de serie</strong> del chip de la bici. Este valor se establecerá
 * al crear el chip y ya no podrá cambiar. Es un valor constante.</li>
 * <li><strong>Fecha de adquisición</strong> de la bici. Es también un valor
 * constante. Se establecerá al crear la bici y ya no podrá cambiar su valor.</li>
 * <li><strong>Versión</strong> del chip.</li>
 * <li><strong>Revisión</strong> del chip.</li>
 * <li><strong>Si está alquilada</strong> en este momento.</li>
 * <li><strong>Los kilómetros totales recorridos</strong> por la bici <strong>desde su adquisición.</strong></li>
 * <li><strong>La fecha y hora de inicio</strong> del <strong>alquiler actual.</strong></li>
 * <li><strong>Los kilómetros</strong> recorridos en el </strong>alquiler actua,.</strong></li>
 * <li><strong>La fecha y hora de inicio</strong> del <strong>último alquiler-</strong>.</li>
 * <li><strong>La fecha y hora de fin</strong> del <strong>último alquiler.</strong>.</li>
 * <li><strong>Los kilómetros</strong> recorridos durante el <strong>último alquiler</strong>.</li>
 * </ul>
 * <p>
 * La clase también dispone de información general independiente de los objetos
 * concretos que se hayan creado. Es el caso de:</p>
 * <ul>
 * <li><strong>Cantidad de bicis adquiridas.</strong></li>
 * <li><strong>Cantidad de bicis alquiladas.</strong></li>
 * <li><strong>Total de kilómetros recorridos</strong> entre <strong>todas las bicis.</strong></li>
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
	 * Máxima distancia a recorrer en un trayecto :
	 * {@value MAX_DISTANCIA_TRAYECTO} kilómetros.
	 */
	public static final double MAX_DISTANCIA_TRAYECTO = 140.0;
	/**
	 * Versión mínima de un chip :
	 * {@value MIN_VERSION}.
	 */
	public static final int MIN_VERSION = 1;
	/**
	 * Versión máxima de un chip :
	 * {@value MAX_VERSION}.
	 */
	public static final int MAX_VERSION = 10;
	/**
	 * Revisión mínima de un chip :
	 * {@value MIN_REVISION}.
	 */
	public static final int MIN_REVISION = 0;
	/**
	 * Revisión máxima de un chip :
	 * {@value MAX_REVISION}.
	 */
	public static final int MAX_REVISION = 9;
	/**
	 * Versión por defecto de un chip :
	 * {@value DEFAULT_VERSION}.
	 */
	public static final int DEFAULT_VERSION = 1;
	/**
	 * Revisión por defecto de un chip :
	 * {@value DEFAULT_REVISION}.
	 */
	public static final int DEFAULT_REVISION = 0;
	/**
	 * Fecha de adquisición mínima de una bici :
	 * {@value MIN_FECHA_ADQUISICION}.
	 */
	public static final LocalDate MIN_FECHA_ADQUISICION = LocalDate.of(2020, 6, 15);
	
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	//Constructores
	
	/**
	 * Constructor con tres parámetros
	 *
	 * @param fechaAdquisicion Fecha de adquisición de la bici
	 * @param version Versión del chip
	 * @param revisión Revisión del chip
	 * @throws IllegalArgumentException Si alguno de los parámetros no es válido
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
			throw new IllegalArgumentException("Versión incorrecta: " + version);
		}
		if(revision < MIN_REVISION || revision > MAX_REVISION) {
			throw new IllegalArgumentException("Revisión incorrecta: " + revision);
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
	 * Constructor con dos parámetros
	 *
	 * @param version Versión del chip
	 * @param revisión Revisión del chip
	 * @throws IllegalArgumentException Si alguno de los parámetros no es válido
	 */
	public ChipBici(int version, int revision) throws IllegalArgumentException{
		this(LocalDate.now(), version, revision);
	}
	
	/**
	 * Constructor sin parámetros
	 *
	 * @throws IllegalArgumentException Si alguno de los parámetros no es válido
	 */
	public ChipBici() {
		this(LocalDate.now(), DEFAULT_VERSION, DEFAULT_REVISION);
	}
	
	//Fábrica
	
	/**
	 * Método que funciona a modo de fábrica. Devuelve un array de bicis con valores por defecto.
	 *
	 * @param cantidad Cantidad de bicis a crear. Debe ser mínimo 1.
	 * @throws IllegalArgumentException Si la cantidad de bicis es negativa.
	 * @return Array de bicis
	 */
	public static ChipBici[] crearArrayChipBici(int cantidad) throws IllegalArgumentException{
		if(cantidad < 1) {
			throw new IllegalArgumentException("Cantidad no válida: " + cantidad);
		}
		ChipBici[] array = new ChipBici[cantidad];
		for(int i = 0; i < array.length; i++) {
			ChipBici chip = new ChipBici();
			array[i] = chip;
		}
		return array;
	}
	
	//Métodos de consulta
	
	/**
	 * Devuelve el número de serie.
	 *
	 * @return Número de serie
	 */
	public String getNumSerie() {
		return String.valueOf(numSerie);
	}
	/**
	 * Devuelve la fecha de adquisición.
	 *
	 * @return Fecha de adquisición
	 */
	public LocalDate getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	
	/**
	 * Devuelve la versión.
	 *
	 * @return Versión
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * Devuelve la revisión.
	 *
	 * @return Revisión
	 */
	public int getRevision() {
		return revision;
	}
	/**
	 * Devuelve la versión completa, formada por la versión y revisión separadas por un punto.
	 *
	 * @return Versión completa
	 */
	public String getVersionRevision() {
		return String.format("%d.%d", version, revision);
	}
	/**
	 * Indica si la bici está alquilada en estos momentos.
	 *
	 * @return Si está alquilada
	 */
	public boolean isAlquilada() {
		return alquilada;
	}
	/**
	 * Devuelve los kilómetros totales recorridos por la bici.
	 *
	 * @return Kilómetros totales recorridos.
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
	 * Devuelve los kilómetros recorridos del alquiler actual
	 *
	 * @return Kilómetros recorridos del alquiler actual
	 */
	public double getKilometrosRecorridosAlquilerActual() {
		return kmRecorridosAlquilerActual;
	}
	/**
	 * Devuelve la fecha y hora de inicio del último alquiler-
	 *
	 * @return Fecha y hora de inicio del último alquiler.
	 */
	public LocalDateTime getRegistroInicioUltimoAlquiler() {
		return fechaInicioUltimoAlquiler;
	}
	/**
	 * Devuelve la fecha y hora de fin del último alquiler.
	 *
	 * @return Fecha y hora del último alquiler.
	 */
	public LocalDateTime getRegistroFinUltimoAlquiler() {
		return fechaFinUltimoAlquiler;
	}
	/**
	 * Devuelve los kilómetros recorridos durante el último alquiler.
	 *
	 * @return Kilómetros recorridos durante el último alquiler.
	 */
	public double getKilometrosRecorridosUltimoAlquiler() {
		return kmRecorridosUltimoAlquiler;
	}
	/**
	 * Devuelve el número de bicis adquiridas.
	 *
	 * @return Número de bicis adquiridas
	 */
	public static int getNumBicis() {
		return CANTIDAD_BICIS_ADQUIRIDAS;
	}
	/**
	 * Devuelve el número de bicis alquiladas.
	 *
	 * @return Número de bicis alquiladas.
	 */
	public static int getNumBicisAlquiladas() {
		return CANTIDAD_BICIS_ALQUILADAS;
	}
	/**
	 * Devuelve los kilómetros totales recorridos entre todas las bicis.
	 *
	 * @return Kilómetros totales recorridos entre todas las bicis.
	 */
	public static double getKilometrosTodasLasBicis() {
		return TOTAL_KM_RECORRIDOS;
	}
	
	//Alquiler y devolucion
	
	/**
	 * Alquila la bici.
	 * Cambia su estado de alquiler a "true", establece la fecha de inicio del alquiler, pone a 0 el contador de
	 * kilómetros recorridos y aunmenta el número global de bicis alquiladas.
	 *
	 * @throws IllegalStateException Si la bici ya está alquilada.
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
	 * Cambia su estado de alquiler a "false", establece los datos del último alquiler con los actuales y luego
	 * resetear los actuales. Decrementa el número de bicis alquiladas.
	 *
	 * @throws IllegalArgumentException Si la bici no está alquilada.
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
	 * Recorre un trayecto medido en kilómetros.
	 * Suma la cantidad indicada a los kilómetros del alquiler actual y al total de la bici y todas las bicis.
	 *
	 * @param km Kilómetros a recorrer.
	 * @throws IllegalStateException Si la bici no está alquilada.
	 * @throws IllegalArgumentException Si los kilómetros indicados son negativos o superiores a lo permitido.
	 * @return Los kilómetros recorridos.
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
	 * Recorre un trayecto medido en kilómetros.
	 * Llama al método del mismo nombre con un parámetro, pasándole la máxima distancia posible a recorrer.
	 * 
	 * @throws IllegalArgumentException Si los kilómetros indicados son negativos o superiores a lo permitido.
	 * @return Los kilómetros recorridos.
	 */
	public double recorrerTrayecto() {
		return recorrerTrayecto(MAX_DISTANCIA_TRAYECTO);
	}
	
	//Actualización y reseteo del firmware
	
	/**
	 * Actualiza el firmware del chip (versión y revisión).
	 * Actualiza la versión y revisión del chip con la versión y revisión indicadas.
	 *
	 * @param version Nueva versión.
	 * @param revision Nueva revisión
	 * @throws IllegalStateException Si la bici está alquilada.
	 * @throws IllegalArgumentException Si la versión o revisión indicada son inválidas, ya sea porque son menores
	 * o superiores a los rangos establecidos o porque su conjunto no es superior a la versión completa actual.
	 */
	public void actualizarFirmware(int version, int revision) 
			throws IllegalStateException, IllegalArgumentException {
		if(alquilada) {
			throw new IllegalStateException("No se puede actualizar el firmware a una bici alquilada");
		}
		if(version < MIN_VERSION || version > MAX_VERSION) {
			throw new IllegalArgumentException("Versión incorrecta: " + version);
		}
		if(revision < MIN_REVISION || revision > MAX_REVISION) {
			throw new IllegalArgumentException("Revisión incorrecta: " + revision);
		}
		Double posibleVersionRevision = Double.valueOf(String.format("%d.%d", version, revision));
		Double actualVersionRevision = Double.valueOf(getVersionRevision());
		if(posibleVersionRevision <= actualVersionRevision) {
			String mensajeError = String.format("Es necesario actualizar a una versión superior a la actual: "
					+ "%.1f <= %.1f", posibleVersionRevision, actualVersionRevision);
			throw new IllegalArgumentException(mensajeError);
		}
		this.version = version;
		this.revision = revision;
	}
	
	/**
	 * Actualiza el firmware del chip (versión y revisión).
	 * Llama al método del mismo nombre con dos parámetros pasándola la versión indicada y la revisión por defecto.
	 *
	 * @param version Versión nueva.
	 */
	public void actualizarFirmware(int version) {
		actualizarFirmware(version, DEFAULT_REVISION);
	}
	
	/**
	 * 
	 * Resetea el chip a valores por defecto.
	 * Los valores a resetear son: versión, revisión, si está alquilada, kilómetros totales recorridos,
	 * fecha y hora de inicio del alquiler actual, kilómetros recorridos en el alquiler actual,
	 * fecha y hora de inicio del último alquiler, fecha y hora de fin del último alquiler y
	 * kilómetros recorridos durante del último alquiler.
	 *
	 * @throws IllegalStateException Si la bici está alquilada.
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
				+ "Último alquiler: %s, %s, %.2f km }", 
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

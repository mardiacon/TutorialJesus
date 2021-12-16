package tarea3;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Aqu� declaramos tres objetos de la clase CuentaBancaria.
		CuentaBancaria cuentaPrivada;
		CuentaBancaria cuentaConjunta;
		CuentaBancaria cuentaFamiliar;
		
		System.out.println("USANDO CUENTAS BANCARIAS");
		System.out.println("------------------------");
		System.out.println("Fecha actual: " + LocalDate.now());
		System.out.println();
		System.out.println("Creaci�n de cuentas (constructores)");
		System.out.println("-----------------------------------");
		System.out.println("Intentando crear cuenta privada con una fecha no v�lida.");
		try {
			cuentaPrivada = new CuentaBancaria(200.0, LocalDate.of(2027, 9, 1));
		}catch(IllegalArgumentException excepcion) {
			System.out.println("Error: " + excepcion.getMessage());
		}
		System.out.println();
		System.out.println("Intentando crear cuenta privada con un saldo no v�lido.");
		try {
			cuentaPrivada = new CuentaBancaria(-200.0);
		}catch(IllegalArgumentException excepcion) {
			System.out.println("Error: " + excepcion.getMessage());
		}
		System.out.println();
		System.out.println("Creando cuenta privada v�lida con un constructor con tres par�mentros...");
		cuentaPrivada = new CuentaBancaria(1000.0, LocalDate.of(2021, 7, 1), -200.00);
		System.out.println("Cuenta privada creada: " + cuentaPrivada);
		System.out.println();
		System.out.println("Creando cuenta conjunta v�lida usando un constructor con dos par�metros...");
		cuentaConjunta = new CuentaBancaria(200, LocalDate.of(2021, 7, 1));
		System.out.println("Cuenta conjunta creada: " + cuentaConjunta);
		System.out.println();
		System.out.println("Creando cuenta familiar v�lida usando un constructor sin par�metros...");
		cuentaFamiliar = new CuentaBancaria();
		System.out.println("Cuenta familiar creada: " + cuentaFamiliar);
		System.out.println();
		System.out.println("Cuenta de los getters de la cuenta privada: ");
		System.out.println("-------------------------------------------");
		System.out.println("Id: " + cuentaPrivada.getId());
		System.out.println("Fecha de creaci�n: " + cuentaPrivada.getFechaCreacion());
		System.out.println("L�mite de descubierto: " + cuentaPrivada.getLimiteDescubierto());
		System.out.println("Est� embargada: " + cuentaPrivada.isEmbargada());
		System.out.println("Est� en descubierto: " + cuentaPrivada.isDescubierta());
		System.out.println("N�mero de d�as que lleva la cuenta abierta: " + cuentaPrivada.getDiasCuenta());
		System.out.println();
		System.out.println("Realizaci�n de las operaciones sobre las cuentas: ");
		System.out.println("-------------------------------------------------");
		System.out.println("Ingresamos 100 euros en la cuenta familiar...");
		cuentaFamiliar.ingresar(100.00);
		System.out.println("Extraemos 100 euros de la cuenta conjunta...");
		cuentaConjunta.extraer(100.00);
		System.out.println("Transferimos 1100 euros de la cuenta privada a la familiar...");
		cuentaPrivada.transferir(1100.00, cuentaFamiliar);
		System.out.println();
		System.out.println("Estado final de las cuentas: ");
		System.out.println("----------------------------");
		System.out.println("Estado final de la cuenta privada: " + cuentaPrivada);
		System.out.println("Estado final de la cuenta conjunta: " + cuentaConjunta);
		System.out.println("Estado final de la cuenta familiar: " + cuentaFamiliar);
	}
	
}

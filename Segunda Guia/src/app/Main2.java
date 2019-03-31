package app;
public class Main2 {
	
	/*
	Se pretende desarrollar una aplicaci�n que simule el funcionamiento de un cajero autom�tico.
	Primero se debe crear una clase llamada Cuenta, que administre las operaciones sobre la cuenta.
	Adem�s del constructor y atributos que se estimen necesarios la clase contar�
	con los m�todos:

	void ingresar(float c). Agrega al saldo de la cuenta la cantidad recibida.
	
	void extraer(float c) Descuenta del saldo la cantidad recibida. Tras la llamada
 	a este m�todo el saldo no podr� quedar en negativo.
 	
	float getSaldo(). Devuelve el saldo actual.
	
	Por otro lado, existir� una clase con el m�todo main encargada de la captura y
	presentaci�n de datos y administraci�n de la cuenta. Al iniciarse la aplicaci�n se 
 	mostrar� el siguiente men�.
	
	1. Crear cuenta vac�a
	2. Crear cuenta saldo inicial
	3. Ingresar dinero
	4. Sacar dinero
	5. Ver saldo
	6. Salir
	
	La opci�n 1 crea un objeto Cuenta con saldo 0, 
	la opci�n 2 solicita una cantidad y crea un objeto Cuenta con ese saldo inicial.
	
	En la opci�n 3 se solicita una cantidad y la ingresa en el objeto creado en las opciones
	1 y 2 (debe haber pasado antes por estas opciones), 
	
	mientras que la opci�n 4 se solicita una cantidad y la extrae del objeto creado en las opciones
 	1 o 2 (tambi�n debe haber pasado antes por estas opciones).
 	
	Finalmente, la opci�n 5 muestra el saldo,
	mientras que la 6 finaliza el programa, lo que provocar� que el objeto Cuenta se destruya y se pierda el saldo.
	El men� vuelve a presentarse en pantalla mientras no se elija la opci�n de salir
	*/
	
	public static void main(String[] args) {
		
		Menu.OperarMenu();
	}
}

package app;

public class Main {

	public static void main(String[] args) {
		
		/// PUNTO 1
		//Ejercicio n�1: Calcular el promedio de un arreglo de n�meros enteros. Realizar variantes 
		//con arreglos ya inicializados e ingreso por teclado.		
		//REUTILIZANDO FUNCIONES PARA OTROS EJERCICIOS FUNCIONA BIEN
		//int tam = 10; int [] arreglito = new int[tam]; Ejercicio1.ScanearArrayInt(arreglito, tam);		
		Ejercicio1Arreglos.Punto1(); /// esta funcion llama a todas las anteriores dentro de ella
	
		/// PUNTO 2
		//Ejercicio n�2: Calcular si un n�mero es par o no. 
		Ejercicio2parimpar.VerificacionPar();
		
		/// PUNTO 3
		//Ejercicio n�3: Mostrar los primeros 100 n�meros primos.
		//System.out.print("\nEjercicio 3:\n\n");
		Ejercicio3Primos.Primitos();
	
		/// PUNTO 4
		//Ejercicio n�4: Mostrar los primeros n n�meros primos.
		Ejercicio4Nprimos.Nprimitos();
		
		/// PUNTO 6
		//Ejercicio n�6: Ingresar un n�mero o tantos como quiera el usuario y revisar si es primo
		Ejercicio6RevisionPrima.RevisionPrima();
		
		/// PUNTO 7
		//Ejercicio n�7: Encontrar la suma de los primeros 10 n�meros naturales.
		Ejercicio7SumaNaturales.SumaNatural();
		
		/// PUNTO 8
		// Ejercicio n�8: Sumar (en cantidad, no acumular) cu�ntos n�meros positivos
		//ingresa un usuario. 
		Ejercicio8SumarCantidadPositivos.SumarContarPositivo();
		
		/// PUNTO 9
		//Ejercicio n�9: Revisar si un a�o es bisiesto o no.1
		Ejercicio9Bisiesto.AnioBisiesto();		
		
		/// PUNTO 10
		//Ejercicio n�10: Encontrar el valor ASCII de un car�cter.
		Ejercicio10valorASCII.ASCIIdelCaracter();
		
		/// PUNTO 11 
		// Ejercicio n�11: Multiplicar dos n�meros. 
		//float numero1 =  4.12f, numero2 =  8.36f; /// asi se declaran los float
		float resultadoMulti = Ejercicio11mutiplicar2Numeros.Multiplicar(12.5f, 45.21f);
		System.out.print("\n\nEl resultado de la multiplicacion es: "+resultadoMulti);
		
		/// PUNTO 12
		//Ejercicio n�12: Realizar un programa que le pregunte al usuario que �rea desea calcular.
		//Las opciones son: rect�ngulo, cuadrado, triangulo y circulo.
		Ejercicio12CalcularArea.CalcularArea();
		
		/// PUNTO 13
		//Ejercicio n�13: Programa que lea un nombre y muestre por pantalla:
		//�Buenos dias nombre_introducido�.
		Ejercicio13Saludar.Saludar();		
		
		/// PUNTO 14
		//Ejercicio n�14: Escribir un programa que lea un n�mero entero por teclado y obtenga
		//y muestre por pantalla el doble y el triple de ese n�mero.
		Ejercicio14TrabajarNum.DuplicarTriplicar();
		
		/// PUNTO 15
		//Ejercicio n�15: Programa que lea una cantidad de grados cent�grados y la pase a
		//grados Fahrenheit. La f�rmula correspondiente para pasar de grados cent�grados
		//a fahrenheit es:  F = 32 + ( 9 * C / 5)
		Ejercicio15CaF.CelciusaFaren();
		
		/// PUNTO 16
		//Ejercicio n�16: Programa que lea por teclado el valor del radio de una circunferencia
		//y calcula y muestra por pantalla la longitud y el �rea de la circunferencia. Investigar
		//el uso de la librer�a Math.
		//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		Ejercicio16Circunferncia.Circunferencia();
		
		/// PUNTO 17
		//Ejercicio n�17: Programa que pase una velocidad en Km/h a m/s. La velocidad se
		//lee por teclado.
		Ejercicio17KmaMs.KmaMs();
		
		/// PUNTO 18
		//Ejercicio n�18: Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo
		//y calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras.
		Ejercicio18catetos.calcular();
		
		/// PUNTO 19
		//Ejercicio n�19: Programa lea 30 temperaturas correspondientes a un mes y calcule
		//el maximo, el minimo y el promedio.
		Ejercicio19TemMes.TemperaturasMes();
		Ejercicio19TemMes.MinimoTemp();
		Ejercicio19TemMes.MaximoTemp();
		Ejercicio19TemMes.promedioTemp();
		
		/// PUNTO 20
		//Ejercicio n�20:Pide por teclado dos n�meros y genera 10 n�meros aleatorios 
		//entre esos n�meros. Usa el m�todo Math.random para generar un n�mero entero aleatorio 
		Ejercicio20Naleatorios.NumerosAleatorios();
		
		/// PUNTO 21
		//Ejercicio n�21:  Crea una aplicaci�n que nos pida un d�a de la semana y que nos
		//diga si es un d�a laboral o no. Usa un switch para ello.
		Ejercicio21DiasLaburales.DiasLaburales();
	
		/// PUNTO 22
		//Ejercicio n�22: Pide por teclado un n�mero entero positivo (debemos controlarlo)
		//y muestra  el n�mero de cifras que tiene. Por ejemplo: si introducimos 1250, nos
		//muestre que tiene 4 cifras. Tendremos que controlar si tiene una o m�s cifras, al
		//mostrar el mensaje.
		Ejercicio22contarCifras.ContarCifras();
		
		// PUNTO 23		
		//Ejercicio n�23:  Crea una aplicaci�n llamada CalculadoraPolacaInversaApp,
		//nos pedir� 2 operandos (int) y un signo aritm�tico (String), seg�n este �ltimo 
		//se realizar� la operaci�n correspondiente. Al final mostrara el resultado en un
		//cuadro de di�logo.
		//Los signos aritm�ticos disponibles son:
		//+: suma los dos operandos.
		//-: resta los operandos.
		//*: multiplica los operandos.
		// /: divide los operandos, este debe dar un resultado con decimales (double)
		//^:  1� operando como base y 2� como exponente.
		//%:  m�dulo, resto de la divisi�n entre operando1 y operando2.
		Ejercicio23Calculadora.MenuCalcu();
		
		//Ejercicio n�24: Pide por teclado el nombre, edad y salario
		//y muestra el salario. 
		//Si es menor de 16 no tiene edad para trabajar
		//Entre 19 y 50 a�os el salario es un 5 por ciento m�s
		//Entre 51 y 60 a�os el salario es un 10 por ciento m�s
		//Si es mayor de 60 el salario es un 15 por ciento m�s
		Ejercicio24edades.EdadesLaburales();
	}
}

/* **********************Documentacion******************************************************************************************************************************************
 > Programa: DivMod
 > Fecha: 04 de enero de 2022
 > Autores:
	Luis Quiñones Hernandez 
	Edgar Daniel Rodriguez Herrera
	Joel Angeles Urrutia
 > Descripción: Clase con tres metodos; el primero regresa la division de dos entero; el segundo el modulo de dos entero; y el tercero recibe un entero y regresa un caracter.
 > Datos de entrada: Sin datos de entrada.
 > Datos de salida: Sin datos de salida.
***************************************************************************************************************************************************************************** */

public class DivMod {
	
	public static int getDiv(int num, int n) {//metodo-funcion que regresa el cociente de los integers ingresados num y n
		int cociente= num/n;
		return cociente;
	}
	
	public static int getMod(int num, int n) {//metodo-funcion que regresa el modulo de los integers ingresados num y n
		int modulo= num%n;
		return modulo;
	}
	
	public static char getMod(int n) {
		
		if((n<0)||(n>=30)){
			return '@';
		}
		else{
			if((n>=0) && (n<=9)) {
				return (char)(n + 48);
			}
			else{
				return (char)(n+55);
			}
		}
	}
}

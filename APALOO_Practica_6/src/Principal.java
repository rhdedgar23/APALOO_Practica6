import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] Args) {
		preguntaNyB();
	}
	
	public static void preguntaNyB() {
		try (Scanner input = new Scanner(System.in)) {
			ArrayList <Character> c= new ArrayList <Character>();
			Convertidor convert= new Convertidor();


			System.out.println("Por favor ingresa el numero que quieres convertir: ");
			int num= input.nextInt();
			System.out.println("A que base (entre 2 y 30) quieres convertir este numero?:");
			int base= input.nextInt();

			convert.decimal_N_ario(num, base, c);
		}
	}
}

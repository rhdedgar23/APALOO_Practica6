import java.util.ArrayList;

public class Convertidor {
	
	public String decimal_N_ario(int num, int base, ArrayList<Character> c) {
		if(base<2 || base>30) {
			System.out.println("Por favor ingresa una base adecuada: ");
			Principal.preguntaNyB();
		}
		else {
			if(num<base) {
				c.add(DivMod.getMod(num));
			}
			else {
				decimal_N_ario(DivMod.getDiv(num, base), base, c);
				c.add(DivMod.getMod(DivMod.getMod(num, base)));
			}
		}
		
		return arrayToString(c);
	}
	
	public static String arrayToString(ArrayList <Character> c) {
		String string="";
		
		for(int i=0; i<c.size(); i++) {
			string= string + c.get(i).toString();
		}
		
		return string;
	}
}
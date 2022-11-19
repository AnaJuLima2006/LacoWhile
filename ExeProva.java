package lacoRepeticao;
import java.util.Scanner;
public class exeProva {

	public static void main(String[] args) {
		
		int i = 1;
		double  m, h;
		m = (53*220)/100;
		h = (47*220)/100;
		System.out.println("A porcentagem de homens é " + h + " e de mulheres é: " +  m );
		while (h<=m) {
			m = m + 0.82;
			h = h + 0.88;
			i++;
		}
		System.out.println("Para os homens ultrapassarem o número de mulheres vai demorar " + i + " anos.");

	}

}


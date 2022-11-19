package lacoRepeticao;
import  java.util.Scanner;
public class fatorialDosNumeros {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Digite o número do fatorial:");
		
		int fatorial, resultado; 
		
		fatorial = leitura.nextInt();
		resultado = 1;
			
			while (fatorial>0) {
				resultado = resultado * fatorial;
				fatorial--;
			}
			System.out.println("O resultado do fatorial é: " + resultado);

	}

}
  

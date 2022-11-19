package lacoRepeticao;
import  java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

        int i, numero, resultado; 
        
        i = 1;

        System.out.println("Digite o n�mero a ser multiplicado na opera��o: ");
        
        numero = leitura.nextInt();
        System.out.println("Tabuada do n�mero " + numero + ":");
        
        while (i<=10) {
            
            resultado = i * numero;
            System.out.println(i + "  x  " + numero + "  =  " + resultado);
            
            i++;
        }

	}

}

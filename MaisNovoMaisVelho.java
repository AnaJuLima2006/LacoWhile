package lacoRepeticao;
import java.util.Scanner;
public class maisNovoMaisVelho {

	public static void main(String[] args) {
		 Scanner leitura = new Scanner(System.in);

	        int i, id, idNovo, idVelho;
	        
	        String nome, nomeNovo, nomeVelho;
	     
	        i = 2;
	        
	        System.out.println("Escreva o nome do usuário 1:");
	        nome = leitura.next();
	        nomeNovo = nome;
	        nomeVelho = nome;
	    
	        System.out.println("Escreva a idade do usuário 1:");
	        id = leitura.nextInt();
	        idNovo = id;
	        idVelho = id;
	        while (i<=10) {
	            System.out.println("Escreva o nome do usuário " + i + ":");
	            nome = leitura.next();
	            System.out.println("Escreva a idade do usuário " + i + ":");
	            id = leitura.nextInt();
	            if (id < idNovo) {
	                nomeNovo = nome;
	                idNovo = id;
	            } else if (id > idVelho) {
	                nomeVelho = nome;
	                idVelho = id;
	            }
	            i++;
	        }
	        System.out.println("O usuário mais novo é " + nomeNovo + " com " + idNovo + " anos.");
	        System.out.println("O usuário mais velho é " + nomeVelho + " com " + idVelho + " anos.");	

	}

}

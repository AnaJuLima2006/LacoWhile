package lacoRepeticao;
import java.util.Scanner;
public class maisNovoMaisVelho {

	public static void main(String[] args) {
		 Scanner leitura = new Scanner(System.in);

	        int i, id, idNovo, idVelho;
	        
	        String nome, nomeNovo, nomeVelho;
	     
	        i = 2;
	        
	        System.out.println("Escreva o nome do usu�rio 1:");
	        nome = leitura.next();
	        nomeNovo = nome;
	        nomeVelho = nome;
	    
	        System.out.println("Escreva a idade do usu�rio 1:");
	        id = leitura.nextInt();
	        idNovo = id;
	        idVelho = id;
	        while (i<=10) {
	            System.out.println("Escreva o nome do usu�rio " + i + ":");
	            nome = leitura.next();
	            System.out.println("Escreva a idade do usu�rio " + i + ":");
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
	        System.out.println("O usu�rio mais novo � " + nomeNovo + " com " + idNovo + " anos.");
	        System.out.println("O usu�rio mais velho � " + nomeVelho + " com " + idVelho + " anos.");	

	}

}

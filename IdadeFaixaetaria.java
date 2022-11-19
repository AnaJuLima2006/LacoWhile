import java.text.DecimalFormat;
import java.util.Scanner;

public class IdadeFaixaetaria { // Exercício 2

public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("0.00");
		Scanner leitura = new Scanner(System.in);
		double idade, f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
		int  i= 1;
		
		while (i<=15) {
			System.out.println("Digite a sua idade:");
			idade = leitura.nextInt();
			if (idade<=15) {
		          f1++;
	
			}else if (idade<=30) {
			      f2++;
			      
		    }else if (idade<=45){
	              f3++;
	              
		    }else if(idade<=60){
			      f4++;
			      
		    }else{
			      f5++;
		    }
			i++;
			}
		System.out.println();
		System.out.println("Quantidade de pessoas há em cada faixa etária e sua porcentagem:");
		System.out.println("Até 15 anos: " + f1 + " | " + df.format((f1/15) * 100) + "%");
		System.out.println("De 16 a 30 anos: " + f2 + " | " + df.format((f2/15) * 100) + "%");
		System.out.println("DE 31 a 45 anos: " + f3 + " | " + df.format((f3/15) * 100) + "%");
		System.out.println("De 46 a 60 anos: " + f4 + " | " + df.format((f4/15) * 100) + "%");
		System.out.println("Acima de 61 anos: " + f5 + " | " + df.format((f5/15) * 100) + "%");
			
	}
				
}




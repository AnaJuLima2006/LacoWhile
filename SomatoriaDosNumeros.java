package lacoRepeticao;
public class somatoriaDosNumeros {
	
	public static void main(String[] args) {
		
		int i, resultado;
		
		i = 1;
		resultado = 0;
		
		System.out.println("Abaixo est� a somat�ria dos n�meros de 1 a 100: ");
		
		while (i<=100) {
			
			System.out.println(resultado + "+ " + i);
		
			resultado = resultado + i;
		
			System.out.println(resultado);
		
			i++;
		
		}
	}
}

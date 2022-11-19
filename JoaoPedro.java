package lacoRepeticao;

public class joaoPedro {
	public static void main(String[] args) {
		
		int h = 1;
		
		double pedro, joao;
		
		pedro = 145;
		joao = 134;
		
		while (joao<pedro) {
			
			pedro = pedro + 2.0;
			joao = joao + 2.5;
			h++;
		}
		System.out.println("Para o João ser mais alto do que Pedro vão demorar " + h + " anos.");
		
	}

}
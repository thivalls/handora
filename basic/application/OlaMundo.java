package application;

public class OlaMundo {
	public static void main(String[] args) {
		// System.out.println("Ola, " + args[0] +  "!!!" + " Você tem " + args[1] + " anos?");

		int[] numbers = {1, 2, 3};

		System.out.println("Atribuindo valor a posição 0 que é: " + numbers[0]);
		numbers[0] = numbers[0] + 1;
		System.out.println("novo valor é:" + numbers[0]);

		try{
			System.out.println("Tenandao atribuir um valor a um index inexistente");
			numbers[10] = 4;

			System.out.println("Esta linha não deve ser impressa");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}


		System.out.println("Imprime esta linha apenas se utilizarmos o try e o catch para tratar o erro, caso contrário a execução do programa para");
	}
}

	import java.util.Scanner;

	public class QuestOne {

	public static void main(String[] args) {
		int contador; 
		String quantidadeAsterisco;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Esse Programa cria uma escada com o simbolo '*', Digite quantos degraus você deseja que a escada tenha: ");
		contador = scanner.nextInt();
		quantidadeAsterisco = degraus(contador);

		System.out.println(quantidadeAsterisco);

	}

	public static String degraus(int contador) {

		int a;
		String escada = "";

		for (a = 1; a <= contador; a++) {
			escada += " ".repeat(contador - a) + "*".repeat(a) + "\n";
		}

		return escada;
	    }
	    

}

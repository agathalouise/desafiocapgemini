import java.util.Scanner;
import java.util.regex.Pattern;

public class QuestTwo {
public static void main(String[] args) {

	String senha;
	int valor;
	Scanner scanner = new Scanner(System.in);

	System.out.print("Esse Programa verifica se uma senha "
			+ "atende os seguintes requisitos: \n"
			+ "* m�nimo de 6 caracteres.\r\n"
			+ "* m�nimo de 1 digito.\r\n"
			+ "* m�nimo de 1 letra em min�sculo.\r\n"
			+ "* m�nimo de 1 letra em mai�sculo.\r\n"
			+ "* m�nimo de 1 caractere especial (!@#$%^&*()-+)."
			+ "\n\n"
			+ ""
			+ "Crie Sua Senha: \n");
	
	senha = scanner.next();
	valor = validaSenha(senha);

	System.out.println(valor);
}

public static Integer validaSenha(String senha) {
	int tamanho = senha.length();
	int x = 0;
	int y;
	boolean senhaMinuscula = Pattern.matches("^(?=.*[a-z]).+$", senha),
			senhaMaiuscula = Pattern.matches("^(?=.*[A-Z]).+$", senha),
			senhaDigito = Pattern.matches("^(?=.*\\d).+$", senha),
			senhaEspecial = Pattern.matches("^(?=.*[-+_!@#$%^&*.,?]).+$", senha);

	if (senhaMinuscula == false) {
		x += 1;
		System.out.println("Sua senha precisa ter uma letra minuscula");
	}
	if (senhaMaiuscula == false) {
		x += 1;
		System.out.println("Sua senha precisa ter uma letra maiuscula");
	}
	if (senhaDigito == false) {
		x += 1;
		System.out.println("Sua senha precisa ter um digito");
	}
	if (senhaEspecial == false) {
		x += 1;
		System.out.println("Sua senha precisa ter um caractere especial");
	}

	if (tamanho + x >= 6) {
		return x;
	} else {
		y = (6 - tamanho);
		return y;
	}

    }
}

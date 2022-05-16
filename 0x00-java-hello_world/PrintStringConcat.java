public class PrintStringConcat {
	public static void main(String[] args) {
		String texto1 = "Holberton";
		String texto2 = "School";
		String textConcat = texto1.concat(" ").concat(texto2);
		System.out.printf("Bem vindo a %s!\n", textConcat);
	}
}

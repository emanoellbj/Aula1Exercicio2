import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		int num1;
		System.out.println("Digite um numero: ");
		num1 = new Scanner(System.in).nextInt();

		int num2;
		System.out.println("Digite outro numero: ");
		num2 = new Scanner(System.in).nextInt();

		int soma = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}
		}
		System.out.println("A soma dos numeros pares é: " + soma);
	}
}
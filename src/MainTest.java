import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		System.out.println(comptador(0, 0));
	}

	// Activitat 1
	static int comptador(int comptadorX, int comptadorY) {
		Scanner sc = new Scanner(System.in);
		int numero, comptador = 0;

		if (comptadorX > 0 && comptadorY > 0) {
			System.out.print("Escriu un número: ");
			numero = sc.nextInt();
			if ((numero >= comptadorX) && (numero <= comptadorY)) {
				System.out.println("\tNúmero en el rang");
				comptador++;
			} else {
				System.out.println("\tNúmero fora del rang");
			}
		} else {
			comptador = -1;
		}
		sc.close();
		return comptador;
	}

}

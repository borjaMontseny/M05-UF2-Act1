import java.util.Scanner;

public class AplicacioBancaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Aplicació Bancària\n");

		System.out.print("Codi del banc (pot estar en blanc o ser un número de 3 dígits): ");
		String codiBanc = sc.nextLine();

		System.out.print("Codi de sucursal (número de 4 dígits, el primer major que 0): ");
		String codiSucursal = sc.nextLine();

		System.out.print("Número de compte (número de 5 dígits): ");
		String numCompte = sc.nextLine();

		System.out.print("Clau personal (valor alfanumèric de 5 posicions): ");
		String clauPersonal = sc.nextLine();

		System.out.print("Ordre (pot estar en blanc, 'talonari' o 'moviments'): ");
		String ordre = sc.nextLine();

		// Comprovació de les dades i resposta del programa
		if (!codiBanc.isEmpty() && (codiBanc.length() != 3 || codiBanc.charAt(0) <= '1')) {
			System.out.println("Error: Codi del banc incorrecte.");
		} else if (codiSucursal.length() != 4 || codiSucursal.charAt(0) == '0') {
			System.out.println("Error: Codi de sucursal incorrecte.");
		} else if (numCompte.length() != 5) {
			System.out.println("Error: Número de compte incorrecte.");
		} else if (clauPersonal.length() != 5) {
			System.out.println("Error: Clau personal incorrecta.");
		} else {
			if (ordre.equals("talonari")) {
				System.out.println("L'usuari rep un talonari de xecs.");
			} else if (ordre.equals("moviments")) {
				System.out.println("L'usuari rep els moviments del mes en curs.");
			} else if (ordre.isEmpty()) {
				System.out.println("L'usuari rep els dos documents.");
			} else {
				System.out.println("Error: Ordre incorrecta.");
			}
		}

		sc.close();
	}
}

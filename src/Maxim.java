import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maxim {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int x, y, z, max;

		System.out.println("Introdueix X, Y i Z: ");
		x = Integer.parseInt(entrada.readLine());
		y = Integer.parseInt(entrada.readLine());
		z = Integer.parseInt(entrada.readLine());

		if ((z > y) && (x > z)) {
			max = x;
		} else {
			if (z > y) {
				max = z;
			} else {
				max = y;
			}
		}
		System.out.println("El màxim és " + max);
	}

}

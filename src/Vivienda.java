import java.util.Random;
import java.util.Scanner;

public class Vivienda {
	Random aleatorio = new Random();
	protected int nroVivienda, nroAmbientes, cantDormitorios;
	protected String direccion;
	protected float precio, superficie;
	protected boolean amoblada;

	public Vivienda() {
		this.nroVivienda = 0;
		this.nroAmbientes = 0;
		this.cantDormitorios = 0;
		this.direccion = "";
		this.precio = 119999 + aleatorio.nextInt(30000);
		this.superficie = 0;
		this.amoblada = false;
	}

	public void cargarVivienda() {
		Scanner asd = new Scanner(System.in);
		System.out.println("Inngrese numero de vivienda");
		this.nroVivienda = asd.nextInt();
		System.out.println("Inngrese la direccion");
		this.direccion = asd.next();
		System.out.println("Inngrese numero de Ambientes");
		this.nroAmbientes = asd.nextInt();
		System.out.println("Inngrese numero de dormitorios");
		this.cantDormitorios = asd.nextInt();
		System.out.println("Inngrese la superficie");
		this.superficie = asd.nextFloat();
		int op = 0;

		do {
			System.out.println("Inngrese 0 si no este amueblado 1 si si");
			op = asd.nextInt();
			if (op != 0 && op != 1) {
				System.err.println("loco es 1 o 0");
			}
		} while (op != 0 && op != 1);
		if (op == 0) {
			this.amoblada = false;
		} else {
			this.amoblada = true;
		}
		asd.close();
	}
}
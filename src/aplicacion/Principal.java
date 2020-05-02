package aplicacion;

import java.util.Locale;
import java.util.Scanner;

import modal.entidades.Circulo;
import modal.entidades.Rectangulo;
import modal.entidades.Triangulo;
import modal.enums.Color; 

public class Principal {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
		Scanner sc = new Scanner(System.in);

		System.out.println("---Datos del Circulo---");
		Circulo fc = new Circulo(Color.BLANCO, 2.0);
		System.out.println("   *-Color :" + fc.getColor());
		System.out.println("   *-Area  :" + String.format("%.2f", fc.area()) + "\n");

		System.out.println("---Datos del Rectangulo---");
		Rectangulo fr = new Rectangulo(Color.NEGRO, 3.5, 4.0);
		System.out.println("   *-Color :" + fr.getColor());
		System.out.println("   *-Area  :" + String.format("%.2f", fr.area()) + "\n");

		System.out.println("---Datos del Triangulo---");
		Triangulo ft = new Triangulo(5.0, 6.0);
		System.out.println("   *-Area  :" + String.format("%.2f", ft.area()) + "\n");

		sc.close();
	}

}

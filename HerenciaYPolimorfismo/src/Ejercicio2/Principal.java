package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
		// Clase hija
		CC c = new CC();
		c.x = 2;
		c.y = 8;
		System.out.println(c.suma());
		System.out.println(c.dobleSuma());;
		
		// Clase padre
		CD d = new CD();
		d.x = 1;
		d.y = 3;
		System.out.println(d.suma());
		// System.out.println(d.dobleSuma()); // ERROR, la clase padre no tiene el metodo de la clase hija
		
		// 
		// CC cd = new CD(); // ERROR
		CD dc = new CC();
		dc.x = 5;
		dc.y = 3;
		System.out.println(dc.suma());
		// System.out.println(dc.dobleSuma()); // ERROR
	}

}

package Ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// 
		CA c = new CA(1,2,5);
		System.out.println(c.suma());
		System.out.println(c.mayor());
		// c.MAX = 10;
		// c.multi();
		CB b = new CB(3);
		System.out.println(b.suma());
		// b.mayor(); // No tiene el método de la clase hija
		
		CB cb = new CA(1,2,3);
		System.out.println(cb.suma());
		// System.out.println(cb.mayor()); // ERROR
		
		// CA ca = (CA) new CB(1,3,4);     ERROR
		// System.out.println(ca.mayor()); ERROR
		// System.out.println(ca.suma());  ERROR
		
		// Probamos compareTo
		CA c1 = new CA(1, 3, 2);
		CA c2 = new CA(1, 5, 2);
		System.out.println(c1.mayor());
		System.out.println(c2.mayor());
		System.out.println(c1.compareTo(c2, c1));
		System.out.println(c1.compareTo(c1, c2));
		
		CA c3 = new CA(1, 2, 3);
		System.out.println(c1.compareTo(c1, c3));
		System.out.println(c1.compareTo(c3, c1));
	}

}

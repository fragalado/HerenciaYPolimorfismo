package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// 
		// CA a = new CB(1,2,3); // ERROR
		// System.out.println(a.suma());
		
		// Correcto
		CB b = new CA(3, 4, 5);
		System.out.println(b.suma());

	}

}

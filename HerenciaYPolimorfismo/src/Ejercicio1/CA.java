package Ejercicio1;

public class CA extends CB{

	int x, y;
	
	public CA(int x, int y, int z) {
		super(z);
		this.x = x;
		this.y = y;
	}
	
	public int suma() {
		return x+ y + z;
	}
}

package Ejercicio3;

public class CA extends CB implements IC, Comparable{

	int x, y;
	
	public CA(int x, int y, int z) {
		super(z);
		this.x = x;
		this.y = y;
	}
	
	public int suma() {
		return x+ y + z;
	}

	@Override
	public int mayor() {
		// 
		int mayor = 0;
		
		if(x > mayor)
			mayor = x;
		if(y > mayor)
			mayor = y;
		if(super.z > mayor)
			mayor = super.z;
		
		return mayor;
	}

	@Override
	public int compareTo(CA uno, CA dos) {
		// 
		if(uno.mayor() > dos.mayor())
			return 1;
		else if(uno.mayor() < dos.mayor())
			return -1;
		return 0;
	}
}

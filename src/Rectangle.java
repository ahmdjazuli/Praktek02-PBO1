public class Rectangle {
	double panjang,lebar;
		
	public Rectangle() {
		panjang = 7;
		lebar   = 5;
	}
	
	public Rectangle(double panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}



	void cetakInfo() {
		System.out.println("===============================");
		System.out.println("Panjang = "+panjang);
		System.out.println("Lebar   = "+lebar);
		System.out.println("===============================");
	}
	
	double hitungLuas() {
		double luas = panjang*lebar;
		return luas;
	}
	
	void cetakLuas() {
		double luas = panjang*lebar;
		System.out.println("[2] Luas Rectangle = "+luas);
	}
}

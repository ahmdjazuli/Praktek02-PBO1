public class Rectangle {
	double panjang,lebar;
	
	// konstruktor tanpa parameter
	public Rectangle() {
		panjang = 7;
		lebar   = 5;
	}
	
	// konstruktor pake parameter
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
	
	// method dengan return
	double hitungLuas() {
		double luas = panjang*lebar;
		return luas;
	}
	
	void cetakLuas() {
		double luas2 = panjang*lebar;
		System.out.println("Luas Persegi = "+luas2);
	}
}
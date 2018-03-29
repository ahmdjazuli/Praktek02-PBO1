public class Rectangle {
	double panjang,lebar;
	
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

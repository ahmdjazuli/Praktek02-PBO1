public class RectangleAksi {
	public static void main(String[] args) {
		// instance dolo
		Rectangle persegi = new Rectangle();
		persegi.panjang = 10;
		persegi.lebar   = 5;
		
		persegi.cetakInfo();
	
		System.out.println("[1] Luas Persegi1 = "+persegi.hitungLuas()); // Method pake Return
		
		Rectangle persegi2 = new Rectangle();
		persegi2.cetakInfo(); // Konstruktor tanpa Parameter
		
		Rectangle persegi3 = new Rectangle(12,10); // Konstruktor pake Parameter
		persegi3.cetakInfo();
		persegi3.cetakLuas(); // pake method tanpa return
	}
}

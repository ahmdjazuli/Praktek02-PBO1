public class RectangleAksi {
	public static void main(String[] args) {
		// instance dolo
		Rectangle persegi = new Rectangle();
		persegi.panjang = 10;
		persegi.lebar   = 5;
		
		persegi.cetakInfo();
	
		System.out.println("[1] Luas Rectangle = "+persegi.hitungLuas()); // nilai balik
		persegi.cetakLuas(); // pake void
		
		Rectangle persegi2 = new Rectangle();
		persegi2.cetakInfo();
		
		Rectangle persegi3 = new Rectangle(12,10);
		persegi3.cetakInfo();
	}
}

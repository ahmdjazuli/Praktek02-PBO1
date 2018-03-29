public class RectangleAksi {
	public static void main(String[] args) {
		// instance dolo
		Rectangle persegi = new Rectangle();
		persegi.panjang = 10;
		persegi.lebar   = 5;
		
		persegi.cetakInfo();
	
		System.out.println("[1] Luas Rectangle = "+persegi.hitungLuas()); // nilai balik
		persegi.cetakLuas(); // pake void
	}
}

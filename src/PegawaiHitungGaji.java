public class PegawaiHitungGaji {
	public static void main(String[] args) {
		Pegawai pg1 = new Pegawai();
		pg1.nama = "Ahmad Jazuli";
		pg1.alamat = "Kompek Pangeran Antasari no.32 rt.3 rw.5";
		pg1.email = "ahmadjazuli111@gmail.com";
		
		pg1.cetakInfo(); // [1] method tanpa nilai balik(void)
		
//		System.out.println("Waktu Kerja  \t = ");
//		System.out.println("Gaji per Jam  \t = "+pg1.gajiPerJam);
//		System.out.println("Waktu Lembur  \t = "+pg1.waktuLembur);
		
		// [2] Method dengan nilai Balik(return)
		System.out.println("\n==============[Method dengan nilai Balik]==================");
		System.out.println("Gaji Pegawai \t = Rp "+pg1.hitungGaji());
		System.out.println("Lembur Pegawai \t = Rp "+pg1.hitungLembur());
		System.out.println("=============================================================");
		
		// [3] Konstruktor tanpa Parameter	
		Pegawai pg2 = new Pegawai();
		System.out.println("\n==============[Konstruktor tanpa Parameter]==================");
		System.out.println(pg2.nama);
		System.out.println(pg2.alamat);
		System.out.println("==============[Konstruktor tanpa Parameter]==================");
		
		// [3] Konstruktor tanpa Parameter	
		Pegawai pg3 = new Pegawai("julikoding@gmail.com");
		System.out.println("\n==============[Konstruktor dengan Parameter]==================");
		System.out.println(pg3.email);
		System.out.println("==============[Konstruktor dengan Parameter]==================");
	}
}

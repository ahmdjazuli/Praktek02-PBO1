public class Pegawai {
	String nama,alamat,email;
	double waktuKerja, waktuLembur, gajiPerJam, gajiLembur, gajiHasil;
	
	// [4] Konstruktor dengan Parameter
	public Pegawai(String email) {
		super();
		this.email = email;
	}

	// [3] Konstruktor tanpa Parameter	
	public Pegawai() {
		nama = "JuliKoding";
		alamat = "http://julikoding.blogspot.com";
	}

	// [1] method tanpa nilai balik(void)
	void cetakInfo() { 
		System.out.println("============== [method tanpa nilai balik] ==================");
		System.out.println("Nama Pegawai \t= "+nama);
		System.out.println("Alamat \t \t= "+alamat);
		System.out.println("Email \t \t= "+email);
		System.out.println("============== [method tanpa nilai balik] =================");
	}
	
	// [2] Method dengan nilai Balik(return)
	double hitungGaji() {
		// Waktu Lembur tiap 1 jam dapat tambahan 1/2.
		gajiPerJam = 2000;
		waktuKerja = 12;
			if(waktuKerja>10) {
				waktuLembur = (waktuKerja - 10)*1.5;
				gajiLembur = waktuLembur * gajiPerJam;
				gajiHasil = (gajiPerJam*10) + gajiLembur;
			}
		return gajiHasil;
	}
	
	double hitungLembur() {
		gajiPerJam = 2000;
		waktuKerja = 12;
		waktuLembur = (waktuKerja - 10)*1.5;
		gajiLembur = waktuLembur * gajiPerJam;
		return gajiLembur;
	}
} //end main
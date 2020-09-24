import java.util.Scanner;

	public class Soal_3 {
		public static void main(String[] args) {
			
			Scanner amd = new Scanner(System.in);
			double nilaiPraktikum;
			double nilaiAsesmenA;
			double nilaiAsesmenB;
			double nilaiAkhir;
			
			System.out.print("Masukkan nilai praktikum = ");
			nilaiPraktikum = amd.nextDouble();
			
			System.out.print("Masukkan nilai asesmen 1 = ");
			nilaiAsesmenA = amd.nextDouble();
			
			System.out.print("Masukkan nilai asesmen 2 = ");
			nilaiAsesmenB = amd.nextDouble();
			
			double presentase1 = 0.25;  //25%
			double presentase2 = 0.35;  //35%
			double presentase3 = 0.40;  //40%
			
			nilaiAkhir = (presentase1 * nilaiPraktikum) + (presentase2 * nilaiAsesmenA) + (presentase3 * nilaiAsesmenB);
			
			System.out.println("Nilai akhir Dira adalah " +nilaiAkhir);
			
	}
}
		
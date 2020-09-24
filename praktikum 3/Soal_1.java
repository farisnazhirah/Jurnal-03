import java.util.Scanner;
	
	public class Soal_1 {
		public static void main(String[] args) {
			
			Scanner userInput = new Scanner(System.in);
			
			int nilai_1;
			int pangkat;
			double hasil;
			
			System.out.print("Masukkan nilai= ");
				nilai_1 = userInput.nextInt();
			System.out.print("Masukkan nilai pangkat= ");
				pangkat = userInput.nextInt();
				
			hasil = Math.pow(nilai_1, pangkat);
			System.out.println(hasil);
			
	}
	
}
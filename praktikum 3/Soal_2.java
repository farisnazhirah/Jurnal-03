import java.util.Scanner;
	
	public class Soal_2 {
		public static void main(String[] args) {
			
			Scanner userInput = new Scanner(System.in);
			
			String mataKuliah;
			int jamBelajar;
			
			System.out.print("Mata kuliahnya apa? ");
				mataKuliah = userInput.nextLine();
			System.out.print("Berapa lama jam belajarnya? ");
				jamBelajar = userInput.nextInt();
				
			int hasil = 2*jamBelajar;
			
			System.out.println("Aku suka kuliah "+mataKuliah+ ".");
			System.out.println("Kuliah "+jamBelajar+ " jam per minggu rasanya kurang.");
			System.out.println("Tambahin dong jadi "+hasil+ " jam per minggu :) ");
	}
	
}
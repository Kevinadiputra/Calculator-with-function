import java.io.*;
import java.util.*;

public class Kalkulator_dan_Fungsi {
	static boolean isRunning = true;
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader input = new BufferedReader(inputStreamReader);

	static void showMenu() throws IOException {
		System.out.println("========= MENU ==========");
		System.out.println("[1] Pertambahan");
		System.out.println("[2] pengurangan");
		System.out.println("[3] perkalian");
		System.out.println("[4] pembagian");
		System.out.println("[5] modulus");
		System.out.println("[6] Exit");
		System.out.println("CHOICE MENU: ");

		int operationSelect = Integer.valueOf(input.readLine());

		switch(operationSelect) {
		case 1:
			pertambahan();
			break;
		case 2:
			pengurangan();	
			break;
		case 3:
			perkalian();	
			break;
		case 4:
			pembagian();	
			break;
		case 5:
			modulus();	
			break;
		case 6:
			System.out.println("THANK YOU !!!");
			System.exit(0);	
			break;	
		default:
			System.out.println("Pilihan Salah !!!!");				
		}
	}
	static void pertambahan () throws IOException{
		System.out.println("Masukkan Angkka pertama: ");
		double angka1 = Double.parseDouble(input.readLine());
		System.out.println("Masukkan angka kedua: ");
		double angka2 = Double.parseDouble(input.readLine());
		double hasil = angka1 + angka2;
		System.out.println("Hasil Perhitungan: " + hasil);
	}
	static void pengurangan () throws IOException{
		System.out.println("Masukkan Angkka pertama: ");
		double angka1 = Double.parseDouble(input.readLine());
		System.out.println("Masukkan angka kedua: ");
		double angka2 = Double.parseDouble(input.readLine());
		double hasil = angka1 - angka2;	
		System.out.println("Hasil Perhitungan: " + hasil);
	}
	static void perkalian () throws IOException{
		System.out.println("Masukkan Angkka pertama: ");
		double angka1 = Double.parseDouble(input.readLine());
		System.out.println("Masukkan angka kedua: ");
		double angka2 = Double.parseDouble(input.readLine());
		double hasil = angka1 * angka2;	
		System.out.println("Hasil Perhitungan: " + hasil);
	}
	static void pembagian () throws IOException{
		System.out.println("Masukkan Angkka pertama: ");
		double angka1 = Double.parseDouble(input.readLine());
		System.out.println("Masukkan angka kedua: ");
		double angka2 = Double.parseDouble(input.readLine());
		if(angka1==0) {
			System.out.println("Pembagian dengan nol tidak dapat dilakukkan !!!");
		}else{
			double hasil = angka1 / angka2;
			System.out.println("Hasil Perhitungan: " + hasil);
		}
	}
	static void modulus () throws IOException{
		System.out.println("Masukkan Angkka pertama: ");
		double angka1 = Double.parseDouble(input.readLine());
		System.out.println("Masukkan angka kedua: ");
		double angka2 = Double.parseDouble(input.readLine());
		double hasil = angka1 % angka2;	
		System.out.println("Hasil Perhitungan: " + hasil);
	}
	public static void main(String[] args) throws IOException {
		do{
			showMenu();
		}while(isRunning);
	}
}
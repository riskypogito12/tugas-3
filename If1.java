/*
Nim : 13020220069 
Nama : La Ode Muhammad Risky Syiam Wahid
Hari/Tanggal : Rabu, 13 Maret 2024
Waktu Pengerjaan : 17:34
*/

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */ 

import java.util.Scanner;

public class If1 {

/**
 * @param args
 */
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */ 
	Scanner masukan=new Scanner(System.in);
	int a;
	/* Program */

	System.out.print ("Contoh IF satu kasus \n"); 
	System.out.print ("Ketikkan suatu nilai integer : "); 
	a = masukan.nextInt();
	if (a >= 0)
	System.out.print ("\nNilai a positif "+ a); 
}
}
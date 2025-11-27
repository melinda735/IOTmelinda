package SOAL;
import java.util.Scanner;
public class Tugas_4_individu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama siswa(amir, pida, aziza, gaby):");
        String nama = input.nextLine(). toLowerCase();

        if (nama.equals("amir")) {
            System.out.println("ketua kelas.");
        } else if (nama.equals("pida")) {
            System.out.println("wakil ketua kelas.");
        } else if (nama.equals("aziza")) {
            System.out.println("sekertaris.");
        } else if (nama.equals("gaby")) {
            System.out.println("bendahara.");
        } else {
            System.out.println("nama siswa tidak ada.");
        }
    }
}
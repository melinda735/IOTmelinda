package SOAL;
import java.util.Scanner;
public class Tugas_3_KondisiCuaca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan kondisi cuaca (cerah, hujan, berawan, badai, kabut):");
        String cuaca = input.nextLine(). toLowerCase();

        if (cuaca.equals("hujan")) {
            System.out.println("Cuaca hujan  Bawa payung.");
        } else if (cuaca.equals("cerah")) {
            System.out.println("Cuaca cerah  Cocok untuk jalan-jalan.");
        } else if (cuaca.equals("berawan")) {
            System.out.println("Cuaca berawan  Hati-hati, bisa jadi hujan.");
        } else if (cuaca.equals("badai")) {
            System.out.println("Cuaca badai  Lebih baik tetap di rumah.");
        } else if (cuaca.equals("kabut")) {
            System.out.println("Cuaca berkabut  Berkendara harus hati-hati.");
        } else {
            System.out.println("Kondisi cuaca tidak ada.");
        }
    }
}
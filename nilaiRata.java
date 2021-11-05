import java.util.Scanner;

/**
 * nilaiRata
 */
public class nilaiRata {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    float nilai1, nilai2, nilai3,nilai4, nilaiRata;
    
    System.out.println("Thalita Saniyya Aqilla Putri");
    System.out.println("Kelas TI-3F");
    
    System.out.print("Masukkan Nilai Ke-1: " );
    nilai1= sc.nextFloat();
    System.out.print("Masukkan Nilai Ke-2: " );
    nilai2= sc.nextFloat();
    System.out.print("Masukkan Nilai Ke-3: " );
    nilai3= sc.nextFloat();
    System.out.print("Masukkan Nilai ke-4: " );
    nilai4 = sc.nextFloat();

    nilaiRata= ((nilai1+nilai2+nilai3+nilai4)/4f);

    System.out.println("Nilai Rata anda = " +nilaiRata );
    }
}
import java.util.Scanner;

public class no4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;

        System.out.println("Masukkan 10 karakter:");

        for (int i = 0; i < 10; i++) {
            String teks = scanner.nextLine();

            if (teks.length() == 5) {
                a++;
            }

        }
        System.out.println("Jumlah teks yang berisi  5 karakter: " + a);
    }
    
}

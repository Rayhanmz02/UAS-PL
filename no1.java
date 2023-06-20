import java.util.Scanner;
// nomor 1
public class no1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jumlah elemen array: ");
            int n = scanner.nextInt();

            if (n < 1) {
                System.out.println("Array kosong!");
                return;
            }

            int[] array = new int[n];
            System.out.println("input elemen-elemen array:");

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Indeks elemen-elemen yang merupakan kelipatan 5:");

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }






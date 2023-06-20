import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;

        System.out.println("Masukkan 10 angka:");
        int[] array = new int[n];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();

            if (array[i] % 5 == 0) {
                a++;
            }
        }

        System.out.println("Jumlah angka yang merupakan kelipatan 5: " + a);
    }
    
}

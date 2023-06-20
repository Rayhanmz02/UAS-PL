import java.util.Scanner;

public class no9 {
      public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           
           System.out.println("inputkan panjang array : ");
           int n = scanner.nextInt();
           
            System.out.println("inputkan angka : ");
           
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int indeksTerbesar = cariIndeksTerbesarKelipatanLima(array);

            if (indeksTerbesar == -1) {
                System.out.println("Tidak ditemukan angka kelipatan 5.");
            } else {
                System.out.println("Indeks angka terbesar kelipatan 5: adalah indeks ke-" + indeksTerbesar);
            }
        }

        public static int cariIndeksTerbesarKelipatanLima(int[] array) {
            int indeksTerbesar = -1;
            int maxKelipatanLima = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 5 == 0 && array[i] > maxKelipatanLima) {
                    maxKelipatanLima = array[i];
                    indeksTerbesar = i;
                }
            }

            return indeksTerbesar;
        }
    }

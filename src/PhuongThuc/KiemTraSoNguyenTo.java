package PhuongThuc;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Các số nguyên tố nhỏ hơn 10000 là: ");
        for (int i = 0; i < 10000; i++) {
            if (kiemtrasonguyen(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean kiemtrasonguyen(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

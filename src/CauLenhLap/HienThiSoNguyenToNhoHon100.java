package CauLenhLap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
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





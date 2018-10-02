package LenhDieuKien;

import java.util.Scanner;

public class UngDungXoSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery = 9, guessDigit1,guessDigit2;
        System.out.println("nhap vao so dau tien:");
        guessDigit1 = scanner.nextInt();
        System.out.println("nhap vao so cuoi:");
        guessDigit2 = scanner.nextInt();
        int ketQua = guessDigit1*10+guessDigit2;
        System.out.println("in ra ket qua la:"+ketQua);
        if(ketQua==lottery){
            System.out.println();
        }
    }
}

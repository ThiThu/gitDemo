package Mang;

import java.util.Scanner;

public class DaoNguoc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] PHANTU;
        int phantu;
        do {
            System.out.println(" nhap so phantu:");
            phantu = scanner.nextInt();
            if (phantu > 20)
                System.out.println(" phantu k vuot qua 20 ");
        } while (phantu > 20);
        PHANTU = new int[phantu];
        int i = 0;
        while (i < PHANTU.length) {
            System.out.println(" nhap phan tu thu : " + (i + 1));
            PHANTU[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("danh sach phantu : " + phantu);
        for ( int j = 0; j < PHANTU.length/2; j++) {
            int daonguoc = PHANTU[j];
            PHANTU[j] = PHANTU[phantu-1-j];
            PHANTU[phantu-1-j] = daonguoc;
        }
        System.out.println("mang sau khi dao nguoc la : ");
        for (int j = 0; j < PHANTU.length; j++) {
            System.out.print(PHANTU[j] + "\t");
        }
    }
}




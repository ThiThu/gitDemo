package Mang;

import java.util.Scanner;

public class TimGiaTriTrongMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Ly", "Quy", "Tam", "Hoa", "Huong"};
        System.out.println("Nhap ten Sv:");
        String SinhVien = scanner.nextLine();
        Boolean ten = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(SinhVien)) {
                System.out.println("ten thu i:" + SinhVien + " : " + (i + 1));
                ten = true;
                break;
            }

        }
       if (!ten)
           System.out.println("khong tim thay:" + SinhVien + ".");
    }
}





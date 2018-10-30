package Mang;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] gia_tri;
        do {
            System.out.print("Nhap do dai mang");
            n = scanner.nextInt();
            if (n > 30)
                System.out.println("Do dai mang khong vuot qua 30");
        } while (n> 30);
        gia_tri = new int[n];
        int i = 0;
        while (i < gia_tri.length) {
            System.out.print("Nhap gia tri cua phan tu thu " + (i + 1) + ": ");
            gia_tri[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("in danh sach diem: ");
        for (int j = 0; j < gia_tri.length; j++) {
            System.out.print(gia_tri[j] + ":");
            if (gia_tri[j] >= 5 && gia_tri[j] <= 10)
                count++;
        }
        System.out.print("So luong sinh vien do trong ki thi " + count);
    }
}



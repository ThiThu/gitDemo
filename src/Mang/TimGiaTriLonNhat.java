package Mang;

import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] giaTri;
        do {//kiem tra gia tri nhap vao toi da 20 gtri
            System.out.println("nhap do dai mang:");
            n = scanner.nextInt();
            if (n > 20){
                System.out.println("Do dai mang khong duoc qua 20");
            }
        } while (n > 20);
        giaTri = new int[n];//gán tham chiếu
        int i = 0;
        while (i < giaTri.length) {
            System.out.print("nhap phan tu thu " + (i + 1) + ":");
            giaTri[i] = scanner.nextInt();
            i++;
        }
        System.out.println("in ra danh sach tai san:");
        for (int j = 0; j <= giaTri.length; j++) {
            System.out.println(giaTri[j]);
        }
        int max = giaTri[0];
//gia_tri_phan_tu_ban_dau 0;
        for (int j = 0; j < giaTri.length; j++) {
            if (giaTri[j] > max) {
                max = giaTri[j];
            }
        }
        System.out.println("nhap gia tri lon nhat:" +max);
    }

}







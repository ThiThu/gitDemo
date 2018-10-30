package Mang;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[]{1,5,3,7};
        System.out.println("nhap phan tu mang:");
        int giaTri = scanner.nextInt();
        for (int i = 0 ;i < array.length; i++) {
            if (giaTri== array[i]){
                System.out.println("found");
                break;
            }else
                System.out.println ("notfound");
            break;
        }
    }
}

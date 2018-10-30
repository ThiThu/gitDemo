package Mang;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;  //nhap mang
        System.out.println("nhap so phan tu mang");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("nhap gia tri tung phan tu cua mang");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=");//hien thi ra a1,a2=...
            a[i] = scanner.nextInt();
        }
        System.out.println("mang a vua nhap");
        {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i] + " ");

            }
        }
        int m = 0;
        System.out.println("nhap so phan tu mang b");
        m = scanner.nextInt();
        int[] b = new int[m];
        System.out.println("nhap so phan tung mang");

        for (int j = 0; j < b.length; j++) {
            System.out.println("b[" + j + "]=");
            b[j] = scanner.nextInt();


        }
        System.out.println("mang B vua nhap");
        {
            for (int j = 0; j < b.length; j++) {
                System.out.println(b[j] + " ");
            }
        }
        int i = 0, j = 0;
        int[] c = new int[a.length + b.length];//thuc hien tron 2 mang
        for (int k = 0; k < c.length; k++) {

            System.out.println("tron 2 mang A+B:"+k+" ");


        }

    }
}


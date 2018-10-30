package PhuongThuc;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doF;
        double doC;
        int nhietDo;
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

        } while (choice < 0 || choice > 2);//dung thi nhap lai do,sai thi thoat
        switch (choice) {
            case 1:
                System.out.println("chuyen tu do Fsang do C");
                System.out.println("Nhap do F: ");
                doF = scanner.nextInt();
                System.out.println("C = " + doFSangDoC(doF));
                break;
            case 2:
                System.out.println("chuyen tu do C sang do F");
                System.out.println("nhap do C:");
                doC = scanner.nextInt();
                System.out.println(" F = " + doCSangDoC(doC));
                break;
            case 0:
                System.exit(0);//lenh ket thuc chuong trinh
        }
    }
    public static double doFSangDoC(double doF){
        return (5.0 / 9) * (doF- 32);
    }
    public static double doCSangDoC(double doC){
        return (9.0 / 5) * doC + 32;
    }
}



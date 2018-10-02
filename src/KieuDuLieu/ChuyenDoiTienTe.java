package KieuDuLieu;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main (String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien usd:");
        usd = scanner.nextDouble();
        double quidoi_vnd = usd * 23000;
        System.out.println("Gia tien vnd:" +quidoi_vnd);




    }
}


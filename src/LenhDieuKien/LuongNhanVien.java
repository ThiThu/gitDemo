package LenhDieuKien;

import java.util.Scanner;

public class LuongNhanVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float heSoLuong;
        float so_nam;
        float luong_thang;
        System.out.println("nhap he so luong vao: ");
       heSoLuong = scanner.nextFloat();
        System.out.println("nhap so nam vao: ");
        so_nam = scanner.nextFloat();
        luong_thang = heSoLuong*4000000 + so_nam* 500000;
        System.out.println("luong thang la:" +luong_thang );
        if(heSoLuong<=5){
            System.out.println("luong thang hop le");
        }else {
            System.out.println("luong thang khong hop le" );
        }

    }
}

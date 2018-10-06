package LenhDieuKien;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] age){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap thang :");
        int thang;
        thang = scanner.nextInt();
        switch ( thang ){
            case 2:
                System.out.println(" tháng có 28 hoặc 29 ngày");break;
            case 1:
                System.out.println(" tháng có 31 ngày");break;
            case 3:
                System.out.println(" tháng có 31 ngày");break;
            case 5:
                System.out.println(" tháng có 31 ngày");break;
            case 7:
                System.out.println(" tháng có 31 ngày");break;
            case 8:
                System.out.println(" tháng có 31 ngày");break;
            case 10:
                System.out.println(" tháng có 31 ngày");break;
            case 12:
                System.out.println(" tháng có 31 ngày");break;
            case 4:
                System.out.println(" tháng có 30 ngày");break;
            case 6:
                System.out.println(" tháng có 30 ngày");break;
            case 9:
                System.out.println(" tháng có 30 ngày");break;
            case 11:
                System.out.println(" tháng có 30 ngày");break;
            default:
                System.out.println(" tháng k hợp lệ");break;
        }
    }
}






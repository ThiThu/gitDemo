package LenhDieuKien;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main (String[] age){
        String ket_qua ;
        double chieuCao;
        double canNang;
        double chiSoBMI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap can nang:");
        canNang = scanner.nextDouble();
        System.out.println("Nhap chieu cao:");
        chieuCao = scanner.nextDouble();
        chiSoBMI = canNang / (chieuCao * chieuCao);
        System.out.println("Chỉ số BMI là:" +chiSoBMI );
        if (chiSoBMI <= 18) {
            ket_qua = "Bạn là người gầy!";
        } else if ( chiSoBMI <25) {
            ket_qua  = "Bạn là thiếu cân";
        } else if (chiSoBMI < 30) {
            ket_qua   = "Bạn bị thừa cân";
        } else {
            ket_qua   = "Bạn bị mập ";
        }
        System.out.println(ket_qua);
    }



}

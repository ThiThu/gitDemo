package LenhDieuKien;

import java.util.Scanner;

public class UngDungXoSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery = 18;
        int guessDigit1;
        int guessDigit2;
        System.out.println("nhap vao so dau tien:");
        guessDigit1 = scanner.nextInt();
        System.out.println("nhap vao so cuoi:");
        guessDigit2 = scanner.nextInt();
        int ketQua = guessDigit1 * 10 + guessDigit2;
        System.out.println("in kq" + ketQua);
        int soDau = lottery / 10;
        int soCuoi = lottery % 10;
        int soSauKhiDao = soCuoi * 10 + soDau;
        System.out.println("ngc lai" + soSauKhiDao);
        if (lottery == ketQua) {
            System.out.println("phần thưởng sẽ là $10,000");
        } else
            if (lottery == soSauKhiDao) {
                System.out.println("phần thưởng sẽ là $3,000");
            }else if(guessDigit1==soDau||guessDigit2==soCuoi) {
                System.out.println(" phần thưởng sẽ là $1,000");
            } else {
                System.out.println("không nhận giải tiếp theo nữa");
            }
        }
        }




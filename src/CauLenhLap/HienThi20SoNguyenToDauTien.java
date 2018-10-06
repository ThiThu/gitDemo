package CauLenhLap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =2;
        int demSoNguyenTo= 0;
        while (demSoNguyenTo<20){
            for (int i = 2; i <number -1 ; i++) {
                if (number%i ==0){
                    number++;
                    i=2;
                }

            }
            System.out.println(number + " ");
            demSoNguyenTo++;
            number++;
        }
        }
    }
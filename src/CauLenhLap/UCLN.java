package CauLenhLap;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("nhap so nguyen duong a la:");
        a = scanner.nextInt();

        System.out.println("nhap so nguyen duong b la:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a ==0 || b==0);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN:" +a);
    }

}


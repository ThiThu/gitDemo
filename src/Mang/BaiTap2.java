package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int mang [] = new int[]{2,5,7,3};
            int mangSaoChep[];
            mangSaoChep= Arrays.copyOf(mang, mang.length);
            System.out.println(Arrays.toString(mangSaoChep));
            mangSaoChep = Arrays.copyOfRange(mang, mang.length-2,mang.length);
            System.out.println(Arrays.toString(mangSaoChep));

        }


    }


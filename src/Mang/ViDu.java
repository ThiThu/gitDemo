package Mang;

public class ViDu {
    public static void main(String[] args) {
//        int[][] dragonBall = {{3, 5, 8, 2}, {4, 1, 6, 2}, {4, 9, 10, 15}};
//        System.out.println(dragonBall[0][2]);
//        System.out.println(dragonBall[1][2]);
//        System.out.println(dragonBall[2][2]);
//        System.out.println("tổng trung bình của phim=" + ((dragonBall[0][2] + dragonBall[1][2] + dragonBall[2][2])) / 3);
//        //cách 2
//        int sum = 0;
//        for (int i = 0; i < dragonBall.length; i++) {
//            sum += dragonBall[i][2];
//        }
//        System.out.println(sum);
//        System.out.println(sum / dragonBall.length);
//        //in ra mảng đó
//        for (int j = 0; j < dragonBall.length; j++) {
//            for (int k = 0; k < dragonBall[j].length; k++) {
//                System.out.print(dragonBall[j][k] + " ");
//            }
//            System.out.println();
//        }
//        //tổng 2 đường chéo
        int sum1 = 0;
        int[][] maTran = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        for (int i = 0; i < maTran.length; i++) {
            for(int j = 0 ; j< maTran.length; j++){
                if(i == j){
                    sum1 = sum1 + maTran[i][j];
                }
            }

        }
        int sum2 = 0;

        for(int k = 0; k <maTran.length;k++){
            sum2 = sum2+ maTran[k][maTran.length - k  -1 ];
        }
        System.out.println( "sum1 " + sum1);
        System.out.println("sum2 " + sum2);
        int sum =0;
        for (int h = 0; h <maTran.length ; h++) {
            sum=sum1+sum2;

        }
        System.out.println("tổng 2 đường chéo "+sum);
    }
}

//        System.out.println("tổng đường chéo 1:"+sum1);
//
//
//
//                int sum2 = 0;
//                int [][] tongDuongCheoThu2={{1,2,3},{4,5,6},{7,8,9}};
//                for(int k = 0; k <tongDuongCheoThu2 .length; k++){
//                    for (int h = 0; h < tongDuongCheoThu2[0].length; h--) {
//                        sum2= sum2+tongDuongCheoThu2[k][k];
//                    }
//                }
//        System.out.println("tổng đường chéo thứ hai"+sum2);
//                }
//
//
//        }






